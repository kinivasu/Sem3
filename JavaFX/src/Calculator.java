import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.event.*;

public class Calculator extends Application {
    public static void main(String[] args) {
        System.out.println("Launching JavaFX application.");
        launch(args);
    }

    public void start(Stage myStage) {
        // Giving the staf=ge a title
        myStage.setTitle("JavaFX Application");
        // Create a root node, in this case a Flow Layout is used
        FlowPane rootNode = new FlowPane();
        // Create a scene.
        Scene myScene = new Scene(rootNode, 300, 200);
        // Set the scene on the stage.
        myStage.setScene(myScene);
        myStage.show();
    }
}