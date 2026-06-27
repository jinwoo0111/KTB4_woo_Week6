package kr.woo.community.controller;


import jakarta.validation.Valid;
import kr.woo.community.common.ApiResponse;
import kr.woo.community.dto.CommentCreateRequest;
import kr.woo.community.dto.CommentCreateResponse;
import kr.woo.community.dto.CommentUpdateRequest;
import kr.woo.community.dto.CommentUpdateResponse;
import kr.woo.community.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    // Post / posts/{postId}/comments - 댓글 생성
    @PostMapping("/posts/{postId}/comments")
    public ResponseEntity<ApiResponse<CommentCreateResponse>> createComment(
            @PathVariable Long postId,
            @Valid @RequestBody CommentCreateRequest request
            ){
        CommentCreateResponse commentResponse = commentService.createComment(postId, request);
        ApiResponse<CommentCreateResponse> response = new ApiResponse<>(
                "comments_create_success",
                commentResponse
        );
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(response);
    }

    // Delete /posts/{postId}/comments/{commentId} - 댓글 삭제
    @DeleteMapping("/posts/{postId}/comments/{commentId}")
    public ResponseEntity<ApiResponse<Void>> deleteComment (
            @PathVariable Long postId,
            @PathVariable Long commentId
            ) {
        commentService.deleteComment(postId, commentId);
        ApiResponse<Void> response = new ApiResponse<>(
                "comment_delete_success",
                null
        );
        return ResponseEntity.ok(response);
    }

    // PATCH /posts/{postId}/comments/{commentId} - 댓글 수정
    @PatchMapping("/posts/{postId}/comments/{commentId}")
    public ResponseEntity<ApiResponse<CommentUpdateResponse>> updateComment(
            @PathVariable Long postId,
            @PathVariable Long commentId,
            @Valid @RequestBody CommentUpdateRequest request
            ) {
        CommentUpdateResponse updateResponse = commentService.updateComment(postId, commentId, request);
        ApiResponse<CommentUpdateResponse> response = new ApiResponse<>(
                "comment_update_success",
                updateResponse
        );
        return ResponseEntity.ok(response);
    }
}
