package com.example.asif.androidclient.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Asifadam93 on 16/06/2017.
 */

public class TokenResponse {

    @SerializedName("id")
    private int id;
    @SerializedName("value")
    private String token;
    @SerializedName("created_at")
    private String createdTime;
    @SerializedName("user")
    UserResponse userList;

    public int getId() {
        return id;
    }

    public String getToken() {
        return token;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public UserResponse getUserList() {
        return userList;
    }

    @Override
    public String toString() {
        return "TokenResponse{" +
                "id=" + id +
                ", token='" + token + '\'' +
                ", createdTime='" + createdTime + '\'' +
                '}';
    }
}
