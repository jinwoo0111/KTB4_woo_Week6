package kr.woo.community.exception;

public class PostNotFoundException extends RuntimeException {
    public PostNotFoundException() {
        super("post_not_found");
    }
}
