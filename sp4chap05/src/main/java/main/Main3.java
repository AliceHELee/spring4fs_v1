package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.MemberInfoPrinter;
import spring.MemberRegisterService;
import spring.RegisterRequest;
import config.JavaConfig3;

public class Main3 {

	public static void main(String[] args) {
		ApplicationContext ctx = 
				new AnnotationConfigApplicationContext(JavaConfig3.class);
		MemberRegisterService regSvc = 
				ctx.getBean("memberRegSvc", MemberRegisterService.class);
		MemberInfoPrinter infoPrinter = 
				ctx.getBean("infoPrinter", MemberInfoPrinter.class);

		RegisterRequest regReq = new RegisterRequest();
		regReq.setEmail("madvirus@madvirus.net");
		regReq.setName("최범균");
		regReq.setPassword("1234");
		regReq.setConfirmPassword("1234");
		regSvc.regist(regReq);
		
		infoPrinter.printMemberInfo("madvirus@madvirus.net");
	}
}
