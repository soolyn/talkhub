package org.codenova.tolkhub.controller.posts;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.codenova.tolkhub.model.deo.PostsDAO;
import org.codenova.tolkhub.model.vo.Posts;

import java.io.IOException;

@WebServlet("/posts-like-proceed")
public class PostsLikeProceed extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));

        boolean like = PostsDAO.updatelikes(id);

        if(like){
            if(req.getSession().getAttribute("user") == null){
                req.getSession().setAttribute("callback", req.getContextPath()+"/posts-list-view?id=" + id);
                resp.sendRedirect(req.getContextPath() + "/login");
                return;
            }

            Posts posts = PostsDAO.selectById(id);

            if (posts != null) {
                req.setAttribute("posts", posts);
                req.setAttribute("like", PostsDAO.updatelikes(id));
                req.getRequestDispatcher("WEB-INF/views/posts/posts-list-view.jsp").forward(req,resp);
            }else{
                req.getRequestDispatcher("WEB-INF/views/posts/posts-list-view-fail.jsp").forward(req, resp);
            }
        }

    }
}
