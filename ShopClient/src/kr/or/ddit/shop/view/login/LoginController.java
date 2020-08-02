package kr.or.ddit.shop.view.login;

import java.io.IOException;
import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import kr.or.ddit.shop.service.login.ILoginService;
import kr.or.ddit.shop.session.LoginSession;
import kr.or.ddit.shop.vo.member.MemAllVO;
import kr.or.ddit.shop.vo.member.MemDetailVO;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class LoginController implements Initializable{

	@FXML ImageView btnHome;
	@FXML TextField inputID;
	@FXML TextField inputPW;
	@FXML Button btnLogin;
	@FXML ImageView btnKakao;
	@FXML ImageView btnNaver;
	@FXML Button btnRegi;
	@FXML Button btnFIndID;
	@FXML Button btnFindPW;
	
	List<MemAllVO> list = new ArrayList<>();
	
	private MemAllVO mvo = new MemAllVO();
	private ILoginService loginService;
	private Registry reg;
	
	MemAllVO mAllSession = LoginSession.session; // 로그인 정보 저장
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		try {
			reg = LocateRegistry.getRegistry("localhost", 9809);
			loginService = (ILoginService) reg.lookup("LoginService");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		// 아이디, 비번 미입력시 에러창
		btnLogin.setOnAction(e->{
			
			String memID = inputID.getText();
			String memPW = inputPW.getText();
			MemDetailVO authUser = new MemDetailVO(memID, memPW);
			
			MemDetailVO mv = null;
			try {
				mv = (MemDetailVO)loginService.memLogin(authUser);
			} catch (RemoteException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			
			if(mv!=null) {
				//회원이 있단 얘기
				if(mv.getMem_pw().equals(authUser.getMem_pw())) {
					//성공
					System.out.println("정상진입");
				}else {
					//실패
					System.out.println("비번틀림");
				}
			}else {
				//회원이 없단 얘기
				System.out.println("회원 없음 원종찬 씨벌련");
			}
			
			
			System.out.println("진입전");
//			
			if(memID.equals(mv.getMem_mail())  && memPW.equals(mv.getMem_pw())) {
				System.out.println("진입 후");
				infoMsg("★Login Success★", "챠니 옷가게에 오신걸 환영합니다!!");
			}else if(inputID.getText().equals(" ") || inputID.getText() == null ||
			   inputPW.getText().equals(" ") || inputPW.getText() == null) {
				errMsg("Login Error", "아이디 OR 비밀번호를 입력하지 않으셨습니다");
				return;
			}
			
			/*mv.setMem_mail(memID);
			mv.setMem_pw(memPW);
			
			if(memID.equals("user"))*/
			/*try {
				memList = (ArrayList<MemAllVO>)loginService.memLogin(mv);
				errMsg("Login Error", "아이디 OR 비밀번호를 입력하지 않으셨습니다");
			} catch (RemoteException e1) {
				e1.printStackTrace();
			}
			
			if(memList.size() > 0) {
				infoMsg("★Login Success★", "챠니 옷가게에 오신걸 환영합니다!!");
			}*/
			
			
			
			
		});
		// 아이디 찾기
		btnFIndID.setOnAction(e1->{
			FXMLLoader loader = new FXMLLoader(getClass().getResource("SearchID.fxml"));
			
			try {
				AnchorPane root = loader.load();
				Scene scene = new Scene(root);
				Stage stage = new Stage();
				stage.initModality(Modality.APPLICATION_MODAL);
				stage.setScene(scene);
				stage.show();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		});
		
		// 비번찾기
		btnFIndID.setOnAction(e1->{
			FXMLLoader loader = new FXMLLoader(getClass().getResource("SearchPW.fxml"));
			
			try {
				AnchorPane root = loader.load();
				Scene scene = new Scene(root);
				Stage stage = new Stage();
				stage.initModality(Modality.APPLICATION_MODAL);
				stage.setScene(scene);
				stage.show();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		});
		
	}

	private void errMsg(String headerText, String msg) {
		Alert errAlert = new Alert(AlertType.ERROR);
        errAlert.setTitle("에러 !!");
        errAlert.setHeaderText(headerText);
        errAlert.setContentText(msg);
        errAlert.showAndWait();		
	}
	
	
	 private void infoMsg(String headerText, String msg) {
         Alert errAlert = new Alert(AlertType.INFORMATION);
         errAlert.setTitle("정보 확인!!");
         errAlert.setHeaderText(headerText);
         errAlert.setContentText(msg);
         errAlert.showAndWait();
      }
	
}
