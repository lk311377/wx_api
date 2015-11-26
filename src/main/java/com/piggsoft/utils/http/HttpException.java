package com.piggsoft.utils.http;

/**
 * @author piggsoft@163.com
 * Created by user on 2015/11/16.
 */
public class HttpException extends RuntimeException {
    public HttpException() {
    }

    public HttpException(Throwable cause) {
        super(cause);
    }

    public HttpException(String message) {
        super(message);
    }

    public HttpException(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super();
    }
}
