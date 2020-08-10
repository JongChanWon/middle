package kr.or.ddit.shop.view.login;

import java.awt.SecondaryLoop;
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
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import kr.or.ddit.shop.service.login.ILoginService;
import kr.or.ddit.shop.vo.member.MemAllVO;
import kr.or.ddit.shop.vo.member.MemDetailVO;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class FindIdController implements Initializable{

	@FXML TextField inputHp;
	@FXML TextField inputName;
	@FXML Button btnConfirm;
	@FXML Button btnCancel;
	
	private Registry reg;
	private ILoginService loginService;
	private MemDetailVO mv = new MemDetailVO();
	
	List<MemDetailVO> list = new ArrayList<MemDetailVO>();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			reg = LocateRegistry.getRegistry(9809);
			loginService = (ILoginService) reg.lookup("LoginService");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		
		btnConfirm.setOnAction(e->{
			
			String memHp = inputHp.getText();
			String memName = inputName.getText();
			
			if(memHp.equals("") || memName.equals("") ||
			   inputHp == null || inputName == null) {
				
				errMsg("Input Error", "정보를 입력하지 않았습니다. 다시입력해주세요!!");
				return;
			}
			
			if(memHp.equals(mv) && memName.equals(mv)) {
				
			}
		});
		
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
