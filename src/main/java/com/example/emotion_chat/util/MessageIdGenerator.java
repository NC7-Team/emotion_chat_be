package com.example.emotion_chat.util;

public class MessageIdGenerator {
    private static Long id = 0L;

    public static Long generateId() {
        id += 1L;
        return id;
    }
}
