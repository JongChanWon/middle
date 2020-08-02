package kr.or.ddit.shop.view.prod;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DisplayProdMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("prodsort.fxml"));
		Parent root = loader.load();
		
		Scene scene = new Scene(root);


		primaryStage.setTitle("챠니네 오까게 ♥♥♥♥♥♥♥ 상품");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
