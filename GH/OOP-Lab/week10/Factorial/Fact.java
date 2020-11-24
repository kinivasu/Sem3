import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Fact extends Application 
{
    String numb1;
    int val;
  
    public static void main(String[] args) 
    {
        launch(args);
    }
      
    @Override
    public void start(Stage primaryStage) 
    {
        primaryStage.setTitle("GCD MECH");
         
        BorderPane bp = new BorderPane();
        bp.setPadding(new Insets(10,50,50,50));
         
        HBox hb = new HBox();
        hb.setPadding(new Insets(20,20,20,30));
         
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20,20,20,20));
        gridPane.setHgap(5);
        gridPane.setVgap(5);
         
        Label lbnum1 = new Label("Value #1");
        final TextField num1 = new TextField();
        Label lbnum2 = new Label("Value #2");
        final TextField num2 = new TextField();
        Label lbfactb = new Label("Computed Factorial");
        final TextField factb = new TextField();
        Button cmpt = new Button("Compute");
        final Label lblMessage = new Label();
         
        gridPane.add(lbnum1, 0, 0);
        gridPane.add(num1, 1, 0);
        gridPane.add(lbfactb, 0, 1);
        gridPane.add(factb, 1, 1);
        gridPane.add(cmpt, 2, 1);
        gridPane.add(lblMessage, 1, 2);

         
        Text text = new Text("FactoMECH");
        text.setFont(Font.font("Courier New", FontWeight.BOLD, 28));
         
        hb.getChildren().add(text);
                           
        bp.setId("bp");
        gridPane.setId("root");
        cmpt.setId("CmpBttn");
        text.setId("text");
                 
        cmpt.setOnAction(new EventHandler<ActionEvent>()
        {
				public int factorial(int n)
				{
					int fact = 1;
					for(int i =1;i<=n;i++)
						fact *= i;
					return fact;
				}
                public void handle(ActionEvent event) 
                {
                    val = Integer.parseInt(num1.getText().toString());
                    int value = factorial(val);
                    lblMessage.setText("Calculated");
                    lblMessage.setTextFill(Color.GREEN);
                    factb.setText(Integer.toString(value));
                }
            }
        );

        bp.setTop(hb);
        bp.setCenter(gridPane);  
        Scene scene = new Scene(bp);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("fact.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}