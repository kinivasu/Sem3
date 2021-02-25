package JavaFX;

import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
import javafx.application.Application;
import javafx.scene.image.*;

public class Q3 extends Application {

	TextField tf1, tf2;
	Button btn;
	GraphicsContext gc;

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage myStage) {

		myStage.setTitle("JavaFX Application");
		GridPane rootnode = new GridPane();
		rootnode.setMinSize(300, 300);
		rootnode.setVgap(5);
		rootnode.setHgap(5);
		rootnode.setAlignment(Pos.CENTER);
		Scene myScene = new Scene(rootnode);
		myStage.setScene(myScene);
		final Canvas canvas = new Canvas(500, 200);
		gc = canvas.getGraphicsContext2D();
		tf1 = new TextField();
		tf2 = new TextField();
		tf1.setPromptText("Enter First number");
		tf2.setPromptText("Enter Second number");
		Button btn = new Button("Compute", new ImageView("./calculator.png"));
		btn.setContentDisplay(ContentDisplay.TOP);
		rootnode.add(tf1, 0, 0);
		rootnode.add(tf2, 0, 1);
		rootnode.add(btn, 0, 2);
		rootnode.add(canvas, 0, 3);

		btn.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent ae) {

				double a, b;
				a = Double.parseDouble(tf1.getText());
				b = Double.parseDouble(tf2.getText());
				gc.setFill(Color.WHITE);
				gc.fillRect(0, 0, 300, 500);
				gc.strokeText("Sum :" + (a + b), 25, 60);
				gc.strokeText("Diff:" + (a - b), 25, 80);
				gc.strokeText("Product :" + (a * b), 25, 100);
				gc.strokeText("Quotient:" + (a / b), 25, 120);

			}

		});

		myStage.show();

	}

}
