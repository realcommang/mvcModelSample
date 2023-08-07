package com.example.toy_project.service;

import com.example.toy_project.dao.StudyDao;
import com.example.toy_project.model.Study;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyService {
    private final StudyDao studyDao;

    @Autowired
    public StudyService(StudyDao studyDao) {
        this.studyDao = studyDao;
    }

    public void createStudy(Study study) {
        studyDao.insert(study);
    }

    public List<Study> searchStudyByCategory(String category) {
        return studyDao.findByCategory(category);
    }
}
