package kr.woo.community.controller;


import jakarta.validation.Valid;
import kr.woo.community.common.ApiResponse;
import kr.woo.community.dto.PostLikeRequest;
import kr.woo.community.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class LikeController {

    private final PostService postService;
    // Post / posts/{postId}/likes - 좋아요 생성
    @PostMapping("/posts/{postId}/likes")
    public ResponseEntity<ApiResponse<Void>> createLike (
            @PathVariable Long postId,
            @Valid @RequestBody PostLikeRequest request
    ) {
        postService.createLike(postId, request.getUserId());
        ApiResponse<Void> response = new ApiResponse<>(
                "like_create_success",
                null
        );
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(response);
    }

    // Delete /posts/{postId}/likes - 좋아요 삭제
    @DeleteMapping("/posts/{postId}/likes")
    public ResponseEntity<ApiResponse<Void>> deleteLike (
            @PathVariable Long postId,
            @Valid @RequestBody PostLikeRequest request
    ) {
        postService.deleteLike(postId, request.getUserId());
        ApiResponse<Void> response = new ApiResponse<>(
                "post_like_delete_success",
                null
        );
        return ResponseEntity.ok(response);
    }
}

