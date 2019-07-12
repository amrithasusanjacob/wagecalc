import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class wageCalc extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//name
		        //label
				Label nameLabel= new Label("Enter your name");
                //text box
				TextField nameTextBox=new TextField();
	   //hours worked
		        //label
				Label hoursLabel= new Label("Enter the hours worked");
                //text box
				TextField hoursTextBox=new TextField();	
	  //wage label
		        //label
				Label wageLabel= new Label("Enter your hourly rate");
                //text box
				TextField wageTextBox=new TextField();
	  //Calculate button
				Button calculate=new Button();
				calculate.setText("Calculate");
				//Make a layout manager
				VBox root = new VBox();
	}

}