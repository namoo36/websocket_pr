package com.namoo36.websocket_pr.chat.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ChatMessageDto {

    private String content;
    private String sender;


}
