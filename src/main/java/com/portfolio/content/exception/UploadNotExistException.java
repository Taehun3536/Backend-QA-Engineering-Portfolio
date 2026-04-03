package com.portfolio.content.exception;

import com.portfolio.global.exception.BaseException;
import com.portfolio.global.exception.ErrorCode;

public class UploadNotExistException extends BaseException {
    public UploadNotExistException() {
        super(ErrorCode.UPLOAD_NOT_EXIST);
    }
}
