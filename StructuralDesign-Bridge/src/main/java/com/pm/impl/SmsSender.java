package com.pm.impl;

import com.pm.MessageSender;

public class SmsSender implements MessageSender {
    @Override
    public void sendMessage(String content) {
        System.out.println("SMS: " + content);
    }
}
