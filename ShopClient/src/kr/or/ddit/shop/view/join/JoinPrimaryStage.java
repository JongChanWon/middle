package kr.or.ddit.shop.view.join;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

public class JoinPrimaryStage implements Initializable {

	@FXML Button btnIlban;
	@FXML Button btnCom;
	@FXML ImageView goHome;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnIlban.setOnMouseClicked(e -> {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/kr/or/ddit/shop/view/join/joinIlban.fxml"));
				Scene scene = new Scene(root);
				Stage primaryStage = (Stage) btnIlban.getScene().getWindow();
	            primaryStage.setScene(scene);
            } catch (IOException e1) {
            	System.out.println("btnIlban 에서 문제 발생");
	            e1.printStackTrace();
	        }
		}); //btnIlban end
		
		btnCom.setOnMouseClicked(e-> {
			Parent root;
			try {
				root = FXMLLoader.load(getClass().getResource("/kr/or/ddit/shop/view/join/comJoin.fxml"));
				Scene scene = new Scene(root);
				Stage primaryStage = (Stage) btnIlban.getScene().getWindow();
				primaryStage.setScene(scene);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});
		
		//이미지 누르면 스테이지 종료? 아예 꺼짐? 
		goHome.setOnMouseClicked(e->{
			Stage stage = (Stage) goHome.getScene().getWindow();
			stage.close();
		});
		
	}

}
