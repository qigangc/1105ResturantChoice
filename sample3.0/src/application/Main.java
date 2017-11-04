package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	public static List resChinese;
	public static List resWithOutChinese;
	
	@Override
	public void start(Stage primaryStage) {
		initializeApplication();
		try {
			// Read file fxml and draw interface.
			Parent root = FXMLLoader.load(getClass().getResource("/application/MyScene.fxml"));

			primaryStage.setTitle("1105饭店选择器");
			primaryStage.setScene(new Scene(root));
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initializeApplication() {
		String line = null;
		resChinese = new ArrayList();
		resWithOutChinese = new ArrayList();
		try {
			FileReader fileReader = new FileReader("Tucson_Resturent_chinese");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while((line = bufferedReader.readLine()) != null) 
               		resChinese.add(line.trim());
			fileReader = new FileReader("Tucson_Resturent_noChinese");
			bufferedReader = new BufferedReader(fileReader);
			while((line = bufferedReader.readLine()) != null)
					resWithOutChinese.add(line.trim());
		} catch (FileNotFoundException e) {
			System.out.println("Unable Find the file.");
		} catch (IOException e) {
			System.out.println("Unable Find the file.");
		}
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}