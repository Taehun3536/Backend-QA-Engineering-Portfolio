package com.portfolio.content.exception;

import com.portfolio.global.exception.BaseException;
import com.portfolio.global.exception.ErrorCode;

public class MediaNotFoundException extends BaseException {
    public MediaNotFoundException() {
        super(ErrorCode.MEDIA_NOT_FOUND);
    }
}
