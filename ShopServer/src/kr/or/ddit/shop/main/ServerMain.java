package kr.or.ddit.shop.main;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import kr.or.ddit.shop.service.admin.AdminServiceImpl;
import kr.or.ddit.shop.service.admin.IAdminService;
import kr.or.ddit.shop.service.login.ILoginService;
import kr.or.ddit.shop.service.login.LoginServiceImpl;

public class ServerMain{
	public static void main(String[] args) {
		try {
			
			// 레지스트리 생성, 포트번호 9809
			Registry reg = LocateRegistry.createRegistry(9809); 
			ILoginService LoginService = LoginServiceImpl.getInstance();
			IAdminService AdminService = AdminServiceImpl.getInstance();
			
			
			reg.rebind("LoginService", LoginService); //LoginService를 레지스트리에 등록
			reg.rebind("AdminService", AdminService); //AdminService를 레지스트리에 등록
			
			
		} catch (Exception e) {
			System.out.println("에러 ㅠㅠ");
			e.printStackTrace();
		}
		System.out.println("오까게 서버 구동중...★");
	}
}
