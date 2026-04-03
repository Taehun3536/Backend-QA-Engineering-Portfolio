package com.portfolio.content.exception;

import com.portfolio.global.exception.BaseException;
import com.portfolio.global.exception.ErrorCode;

public class ThumbnailUnsupportedExtensionException extends BaseException {
    public ThumbnailUnsupportedExtensionException() {
        super(ErrorCode.THUMBNAIL_UNSUPPORTED_EXTENSION);
    }
}
