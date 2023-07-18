package org.zerock.j2.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.zerock.j2.dto.MemberDTO;
import org.zerock.j2.entity.Member;
import org.zerock.j2.repository.MemberRepository;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Log4j2
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;



    // 로그인 실패시 실행되는 예외처리
    public static final class  MemberLoginException extends RuntimeException{

        public MemberLoginException(String msg){
            super(msg);
        }

    }

    @Override
    public MemberDTO login(String email, String pw) {

        MemberDTO memberDTO = null;
        try{
            Optional<Member> result = memberRepository.findById(email);

            Member member = result.orElseThrow();

            if( !member.getPw().equals(pw)){
                throw  new MemberLoginException("Password Incorrect");
            }
            //패스워드는 안나가게 해야되므로 Service에서 처리해준다.
            memberDTO = MemberDTO.builder()
                    .email(member.getEmail())
                    .pw("")
                    .nickname(member.getNickname())
                    .admin(member.isAdmin())
                    .build();

        }catch(Exception e){
            throw  new MemberLoginException(e.getMessage());
        }

        return memberDTO;
    }

    @Override
    public MemberDTO getMemberWithEmail(String email) {

        Optional<Member> result = memberRepository.findById(email);
        log.info("---------------=================--------------------------------service");
        if(result.isPresent()) {
            Member member = result.get();
            log.info("---------------=================--------------------------------service");
            MemberDTO dto = MemberDTO.builder()
                    .email(member.getEmail())
                    .nickname(member.getNickname())
                    .admin(member.isAdmin())
                    .build();
            return dto;
        }

        // 데이터베이스에 존재하지 않는 이메일이라면.
        Member socialMember = Member.builder()
                .email(email)
                .pw(UUID.randomUUID().toString())
                .nickname("SOCIAL_MEMBER")
                .build();
        memberRepository.save(socialMember);

        MemberDTO dto = MemberDTO.builder()
                .email(socialMember.getEmail())
                .nickname(socialMember.getNickname())
                .build();

        return dto;
        //return null;
    }
}