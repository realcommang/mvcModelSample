package com.example.toy_project.dao;

import com.example.toy_project.model.Study;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudyDao {
    void insert(Study study);
    List<Study> findByCategory(String category);
}