package com.portfolio.content.service;

import com.portfolio.content.dto.VideoUrlRequest;
import com.portfolio.content.dto.VideoUrlResponse;
import com.portfolio.content.exception.LessonVideoNotFoundException;
import com.portfolio.content.model.ReferencedVideo;
import com.portfolio.content.repository.ReferencedVideoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ReferencedVideoService {

    private final ReferencedVideoRepository referencedVideoRepository;

    public  ReferencedVideoService(ReferencedVideoRepository referencedVideoRepository) {
        this.referencedVideoRepository = referencedVideoRepository;

    }

    @Transactional
    public VideoUrlResponse createReferencedVideoUrl(VideoUrlRequest request) {

        Long lessonId = request.lessonId();
        String videoUrl = request.videoUrl();

        ReferencedVideo foundVideo = referencedVideoRepository.findByLessonId(lessonId)
                .orElse(null);

        if (foundVideo != null) {
            foundVideo.changeVideoUrl(videoUrl);
        } else {
            foundVideo = ReferencedVideo.createReferencedVideo(lessonId, videoUrl);
        }

        ReferencedVideo saved = referencedVideoRepository.save(foundVideo);

        return new VideoUrlResponse(saved.getLessonId(),saved.getVideoUrl());
    }


    @Transactional(readOnly = true)
    public VideoUrlResponse getVideoUrl(Long lessonId) {
        if (lessonId == null) {
            throw new IllegalArgumentException("lessonId는 null일 수 없습니다.");
        }
        ReferencedVideo video = referencedVideoRepository.findByLessonId(lessonId)
                .orElseThrow(LessonVideoNotFoundException::new);

        return new VideoUrlResponse(video.getLessonId(), video.getVideoUrl());
    }
}
