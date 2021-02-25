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

public class Q2 extends Application {
        public void start(Stage myStage) {
                myStage.setTitle("JavaFX Welcome");

                GridPane rootNode = new GridPane();

                rootNode.setAlignment(Pos.CENTER);
                Label response = new Label();

                Scene myScene = new Scene(rootNode, 300, 200);
                response.setText("Welcome");

                Label lb1 = new Label();
                Label lb2 = new Label();
                Label lb3 = new Label();

                lb1.setText("User Name:  ");
                lb2.setText("Password:  ");
                TextField tf = new TextField();
                PasswordField pF = new PasswordField();

                tf.setPromptText("User Name");
                pF.setPromptText("Password");
                Button b1 = new Button("Sign In");

                b1.setOnAction(new EventHandler<ActionEvent>() {
                        public void handle(ActionEvent ae) {

                                lb3.setText("Welcome " + tf.getText());
                        }
                });

                rootNode.add(lb1, 0, 0, 1, 1);
                rootNode.add(lb2, 0, 1, 1, 1);
                rootNode.add(tf, 1, 0, 1, 1);
                rootNode.add(pF, 1, 1, 1, 1);
                rootNode.add(lb3, 0, 2, 1, 1);
                rootNode.add(b1, 1, 2, 1, 1);

                myStage.setScene(myScene);
                myStage.show();
        }

        public static void main(String args[]) {
                launch(args);
        }
}