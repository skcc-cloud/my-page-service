package com.skcc.tes.mypage.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.skcc.tes.mypage.dto.MyStatusDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
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


	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
	LocalDateTime lastLogin;			// 마지막 로그인

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
	LocalDateTime lastServiceDate;	// 마지막 서비스 제공일

	public MyStatusDto toDto() {
		return MyStatusDto.builder()
				.id(id)
				.userId(userId)
				.name(name)
				.cntComment(cntComment)
				.serviceRate(serviceRate)
				.isDormantAccount(isDormantAccount)
				.lastLogin(lastLogin)
				.lastServiceDate(lastServiceDate)
				.build();

	}
}
