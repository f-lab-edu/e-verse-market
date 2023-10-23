package com.seon.eversemarket.service

import com.seon.eversemarket.domain.Member
import com.seon.eversemarket.repository.MemberRepository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PostMapping

@Service
class MemberService(
	private val memberRepository : MemberRepository
){
	fun join(id: String, request: Member): Member {
		//TODO: 이대로 진행해도 괜찮을지 회고해볼 것.(작가 회원가입을 따로 만들 것인가?)
		//TODO: 아이디 중복 체크
		return memberRepository.save(request)
	}
}