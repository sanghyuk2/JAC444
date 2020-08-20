package sample.JavaFXEvent.EventHandling;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class OKButtonHandlerClass implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {
		System.out.println("Ok Button is Clicked");
		
	}

}
