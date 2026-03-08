package com.pm;

import com.pm.impl.EmailSender;
import com.pm.impl.SmsSender;
import com.pm.impl.TextMessage;
import com.pm.impl.UrgentMessage;

/**
 * TIP The Bridge Design Pattern is a structural pattern that lets you decouple an abstraction from its implementation, allowing the two to vary independently.
 * <br>Problem: You are building a messaging system. Messages come in different types (TextMessage, UrgentMessage) and can be sent through different channels (EmailSender, SmsSender). Use Bridge to separate message types from sending mechanisms.
 * <br>Requirements: <br>
 * Implementor: MessageSender with sendMessage(content: String)<br>
 * ConcreteImplementors: EmailSender (prints "Email: ..."), SmsSender (prints "SMS: ...")<br>
 * Abstraction: Message with a reference to MessageSender and a method send()<br>
 * RefinedAbstractions: TextMessage (sends content as-is), UrgentMessage (prefixes content with "[URGENT] ")<br>
 */
public class Main {
    public static void main(String[] args) {
        MessageSender email = new EmailSender();
         MessageSender sms = new SmsSender();
         Message m1 = new TextMessage(email, "Hello there");
         Message m2 = new UrgentMessage(sms, "Server is down");
         m1.send();
         m2.send();
    }
}