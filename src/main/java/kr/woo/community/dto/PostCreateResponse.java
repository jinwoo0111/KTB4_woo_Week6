package kr.woo.community.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.AllArgsConstructor;

// 게시글 생성 응답 DTO
@Getter
@AllArgsConstructor
public class PostCreateResponse {

    @JsonProperty("post_id")
    private Long postId;

    private String title;
    private String content;

    @JsonProperty("content_image")
    private String contentImage;

    private String author;
}
