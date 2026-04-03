package com.portfolio.content.exception;

import com.portfolio.global.exception.BaseException;
import com.portfolio.global.exception.ErrorCode;

public class LectureThumbnailNotFoundException extends BaseException {
    public LectureThumbnailNotFoundException() {
        super(ErrorCode.LECTURE_THUMBNAIL_NOT_FOUND);
    }
}
