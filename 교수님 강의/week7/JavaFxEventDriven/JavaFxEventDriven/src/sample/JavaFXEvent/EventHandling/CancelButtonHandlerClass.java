package sample.JavaFXEvent.EventHandling;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class CancelButtonHandlerClass implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent event) {
		System.out.println("Cancel Button is Pressed");
		
	}

}
