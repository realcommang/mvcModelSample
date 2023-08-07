package com.example.toy_project.controller;

import com.example.toy_project.model.Member;
import com.example.toy_project.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // 회원가입 요청을 처리하는 핸들러 메서드(필요없음 - 카카오/네이버 로그인 샘플)
    @PostMapping("/members")
    public ResponseEntity<String> registerMember(@RequestBody Member member) {
        memberService.registerMember(member);
        return ResponseEntity.ok("Member registered successfully!");
    }

    // 카카오 로그인 요청을 처리하는 핸들러 메서드
    @PostMapping("/login/kakao")
    public ResponseEntity<String> loginWithKakao(@RequestParam String kakaoId) {
        Member member = memberService.findMemberByKakaoId(kakaoId);
        if (member != null) {
            return ResponseEntity.ok("Login success!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed!");
        }
    }

    // 네이버 로그인 요청을 처리하는 핸들러 메서드
    @PostMapping("/login/naver")
    public ResponseEntity<String> loginWithNaver(@RequestParam String naverId) {
        Member member = memberService.findMemberByNaverId(naverId);
        if (member != null) {
            return ResponseEntity.ok("Login success!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed!");
        }
    }
}
