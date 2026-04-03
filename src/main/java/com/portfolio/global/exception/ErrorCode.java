package com.portfolio.global.exception;

import org.springframework.http.HttpStatus;

public enum ErrorCode {

    // 공통 (Global)
    INVALID_INPUT_VALUE(HttpStatus.BAD_REQUEST, "잘못된 입력 값입니다."),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "서버 내부 오류가 발생했습니다."),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "인증이 필요합니다."),
    FORBIDDEN(HttpStatus.FORBIDDEN, "권한이 없습니다."),


    // Content 도메인 관련
    UPLOAD_NOT_EXIST(HttpStatus.BAD_REQUEST, "업로드할 파일이 없습니다."),
    FILE_NAME_EMPTY(HttpStatus.BAD_REQUEST, "파일명이 비어있습니다."),
    INVALID_FILE_NAME(HttpStatus.BAD_REQUEST, "유효하지 않은 파일명입니다. 확장자가 필요합니다."),
    INVALID_VIDEO_EXTENSION(HttpStatus.BAD_REQUEST, "영상 파일은 mp4 확장자만 허용됩니다."),
    THUMBNAIL_UNSUPPORTED_EXTENSION(HttpStatus.BAD_REQUEST, "지원하지 않는 이미지 형식입니다. jpg, jpeg만 업로드 가능합니다."),
    THUMBNAIL_UNSUPPORTED_MIME_TYPE(HttpStatus.BAD_REQUEST, "지원하지 않는 MIME 타입입니다. image/jpeg만 허용됩니다."),
    THUMBNAIL_FILE_SIZE_EXCEEDED(HttpStatus.BAD_REQUEST, "파일 크기가 최대 허용 용량(10MB)을 초과했습니다."),
    LESSON_VIDEO_NOT_FOUND(HttpStatus.NOT_FOUND, "해당 레슨에 등록된 영상이 없습니다."),
    LECTURE_THUMBNAIL_NOT_FOUND(HttpStatus.NOT_FOUND, "해당 강의의 썸네일이 없습니다."),
    QUIZ_NOT_FOUND(HttpStatus.NOT_FOUND, "등록된 퀴즈를 찾을 수 없습니다."),
    QUIZ_LESSON_MISMATCH(HttpStatus.BAD_REQUEST, "다른 레슨의 퀴즈는 수정할 수 없습니다."),
    MEDIA_NOT_FOUND(HttpStatus.NOT_FOUND, "요청한 영상 정보를 찾을 수 없습니다."),
    MEDIA_ALREADY_COMPLETED(HttpStatus.BAD_REQUEST,"이미 업로드된 영상입니다."),
    SIGNED_URL_CREATION_FAILED(HttpStatus.INTERNAL_SERVER_ERROR, "영상 재생 URL 생성 중 오류가 발생했습니다."),
    MEDIA_NOT_READY(HttpStatus.BAD_REQUEST, "영상 업로드가 아직 완료되지 않았습니다."),
    MEDIA_ALREADY_BOUND(HttpStatus.BAD_REQUEST, "이미 다른 레슨에 연결된 미디어입니다."),
    LESSON_ALREADY_BOUND_TO_MEDIA(HttpStatus.BAD_REQUEST,"이미 레슨에 미디어가 있습니다");

    private final HttpStatus status;
    private final String message;

    ErrorCode(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}

