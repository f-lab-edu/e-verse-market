package com.seon.eversemarket.controller

import com.seon.eversemarket.domain.Member
import com.seon.eversemarket.service.MemberService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/members")
class MemberController (
	private val memberService: MemberService
){

	@PostMapping
	fun join(@RequestBody request: Member): Member {
		return memberService.join(request.id, request)
	}
}