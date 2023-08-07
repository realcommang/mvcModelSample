package com.example.toy_project.controller;

import com.example.toy_project.model.Study;
import com.example.toy_project.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudyController {
    private final StudyService studyService;

    @Autowired
    public StudyController(StudyService studyService) {
        this.studyService = studyService;
    }

    // 스터디 생성 요청을 처리하는 핸들러 메서드
    @PostMapping("/studies")
    public ResponseEntity<String> createStudy(@RequestBody Study study) {
        // 비공개 스터디인 경우, 비밀번호 필수 입력 확인
        if (!study.getOpen() && study.getPassword() == null) {
            return ResponseEntity.badRequest().body("비공개 스터디는 비밀번호를 입력해야 합니다.");
        }

        studyService.createStudy(study);
        return ResponseEntity.ok("Study created successfully!");
    }

    // 카테고리에 해당하는 스터디 검색 요청을 처리하는 핸들러 메서드
    @GetMapping("/studies")
    public ResponseEntity<List<Study>> searchStudyByCategory(@RequestParam String category) {
        List<Study> studies = studyService.searchStudyByCategory(category);
        if (studies != null) {
            return ResponseEntity.ok(studies);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
