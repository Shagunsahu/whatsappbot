package com.example.whatsappbot.model;

import lombok.Data;
import lombok.Getter;

@Data
@Getter

public class WhatsAppMessager {
    private String sender;
    private String text;
}