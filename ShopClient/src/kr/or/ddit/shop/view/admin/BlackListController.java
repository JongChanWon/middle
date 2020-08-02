package kr.or.ddit.shop.view.admin;

import java.io.Serializable;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;

public class BlackListController implements Serializable {

	@FXML TableView tbOrderList;
	@FXML TableColumn colType;
	@FXML TableColumn colName;
	@FXML TableColumn colRank;
	@FXML TableColumn colInDate;
	@FXML TableColumn colEmail;
	@FXML TableColumn colReason;

}
