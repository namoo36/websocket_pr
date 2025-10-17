package com.namoo36.websocket_pr.chat.controller;

import com.namoo36.websocket_pr.chat.dto.ResponseChatRoomDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ChatController {

    private final SimpMessagingTemplate  simpMessagingTemplate;

//    @PostMapping("/chat/create")
//    public ResponseEntity<ResponseChatRoomDto> createChatRoom(
//            @RequestBody RequestChatRoomDto requestChatRoomDto)  {
//        return ResponseEntity.status(HttpStatus.CREATED)
//                .body(ChatRoomService.createChatRoom(requestChatRoomDto));
//    }

}
