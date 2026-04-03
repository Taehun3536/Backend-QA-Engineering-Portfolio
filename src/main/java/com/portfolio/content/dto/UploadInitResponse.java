package com.portfolio.content.dto;

public record UploadInitResponse(
        Long mediaId,
        String  uploadUrl
) {
}
