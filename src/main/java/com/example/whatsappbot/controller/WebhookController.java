package com.example.whatsappbot.controller;

import com.example.whatsappbot.model.WhatsAppMessager;
import com.example.whatsappbot.service.ChatbotService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@Slf4j
public class WebhookController {



    private final ChatbotService chatbotService;

    public WebhookController(ChatbotService chatbotService) {
        this.chatbotService = chatbotService;
    }

    @PostMapping("/webhook")
    public ResponseEntity<Map<String, String>> handleWhatsAppMessage(@RequestBody WhatsAppMessager message) {

        log.info("Incoming from {}: {}", message.getSender(), message.getText());

        String reply = chatbotService.getReply(message.getText());

        Map<String, String> responsePayload = new HashMap<>();

        responsePayload.put("reply", reply);

        return ResponseEntity.ok(responsePayload);
    }
}
