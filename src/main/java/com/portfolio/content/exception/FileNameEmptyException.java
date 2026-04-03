package com.portfolio.content.exception;

import com.portfolio.global.exception.BaseException;
import com.portfolio.global.exception.ErrorCode;

public class FileNameEmptyException extends BaseException {
    public FileNameEmptyException() {
        super(ErrorCode.FILE_NAME_EMPTY);
    }
}
