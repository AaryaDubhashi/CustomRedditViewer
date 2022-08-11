package com.example.redditapp;

import android.widget.ImageView;

import org.unbescape.html.HtmlEscape;
import org.unbescape.java.JavaEscape;

public class Post {

    private String title;
    private String author;
    private String data_updated;
    private String postURL;
    private String thumbnailURL;

    public Post(String title, String author, String data_updated, String postURL, String thumbnailURL) {
        this.title = title;
        this.author = author;
        this.data_updated = data_updated;
        this.postURL = postURL;
        this.thumbnailURL = HtmlEscape.unescapeHtml(thumbnailURL);

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getData_updated() {
        return data_updated;
    }

    public void setData_updated(String data_updated) {
        this.data_updated = data_updated;
    }

    public String getPostURL() {
        return postURL;
    }

    public void setPostURL(String postURL) {
        this.postURL = postURL;
    }

    public String getThumbnailURL() {
        return thumbnailURL;
    }

    public void setThumbnailURL(String thumbnailURL) {
        this.thumbnailURL = thumbnailURL;
    }
}
