package kr.woo.community.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostLikeRequest {

    @NotNull
    @JsonProperty("user_id")
    private Long userId;
}
