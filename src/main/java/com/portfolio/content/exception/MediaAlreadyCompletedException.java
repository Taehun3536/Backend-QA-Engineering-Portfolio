package com.portfolio.content.exception;

import com.portfolio.global.exception.BaseException;
import com.portfolio.global.exception.ErrorCode;

public class MediaAlreadyCompletedException extends BaseException {
    public MediaAlreadyCompletedException() {
        super(ErrorCode.MEDIA_ALREADY_COMPLETED);
    }
}
