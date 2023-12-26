package com.codreal.chatservice.model;

import java.util.Date;

public class Message {

    private String senderEmail;
    private Date time = new Date(System.currentTimeMillis());
    private String replyMessage;


    public Message() {
    }

    public Message(String senderEmail, Date time, String replymessage) {
        this.senderEmail = senderEmail;
        this.time = time;
        this.replyMessage = replymessage;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getReplymessage() {
        return replyMessage;
    }

    public void setReplymessage(String replymessage) {
        this.replyMessage = replymessage;
    }

}
