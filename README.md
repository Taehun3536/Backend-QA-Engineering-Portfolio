# 🛠️ Backend QA Engineering Portfolio (Core Highlight)

본 저장소는 백엔드 시스템의 핵심 로직 설계와 이를 검증하기 위한 **테스트 엔지니어링 역량**을 증명하기 위해 관리하는 포트폴리오입니다. 1년 5개월간의 실무 QA 경험(812건의 결함 관리)을 바탕으로, 단순 기능 구현을 넘어 **'결함 예방(Defect Prevention)'** 관점의 화이트박스 테스팅을 지향합니다.

---

## 🚀 Specialized Domain: Content & GCP Security
> **핵심 기여: 리소스 특성에 따른 차별화된 보안 및 데이터 정합성 로직 설계**

미디어 에셋(영상/이미지)의 성격에 따라 검증 프로세스를 이원화하여 시스템의 효율성과 안정성을 동시에 확보했습니다.

### 1. 영상(Video): 고보안 및 무결성 검증 프로세스
* **가변 만료 시간(1.5x TTL) 설계**: 보안 강화를 위해 영상 스트리밍용 Signed URL 생성 시, 영상 길이에 비례한 **`durationSec * 1.5`** 가변 만료 정책을 적용했습니다. 
    * **QA 관점**: 네트워크 지연 환경을 고려하여 보안성과 시청 안정성을 모두 확보할 수 있는 임계값(1.5배)을 산출하고 단위 테스트로 검증했습니다.
* **상태 전이 모델 기반 정합성 확보**: 대용량 파일 업로드의 특성을 고려하여 **`PENDING` → `COMPLETED`** 상태 전이 로직을 도입했습니다.
    * **QA 관점**: 업로드 중단 등 비정상 상황에서 불완전한 영상 데이터가 서비스에 노출되는 리스크를 원천 차단했습니다.

### 2. 썸네일(Thumbnail): 접근성 및 유효성 검증 프로세스
* **효율적 리소스 관리**: 썸네일은 즉각적인 가시성이 중요한 리소스이므로 별도의 대기 상태(Pending) 없이 처리하여 시스템 복잡도를 최적화했습니다.
* **입력값 검증(Validation)**: 
    * **QA 관점**: 이미지 전용 확장자(JPG, PNG 등) 체크 로직을 구현하여 부적절한 파일 유입을 소스 코드 레벨에서 사전 차단했습니다.

---

## 🧪 Testing Strategy
> **화이트박스 테스팅을 통한 비즈니스 로직의 완전성 검증**

본 저장소는 기여도 확인과 코드 가독성을 위해 **본인이 직접 작성한 단위 테스트(Unit Test)** 위주로 구성되었습니다.

* **로직 검증 (JUnit5 & AssertJ)**: 핵심 메서드(만료 시간 계산, 파일명 유효성 등)에 대해 **경계값 분석(Boundary Value Analysis)** 시나리오를 적용하여 로직의 정확성을 확보했습니다.
* **예외 처리 검증**: 잘못된 파라미터나 비정상 요청에 대해 설계된 Exception이 정확히 발생하는지 전수 확인했습니다.
* **참고 사항**: 타 도메인과의 의존성이 포함된 전체 통합 테스트 및 구동 환경은 아래 원본 저장소에서 확인 가능합니다.

---

## 🛠️ Tech Stack
* **Language**: Java 17
* **Framework**: Spring Boot 3.x
* **Testing**: JUnit5, AssertJ, Mockito
* **Cloud**: Google Cloud Platform (Cloud Storage)

---

## 🔗 Project Context
* **Original Project**: [https://github.com/team-Octave/learnflow-api]
* **Manual QA Experience**: 실무 1년 5개월간 812건의 결함 관리 및 Jira 기반 QA 프로세스 수립 경험 보유.

---
Copyright © 2026 권태훈. All rights reserved.
