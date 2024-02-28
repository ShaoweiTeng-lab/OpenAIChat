package com.example.chatgptai.dto;

import lombok.Data;

@Data
public class BaseResponse<T> {
    private String result ="SUCCESS" ;
    private T data;
}
