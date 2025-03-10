package org.codenova.tolkhub.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

public class Posts {
    private int id;
    private String writerId;
    private String category;
    private String title;
    private String content;
    private int views;
    private int likes;
    private Date writedAt;
    private Date modifiedAt;

    public Posts() {
    }

    public Posts(int id, String writerId, String category, String title, String content, int views, int likes, Date writedAt, Date modifiedAt) {
        this.id = id;
        this.writerId = writerId;
        this.category = category;
        this.title = title;
        this.content = content;
        this.views = views;
        this.likes = likes;
        this.writedAt = writedAt;
        this.modifiedAt = modifiedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWriterId() {
        return writerId;
    }

    public void setWriterId(String writerId) {
        this.writerId = writerId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Date getWritedAt() {
        return writedAt;
    }

    public void setWritedAt(Date writedAt) {
        this.writedAt = writedAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
