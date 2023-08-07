package com.example.toy_project.service;

import com.example.toy_project.dao.MemberDao;
import com.example.toy_project.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private final MemberDao memberDao;

    @Autowired
    public MemberService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    // 회원가입 기능(필요없음)
    public void registerMember(Member member) {
        memberDao.insert(member);
    }

    // 카카오 아이디로 회원 조회 기능
    public Member findMemberByKakaoId(String kakaoId) {
        return memberDao.findByKakaoId(kakaoId);
    }

    // 네이버 아이디로 회원 조회 기능
    public Member findMemberByNaverId(String naverId) {
        return memberDao.findByNaverId(naverId);
    }
}
