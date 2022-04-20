package com.skcc.tes.mypage.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Setter
@Getter
public class MyStatus {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String userId;		// 사용자 ID
	String name;		// 사용자 이름
	Integer cntComment;	// 코멘트 개수
	Double serviceRate;	// 나의 별점
	Boolean isDormantAccount; 	// 휴면 계정인지 아닌지 여부
	Date lastLogin;			// 마지막 로그인
	Date lastServiceDate;	// 마지막 서비스 제공 일
}
