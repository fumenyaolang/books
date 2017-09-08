package com.fmyl.books.handler.model;


import org.json.JSONObject;

/**
 * Created by fuzq on 17/9/7.
 */
public class Book {
    private String name;
    private String author;
    private String intro;
    private String indexPath;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getIndexPath() {
        return indexPath;
    }

    public void setIndexPath(String indexPath) {
        this.indexPath = indexPath;
    }

    @Override
    public String toString() {
        JSONObject jo = new JSONObject();
        jo.append("name", name);
        jo.append("author", author);
        jo.append("intro", intro);
        jo.append("indexPath", indexPath);
        return jo.toString();
    }
}
