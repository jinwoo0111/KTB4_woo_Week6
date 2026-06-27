package kr.woo.community.exception;

public class InvalidPaginationParameterException extends RuntimeException {

    public InvalidPaginationParameterException() {
        super("invalid_pagination_parameter");
    }
}
