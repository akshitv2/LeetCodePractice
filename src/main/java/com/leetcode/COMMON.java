package com.leetcode;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class COMMON {
    public static void print(Object object) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            System.out.println(objectMapper.writeValueAsString(object));
        } catch (JsonProcessingException e) {
            System.out.println("Error parsing" + Object.class);
        }
    }
    public static void print(String label, Object object) {
        System.out.print(label);
        print(object);
    }
}
