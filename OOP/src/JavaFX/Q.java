package JavaFX;

import java.util.*;
import javafx.application.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.scene.paint.Color;
import javafx.geometry.*;

public class Q extends Application {
	public void start(Stage myStage) {
		myStage.setTitle("Multiplication table");
		FlowPane rootNode = new FlowPane(Orientation.VERTICAL, 5, 5);
		rootNode.setAlignment(Pos.CENTER);
		Label response = new Label();
		response.setText("Enter a Number:");
		Scene myScene = new Scene(rootNode, 300, 200);
		TextField t = new TextField();

		t.setPromptText("Enter multi");

		t.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				final String resp = Multi.calc(Integer.parseInt(t.getText()));
				response.setText(resp);
			}
		});

		rootNode.getChildren().addAll(t, response);
		myStage.setScene(myScene);
		myStage.show();
	}

	public static void main(String args[]) {
		launch(args);
	}
}

class Multi {
	int a;

	static String calc(int a) {
		String s = new String();
		for (int i = 1; i < 11; i++) {
			s = s + "\n";
			s = s + a + "*" + i + "=" + a * i;
		}
		return s;
	}
}
