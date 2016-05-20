package com.example.user.projectnineparsingjson.model;


public class Friend {
    private int mId;
    private String mName;

    public Friend(int id, String name) {
        this.mId = id;
        this.mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "id=" + mId +
                ", name='" + mName + '\'' +
                '}';
    }
}
