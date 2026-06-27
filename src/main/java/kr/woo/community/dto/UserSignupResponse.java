package kr.woo.community.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

// 회원가입 요청 DTO
@Getter
@AllArgsConstructor
public class UserSignupResponse {

    @JsonProperty("user_id")
    private Long userId;
}
