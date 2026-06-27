package kr.woo.community.exception;

public class CommentNotFoundException extends RuntimeException {

    public CommentNotFoundException() {
        super("comment_not_found");
    }
}
