package wageCalculator;

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
				//result
				Label resultLabel= new Label("");
	  //Calculate button
				Button calculate=new Button();
				calculate.setText("Calculate");
				calculate.setOnAction(new EventHandler<ActionEvent>(){
					@Override
					public void handle(ActionEvent e){
						
						//Logic for the action to take place
						String s;
						s=nameTextBox.getText();
						System.out.println(s);
						
						String s2;
						s2=hoursTextBox.getText();
						System.out.println(s2);
						
						String s3;
						s3=wageTextBox.getText();
						System.out.println(s3);
						
						double hours=Double.parseDouble(hoursTextBox.getText());
						double wages=Double.parseDouble(wageTextBox.getText());
						double wageresult=hours*wages;
						System.out.println("Result "+wageresult);
						resultLabel.setText(s+" earns $"+wageresult);
						nameTextBox.setText("");
						hoursTextBox.setText("");
						wageTextBox.setText("");
						
						
					}
				});
				
				//Make a layout manager
				VBox root = new VBox();
				root.getChildren().add(nameLabel);
				root.getChildren().add(nameTextBox);
				root.getChildren().add(hoursLabel);
				root.getChildren().add(hoursTextBox);
				root.getChildren().add(wageLabel);
				root.getChildren().add(wageTextBox);
				root.getChildren().add(calculate);
				root.getChildren().add(resultLabel);
				root.setSpacing(10);
				//set the width x height of app to (500 x 500)
				primaryStage.setScene(new Scene(root,500,500));
				primaryStage.setTitle("Example 2");		
				// Show the app
				primaryStage.show();
	}

}