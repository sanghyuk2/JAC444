package sample.JavaFXEvent.EventHandling;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SimpleEventHandling extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		HBox pane = new HBox(10);
		pane.setAlignment(Pos.CENTER);
		Button btOK = new Button("OK");
	    Button btCancel = new Button("Cancel");
	    
	    OKButtonHandlerClass okButtonHandler = new OKButtonHandlerClass();
	    btOK.setOnAction(okButtonHandler);
	    
	    CancelButtonHandlerClass cancelButtonHandler = new CancelButtonHandlerClass();
	    btCancel.setOnAction(cancelButtonHandler);
	    
	    pane.getChildren().addAll(btOK, btCancel);
	    
	    Scene scene = new Scene(pane,200,200);
	    primaryStage.setTitle("Handle Event"); 
	    primaryStage.setScene(scene); 
	    primaryStage.show(); 
	}
	
	public static void main(String[] args) {
	    launch(args);
	  }

}
