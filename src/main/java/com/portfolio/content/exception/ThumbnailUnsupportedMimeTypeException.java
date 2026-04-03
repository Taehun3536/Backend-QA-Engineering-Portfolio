package com.portfolio.content.exception;

import com.portfolio.global.exception.BaseException;
import com.portfolio.global.exception.ErrorCode;

public class ThumbnailUnsupportedMimeTypeException extends BaseException {
    public ThumbnailUnsupportedMimeTypeException() {
        super(ErrorCode.THUMBNAIL_UNSUPPORTED_MIME_TYPE);
    }
}
