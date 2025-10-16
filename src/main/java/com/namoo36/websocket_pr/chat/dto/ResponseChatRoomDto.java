package com.namoo36.websocket_pr.chat.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class ResponseChatRoomDto {

    private Long id;
    private String name;
    private LocalDateTime createdAt;
}
