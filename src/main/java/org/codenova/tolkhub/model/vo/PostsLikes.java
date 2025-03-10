package org.codenova.tolkhub.model.vo;

import lombok.*;


@Builder

public class PostsLikes {
    private int id;
    private String userId;
    private int postsId;

    public PostsLikes() {
    }

    public PostsLikes(int id, String userId, int postsId) {
        this.id = id;
        this.userId = userId;
        this.postsId = postsId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getPostsId() {
        return postsId;
    }

    public void setPostsId(int postsId) {
        this.postsId = postsId;
    }
}
