package com.seon.eversemarket.domain

import jakarta.persistence.*
import java.time.LocalDateTime

@Table(name = "member")
@Entity
class Member(
	@Id
	@Column(name = "member_id")
	val id: String,

	@Column(name = "member_name")
	val name: String,

	@Column(name = "password_hash")
	val password: String,

	val nickname: String,
	val email: String,
	val joinDate: LocalDateTime = LocalDateTime.now(),
	val lastLoginDate: LocalDateTime? = null,
	val role: String = "consumer",

	@Column(name = "is_active", columnDefinition = "TINYINT(1)")
	val isActive: Boolean
)