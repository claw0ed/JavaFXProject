package claw0ed.main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class FXmain4 extends Application {

	@Override
	public void start(Stage pStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/claw0ed/view/FXmain4.fxml"));
		
		pStage.setTitle("Border레이아웃,대화상자,테이블");
		pStage.getIcons().add(new Image("/claw0ed/icons/twitter.png"));
		pStage.setScene(new Scene(root, 640, 480));
		
		pStage.setResizable(false); // 크기 조정불가
		
		pStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
