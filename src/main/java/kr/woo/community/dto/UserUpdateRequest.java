package kr.woo.community.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

// 회원정보 수정 요청 DTO
@Getter
@NoArgsConstructor
public class UserUpdateRequest {
    @NotBlank
    private String nickname;

    @JsonProperty("profile_image")
    private String profileImage;
}