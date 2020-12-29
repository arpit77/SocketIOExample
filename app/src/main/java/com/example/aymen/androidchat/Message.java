package com.example.aymen.androidchat;

/**
 * Created by Aymen on 08/06/2018.
 */

public class Message {

    private String nickname;
    private String message ;
    private String groupId;

    public  Message(String nickname, String message, String groupId){
        this.nickname = nickname;
        this.message = message;
        this.groupId=groupId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
