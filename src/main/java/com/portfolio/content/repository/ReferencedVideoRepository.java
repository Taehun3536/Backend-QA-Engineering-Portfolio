package com.portfolio.content.repository;

import com.portfolio.content.model.ReferencedVideo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReferencedVideoRepository extends JpaRepository<ReferencedVideo, Long> {

    Optional<ReferencedVideo> findByLessonId(Long lessonId);
}
