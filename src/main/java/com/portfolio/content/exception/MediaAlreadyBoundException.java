package com.portfolio.content.exception;

import com.portfolio.global.exception.BaseException;
import com.portfolio.global.exception.ErrorCode;

public class MediaAlreadyBoundException extends BaseException {
    public MediaAlreadyBoundException() {
        super(ErrorCode.MEDIA_ALREADY_BOUND);
    }
}
