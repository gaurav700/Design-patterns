package com.pm.impl;

import com.pm.Message;
import com.pm.MessageSender;

public class TextMessage extends Message {

    public TextMessage(MessageSender messageSender, String content) {
        super(messageSender, content);
    }

    @Override
    public void send() {
        messageSender.sendMessage(content);
    }
}
