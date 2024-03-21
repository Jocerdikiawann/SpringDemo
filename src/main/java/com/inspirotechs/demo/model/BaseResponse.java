package com.inspirotechs.demo.model;

import lombok.Data;

@Data
public class BaseResponse<DATA> {
    private String status;
    private String message;
    private String code;
    private DATA data;
    private String token = "";
}
