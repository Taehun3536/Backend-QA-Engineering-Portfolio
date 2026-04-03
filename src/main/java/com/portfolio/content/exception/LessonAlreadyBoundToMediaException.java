package com.portfolio.content.exception;

import com.portfolio.global.exception.BaseException;
import com.portfolio.global.exception.ErrorCode;

public class LessonAlreadyBoundToMediaException extends BaseException {
    public LessonAlreadyBoundToMediaException() {
        super(ErrorCode.LESSON_ALREADY_BOUND_TO_MEDIA);
    }
}
