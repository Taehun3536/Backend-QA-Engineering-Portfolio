package com.portfolio.content.exception;

import com.portfolio.global.exception.BaseException;
import com.portfolio.global.exception.ErrorCode;

public class InvalidFileNameException extends BaseException {
    public InvalidFileNameException() {
        super(ErrorCode.INVALID_FILE_NAME);
    }
}
