package com.portfolio.content.exception;

import com.portfolio.global.exception.BaseException;
import com.portfolio.global.exception.ErrorCode;

public class MediaNotReadyException extends BaseException {
    public MediaNotReadyException() {
        super(ErrorCode.MEDIA_NOT_READY);
    }
}
