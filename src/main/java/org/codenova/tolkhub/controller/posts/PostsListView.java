package org.codenova.tolkhub.controller.posts;

import com.mysql.cj.Session;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.codenova.tolkhub.model.deo.PostsDAO;
import org.codenova.tolkhub.model.deo.PostsLikeDAO;
import org.codenova.tolkhub.model.vo.Posts;
import org.codenova.tolkhub.model.vo.PostsLikes;
import org.codenova.tolkhub.model.vo.User;

import java.io.IOException;
import java.util.List;

@WebServlet("/posts-list-view")
public class PostsListView extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));

        if(req.getSession().getAttribute("user") == null){
            req.getSession().setAttribute("callback", req.getContextPath()+"/posts-list-view?id=" + id);
            resp.sendRedirect(req.getContextPath() + "/login");
            return;
        }

        PostsDAO.updateViews(id);

        User user = (User) req.getSession().getAttribute("user");
        List<PostsLikes> list = PostsLikeDAO.likesList(user.getId());

        boolean like = false;
        for (PostsLikes likes : list) {
            if (likes.getPostsId() == id) {
                like = true;

            }
        }

        Posts posts = PostsDAO.selectById(id);

        if (posts != null) {
            req.setAttribute("like", like);
            req.setAttribute("posts", posts);
            req.getRequestDispatcher("WEB-INF/views/posts/posts-list-view.jsp").forward(req, resp);
        }else{
            req.getRequestDispatcher("WEB-INF/views/posts/posts-list-view-fail.jsp").forward(req, resp);
        }
    }
}
