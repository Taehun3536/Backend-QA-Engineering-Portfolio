package com.portfolio.content.exception;

import com.portfolio.global.exception.BaseException;
import com.portfolio.global.exception.ErrorCode;

public class InvalidVideoExtensionException extends BaseException {
    public InvalidVideoExtensionException() {
        super(ErrorCode.INVALID_VIDEO_EXTENSION);
    }
}
