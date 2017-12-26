package com.brefft.entity;

import com.stfalcon.chatkit.commons.models.IMessage;

import java.util.Date;

/**
 * Created by jubriloyesiji on 12/25/17.
 */

public class Message implements IMessage {
    private String id;
    private String text;
    private Author author;
    private Date createdAt;

    public void setId(String id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public Author getUser() {
        return author;
    }

    @Override
    public Date getCreatedAt() {
        return createdAt;
    }




}
