package com.namoo36.websocket_pr.chat.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class Chat {
    @Id
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Status status;
    @Enumerated(EnumType.STRING)
    private Type type;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;


    public enum Status {
        ACTIVE , CLOSED
    }

    public enum Type {
        GROUP, ONE_ON_ONE
    }

}
