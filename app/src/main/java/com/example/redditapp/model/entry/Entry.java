package com.example.redditapp.model.entry;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;

@Root(name = "entry", strict = false)
public class Entry implements Serializable {

    @Element(name = "content")
    private String content;

    @Element(required = false,name = "author")
    private Author author;

    @Element(name = "id")
    private String id;

    @Element(name = "title")
    private String title;

    @Element(required = false, name = "updated")
    private String updated;

    public Entry() {
    }
    public Entry(String content, Author author, String title, String updates) {
        this.content = content;
        this.author = author;
        this.title = title;
        this.updated = updates;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpdates() {
        return updated;
    }

    public void setUpdates(String updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "\n\nEntry{" +
                "content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", updates='" + updated + '\'' +
                '}' + "\n" +
                "--------------------------------------------------------------------------------------------------------- \n";
    }
}
