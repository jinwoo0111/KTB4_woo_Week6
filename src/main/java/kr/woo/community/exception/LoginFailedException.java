package kr.woo.community.exception;

public class LoginFailedException extends RuntimeException{

    public LoginFailedException() {
        super("login_failed");
    }
}
