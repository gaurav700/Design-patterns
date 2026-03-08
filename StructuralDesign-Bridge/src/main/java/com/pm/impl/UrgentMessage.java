package com.pm.impl;

import com.pm.Message;
import com.pm.MessageSender;

public class UrgentMessage extends Message {
    public UrgentMessage(MessageSender messageSender, String content) {
        super(messageSender, content);
    }

    @Override
    public void send() {
        messageSender.sendMessage("[URGENT] "+content);
    }
}
