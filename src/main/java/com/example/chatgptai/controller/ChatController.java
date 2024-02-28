package com.example.chatgptai.controller;

import com.example.chatgptai.dto.BaseResponse;
import com.example.chatgptai.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @PostMapping("/ask")
    public BaseResponse<String> askQuestion(@RequestParam String prompt) {
        return chatService.getChatResponse(prompt);
    }
}