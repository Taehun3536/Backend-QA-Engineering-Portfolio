package com.portfolio.content.dto;

import jakarta.validation.constraints.NotBlank;

public record UploadInitRequest(
        @NotBlank String filename
) {
}
