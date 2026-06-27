package kr.woo.community.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

// 게시판 목록 조회시 보여지는 게시물 정보
public class PostSummaryResponse {

    @JsonProperty("post_id")
    private Long postId;
    private String title;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("like_count")
    private int likeCount;

    @JsonProperty("comment_count")
    private int commentCount;

    @JsonProperty("view_count")
    private int viewCount;

    private String author;

    public PostSummaryResponse(
            Long postId,
            String title,
            String createdAt,
            int likeCount,
            int commentCount,
            int viewCount,
            String author
    ) {
        this.postId = postId;
        this.title = title;
        this.createdAt = createdAt;
        this.likeCount = likeCount;
        this.commentCount = commentCount;
        this.viewCount = viewCount;
        this.author = author;
    }

    public Long getPostId() {
        return postId;
    }

    public String getTitle() {
        return title;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public int getViewCount() {
        return viewCount;
    }

    public String getAuthor() {
        return author;
    }
}
