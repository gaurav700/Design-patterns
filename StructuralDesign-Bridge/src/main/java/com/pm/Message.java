package com.pm;

public abstract class Message {
    protected MessageSender messageSender;
    protected String content;

    public Message(MessageSender messageSender, String content) {
        this.messageSender = messageSender;
        this.content = content;
    }

    public abstract void send();
}
