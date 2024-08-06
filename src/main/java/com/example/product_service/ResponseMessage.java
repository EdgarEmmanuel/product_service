package com.example.product_service;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ResponseMessage {
    int statusCode;
    String message;
    boolean success;
    Object response;
}
