package kr.woo.community.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

// 회원정보 수정 응답 DTO
@Getter
@AllArgsConstructor
public class UserUpdateResponse {
    @JsonProperty("user_id")
    private Long userId;

    private String email;
    private String nickname;

    @JsonProperty("profile_image")
    private String profileImage;
}