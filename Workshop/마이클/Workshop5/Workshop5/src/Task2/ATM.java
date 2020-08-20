package Task2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import Task1.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;



public class ATM extends Application {
	//Stage window;
	//Scene scene1, scene2;
    TextField nameTf;
    TextField stTf;
    TextField cityTf;
    TextField stateTf;
    TextField zipTf;
    int count = 0;
    Account account;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		// THIS WORKS
		/*window = primaryStage;
		
		Label label1 = new Label("first scence");
		//Button b1 = new Button("go to scene2");
		Button submitButton = new Button("submit");
		submitButton.setOnAction(e->window.setScene(scene2));
		
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, submitButton);
		scene1 = new Scene(layout1,200,200);
		
		Button b2 = new Button("go back to scene1");
		b2.setOnAction(e ->window.setScene(scene1));
		
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(b2);
		scene2 = new Scene(layout2, 600, 300);
		
		window.setScene(scene1);
		window.setTitle("asdf");
		window.show();*/
		
		

        /** GUI design - GridPane */
        GridPane pane = new GridPane();
        GridPane pane2 = new GridPane();
        // set the scene
        Scene scene1 = new Scene(pane, 800, 200);
        Scene scene2 = new Scene(pane2, 600, 300);
        
        pane.setPadding(new Insets(20));

        // set the margin between columns and rows pane1
        pane.setHgap(10);
        pane.setVgap(10);
        
        /** Set Label and Textfield */
        Label name = new Label("Name");
        pane.add(name, 0, 0);
        nameTf = new TextField();
        pane.add(nameTf, 1, 0, 8, 1);
        
        // Submit button
		Button submitButton = new Button("submit");
		//submitButton.setOnAction(e->window.setScene(scene2));
        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	//validate();
            	if (validate()){
            		primaryStage.setScene(scene2);
            	}
            	//primaryStage.setScene(scene2);
            }
        });
        
        /** Group the buttons */
        HBox hbBtn = new HBox(5);
        hbBtn.getChildren().addAll(
        	submitButton
        );
        
        hbBtn.setAlignment(Pos.CENTER);
        pane.add(hbBtn, 1, 4);
        
        

        
        // set the margin between columns and rows pane2
        pane2.setHgap(10);
        pane2.setVgap(10);
        
        // Set labels for pane2
        Label name2 = new Label("Welcome Account (GET THE ACCOUNT # and put here)");
        Label name3 = new Label("What would you like to do?");
        pane2.add(name2, 0, 0);
        pane2.add(name3, 0 ,1);
      

        // Create buttons
        Button checkBalance = new Button("Check Balance");
        checkBalance.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	primaryStage.setScene(scene1);
            }
        });
        
        Button withDraw = new Button("Withdraw Money");
        withDraw.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	primaryStage.setScene(scene1);
            }
        });
        
        Button exitAccount = new Button("Exit Account");
        exitAccount.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	primaryStage.setScene(scene1);
            }
        });
        
        
        //Scene scene2 = new Scene(pane2, 600, 300);
        Button b2 = new Button("go back to scene1");
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	primaryStage.setScene(scene1);
            }
        });
        
        
        // Group scene 2
        HBox h2 = new HBox(5);
        h2.getChildren().addAll(b2,checkBalance,withDraw,exitAccount);
        
        h2.setAlignment(Pos.CENTER);
        pane2.add(checkBalance, 0, 4);
        pane2.add(withDraw, 0, 5);
        pane2.add(exitAccount,0, 6);
        pane2.add(b2, 0, 7);



        primaryStage.setTitle("Address Book");
        primaryStage.setScene(scene1);
        primaryStage.show(); // Display the stage
        
	}
	
	
	// Button Functions
    /*private void add() {
        try (RandomAccessFile f = new RandomAccessFile("Address.dat", "rw")) {
            f.seek(f.length()); // move to the end of the file
            write(f); // call write method
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found " + ex);
        }
        catch (IOException ex) {
            System.out.println("IO Exception generated " + ex);
        }
        catch (IndexOutOfBoundsException ex) {}
    }*/
	
    private boolean validate() {
    	boolean valid = false;
    	if (getPin() != 0) {
    		
    	}
    	return valid;
    }
	
	
	
	
	
	
	
	
	
	
	
	
    public static void main(String[] args) {
        launch(args);
    }
	
	
	/*public static void play() {
		launch();
	}*/
	

}


