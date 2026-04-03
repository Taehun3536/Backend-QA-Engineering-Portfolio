package com.portfolio.content.exception;

import com.portfolio.global.exception.BaseException;
import com.portfolio.global.exception.ErrorCode;

public class SignedUrlCreationException extends BaseException {
    public SignedUrlCreationException() {
        super(ErrorCode.SIGNED_URL_CREATION_FAILED);
    }
}
