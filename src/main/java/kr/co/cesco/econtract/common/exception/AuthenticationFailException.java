package kr.co.cesco.econtract.common.exception;

public class AuthenticationFailException extends Exception {

    private static final long serialVersionUID = 4698980797856410517L;

    public AuthenticationFailException() {
    }

    public AuthenticationFailException(String message) {
        super(message);
    }
}
