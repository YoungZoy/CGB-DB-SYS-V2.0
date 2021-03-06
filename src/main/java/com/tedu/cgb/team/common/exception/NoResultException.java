package com.tedu.cgb.team.common.exception;

public class NoResultException extends ResultException {
	private static final long serialVersionUID = 1L;
	public NoResultException() {
		super();
	}
	public NoResultException(String message, Throwable cause, 
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public NoResultException(String message, Throwable cause) {
		super(message, cause);
	}
	public NoResultException(String message) {
		super(message);
	}
	public NoResultException(Throwable cause) {
		super(cause);
	}

}
