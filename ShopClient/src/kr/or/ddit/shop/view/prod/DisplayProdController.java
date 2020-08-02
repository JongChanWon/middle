package kr.or.ddit.shop.view.prod;

import java.net.URL;
import java.rmi.registry.Registry;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class DisplayProdController implements Initializable{

	// 정렬 정하는 박스
	@FXML ComboBox<String[]> comSort;
	
	// 상품 이미지 
	@FXML ImageView img1;
	@FXML ImageView img2;
	@FXML ImageView img3;
	@FXML ImageView img5;
	@FXML ImageView img6;
	@FXML ImageView img7;
	@FXML ImageView img8;
	@FXML ImageView img9;
	@FXML ImageView img10;
	
	// 상품 브랜드, 이름, 가격 텍스트
	@FXML Text txtBrand1;
	@FXML Text txtName1;
	@FXML Text txtPrice1;
	
	@FXML Text txtBrand2;
	@FXML Text txtName2;
	@FXML Text txtPrice2;
	
	@FXML Text txtBrand3;
	@FXML Text txtName3;
	@FXML Text txtPrice3;
	
	@FXML Text txtBrand4;
	@FXML Text txtName4;
	@FXML Text txtPrice4;
	
	@FXML Text txtBrand5;
	@FXML Text txtName5;
	@FXML Text txtPrice5;
	
	@FXML Text txtBrand6;
	@FXML Text txtName6;
	@FXML Text txtPrice6;
	
	@FXML Text txtBrand7;
	@FXML Text txtName7;
	@FXML Text txtPrice7;
	
	@FXML Text txtBrand8;
	@FXML Text txtName8;
	@FXML Text txtPrice8;
	
	@FXML Text txtBrand9;
	@FXML Text txtName9;
	@FXML Text txtPrice9;
	
	@FXML Text txtBrand10;
	@FXML Text txtName10;
	@FXML Text txtPrice10;

	private Registry reg;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
