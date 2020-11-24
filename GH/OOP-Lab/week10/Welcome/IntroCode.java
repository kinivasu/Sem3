import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class IntroCode extends Application
{

	public static void main(String args[])
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage)
	{
		primaryStage.setTitle("Program 1!");

		Label l1 = new Label();
		l1.setText("demo label");
		l1.setTextFill(Color.MAGENTA);

		FlowPane root = new FlowPane();
		root.getChildren().add(l1);

		Scene scene = new Scene(root, 500, 200);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
