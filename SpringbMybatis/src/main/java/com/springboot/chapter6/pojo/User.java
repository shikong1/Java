package com.springboot.chapter6.pojo;

import org.apache.ibatis.type.Alias;

@Alias("user")
public class User {
    private long id;
    private String userName;
    private String note;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
