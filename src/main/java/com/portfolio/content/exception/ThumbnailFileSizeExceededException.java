package com.portfolio.content.exception;

import com.portfolio.global.exception.BaseException;
import com.portfolio.global.exception.ErrorCode;

public class ThumbnailFileSizeExceededException extends BaseException {
    public ThumbnailFileSizeExceededException() {
        super(ErrorCode.THUMBNAIL_FILE_SIZE_EXCEEDED);
    }
}
