package kr.or.ddit.shop.view.login;

import java.awt.Window;
import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import kr.or.ddit.shop.service.login.ILoginService;
import kr.or.ddit.shop.vo.member.MemAllVO;
import javafx.scene.control.Button;

public class FindPwController implements Initializable{

	@FXML TextField inputHp;
	@FXML TextField inputName;
	@FXML TextField inputID;
	@FXML Button btnConfirm;
	@FXML Button btnCancel;

	
	private Registry reg;
	private ILoginService loginService;
	private MemAllVO mv = new MemAllVO();
	
	List<MemAllVO> list = new ArrayList<MemAllVO>();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		try {
			// Server에서 Create한 Registry 객체를 불러온다
			reg = LocateRegistry.getRegistry(9809);
			// Server에 설정한 메서드 찾아오기
			loginService = (ILoginService) reg.lookup("LoginService");
			
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		
		// 확인 눌렀을때 정보 일치하면 아이디를 메일로 보냄
		btnConfirm.setOnAction(e->{
			//System.out.println("ok");
			if(inputID.getText().equals("") || inputName.getText().equals("") || inputHp.getText().equals(" ") ||
			   inputID == null || inputName == null || inputHp == null) {
				
				errMsg("Input Error", "정보를 입력하지 않았습니다. 다시입력해주세요!!");
				return;
			}
		});
		// 취소 눌렀을 때 전화면으로 이동
		btnCancel.setOnAction(e->{
			Stage stage = (Stage) btnCancel.getScene().getWindow();
			stage.close();
			
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
