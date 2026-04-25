package com.example.whatsappbot.service;

//import org.springframework.stereotype.Service;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Service
//public class ChatbotService {
//
//    private final Map<String, String> responses = new HashMap<>();
//
//    public ChatbotService() {
//
//        responses.put("hi", "Hello! How can I help you today?");
//        responses.put("bye", "Goodbye! Have a great day!");
//    }
//
//    public String getReply(String messageText) {
//        if (messageText == null) return "I didn't catch that.";
//
//        String cleanText = messageText.toLowerCase().trim();
//        return responses.getOrDefault(cleanText, "I'm sorry, I don't understand that command.");
//    }
//}

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
@ConfigurationProperties(prefix = "chatbot")
public class ChatbotService {

    private Map<String, String> replies;

    public void setReplies(Map<String, String> replies) {
        this.replies = replies;
    }

    public String getReply(String messageText) {
        String cleanText = messageText.toLowerCase().trim();
        return replies.getOrDefault(cleanText, "I'm sorry, I don't understand that command.");
    }
}