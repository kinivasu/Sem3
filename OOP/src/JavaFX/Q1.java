package JavaFX;

import java.util.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.application.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.*;
import javafx.geometry.*;

public class Q1 extends Application {
	public static void main(String args[]) {
		launch(args);
	}

	public void start(Stage myStage) {

		myStage.setTitle("This is the first JavaFX application");

		FlowPane rootnode = new FlowPane();
		rootnode.setHgap(90);
		rootnode.setVgap(50);
		Scene myScene = new Scene(rootnode, 500, 200);

		myStage.setScene(myScene);

		Label mylabel = new Label();
		mylabel.setText("Welcome to JavaFX programming");
		mylabel.setTextFill(Color.MAGENTA);
		rootnode.getChildren().add(mylabel);

		myStage.show();
	}
}
