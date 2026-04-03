package com.portfolio.content.dto;

import org.springframework.web.multipart.MultipartFile;

public record UploadVideoRequest(
        MultipartFile file,
        Long lessonId
) {
}
