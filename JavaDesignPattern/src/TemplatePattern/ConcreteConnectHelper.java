package TemplatePattern;

public class ConcreteConnectHelper extends AbstConnectHelper {

	@Override
	protected String doSecurity(String info) {
		return info;
	}

	@Override
	protected String authentication(String id, String password) {
		System.out.println("아이디 비밀번호 체크");
		if(id.equals("abc")|password.equals("abc"))
			return "true info";
		else
			return "false info";
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("인증 조회");
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("로그인 완료");
		return info;
	}

}
