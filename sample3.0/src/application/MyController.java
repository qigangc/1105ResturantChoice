package application;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class MyController implements Initializable {

   @FXML
   private Button myButton;

   @FXML
   private TextField myTextField;
   @FXML
   private ChoiceBox myChoiceBox;
   @FXML
   private ChoiceBox myChoiceBox_price;
   @FXML
   private ChoiceBox myChoiceBox_distance;

   private String[] res = new String[20];
   
   @Override
   public void initialize(URL location, ResourceBundle resources) {
	   res[0] = "Brother Noodle";
	   res[1] = "KongFu Noodle";
	   res[2] = "MeiMei";
	   res[3] = "PoP Eye";
	   res[4] = "Apple Bee";
	   myChoiceBox.getItems().add("Chinese Food");
	   myChoiceBox.getItems().add("W/O Chinese Food");
	   myChoiceBox_price.getItems().add("5-15");
	   myChoiceBox_price.getItems().add("15-25");
	   myChoiceBox_distance.getItems().add("0-5miles");
	   myChoiceBox_distance.getItems().add("5-10miles");
	   myChoiceBox_distance.getItems().add(">10miles");
       // TODO (don't really need to do anything here).

   }

   // When user click on myButton
   // this method will be called.
   public void showResturant(ActionEvent event) {
      String resType = (String)myChoiceBox.getValue();
      String toPrint = null;
      int i = 0;
      if (resType == null){
          myTextField.setText("No Type");
          return;}
      else if (resType == "Chinese Food")
    	  i = (int)(Math.random() * ((2 - 0) + 1) + 0);
      else if (resType == "W/O Chinese Food")
    	  i = (int)(Math.random() * ((4 - 3) + 1) + 3);
      //System.out.println("Button Clicked!");
      //System.out.println("num=" + i);
      toPrint = res[i];
      myTextField.setText(toPrint);

   }

}