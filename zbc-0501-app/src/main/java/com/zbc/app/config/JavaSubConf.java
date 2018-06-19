package com.zbc.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zbc.app.spring.MemberDao;
import com.zbc.app.spring.MemberPrinter;
import com.zbc.app.spring.MemberRegisterService;

@Configuration
public class JavaSubConf {

	@Autowired
	private MemberDao memberDao;

	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}

	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao);
	}

}