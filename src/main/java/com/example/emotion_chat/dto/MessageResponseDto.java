package com.example.emotion_chat.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@AllArgsConstructor
public class MessageResponseDto {
    private final Long id;

    private final String type;

    private final String value;


}
