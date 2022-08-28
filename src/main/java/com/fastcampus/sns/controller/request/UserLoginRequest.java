package com.fastcampus.sns.controller.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

//회원가입을 할때 requestBody를 받아올텐데 그 때 사용하는 곳

@Getter
@AllArgsConstructor
public class UserLoginRequest {

    private String userName;
    private String pasword;
}
