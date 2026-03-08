package com.pm.impl;

import com.pm.MessageSender;

public class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String content) {
        System.out.println("Email: " + content);
    }
}
