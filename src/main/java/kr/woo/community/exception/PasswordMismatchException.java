package kr.woo.community.exception;

public class PasswordMismatchException extends RuntimeException {
    public PasswordMismatchException()
    {
        super("password_mismatch");
    }
}
