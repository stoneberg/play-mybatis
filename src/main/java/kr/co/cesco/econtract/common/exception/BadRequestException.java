package kr.co.cesco.econtract.common.exception;

public class BadRequestException extends Exception {

	private static final long serialVersionUID = -1673087263700143836L;

	public BadRequestException() {
	}

	public BadRequestException(String message) {
		super(message);
	}

}
