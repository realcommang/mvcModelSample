package com.example.toy_project.dao;

import com.example.toy_project.model.Member;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao {
    void insert(Member member);
    Member findByKakaoId(String kakaoId);
    Member findByNaverId(String naverId);
}