package assembler;

import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberRegisterService;

public class Assembler {

	private MemberDao memberDao;
	private MemberRegisterService regSvc;
	private ChangePasswordService pwdSvc;

	public Assembler() {
		memberDao = new MemberDao();
		regSvc = new MemberRegisterService(memberDao);
		pwdSvc = new ChangePasswordService(memberDao);
	}

	public MemberDao getMemberDao() {
		return memberDao;
	}

	public MemberRegisterService getRegSvc() {
		return regSvc;
	}

	public ChangePasswordService getPwdSvc() {
		return pwdSvc;
	}

//	public MemberDao getMemberDao() {
//		return memberDao;
//	}
//
//	public MemberRegisterService getMemberRegisterService() {
//		return regSvc;
//	}
//
//	public ChangePasswordService getChangePasswordService() {
//		return pwdSvc;
//	}

}