package com.seon.eversemarket.repository

import com.seon.eversemarket.domain.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, String> {
}