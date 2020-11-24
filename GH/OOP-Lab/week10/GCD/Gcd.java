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

public class Gcd extends Application 
{
    String gcd,numb1,numb2;
    int val,val2;
  
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
        Label lbgcdb = new Label("Computed GCD");
        final TextField gcdb = new TextField();
        Button cmpt = new Button("Compute");
        final Label lblMessage = new Label();
         
        gridPane.add(lbnum1, 0, 0);
        gridPane.add(num1, 1, 0);
        gridPane.add(lbnum2, 0, 1);
        gridPane.add(num2, 1, 1);
        gridPane.add(lbgcdb, 0, 2);
        gridPane.add(gcdb, 1, 2);
        gridPane.add(cmpt, 2, 3);
        gridPane.add(lblMessage, 1, 3);

         
        Text text = new Text("GCD MECH");
        text.setFont(Font.font("Courier New", FontWeight.BOLD, 28));
         
        hb.getChildren().add(text);
                           
        bp.setId("bp");
        gridPane.setId("root");
        cmpt.setId("CmpBttn");
        text.setId("text");
                 
        cmpt.setOnAction(new EventHandler<ActionEvent>()
        {
                 public int gcd(int a,int b)
                 {
                    if (a == 0) 
                        return b; 
                    if (b == 0) 
                        return a; 
       
         
                    if (a == b) 
                        return a; 
       
         
                    if (a > b) 
                        return gcd(a-b, b); 
                    return gcd(a, b-a); 
                 }
                 public void handle(ActionEvent event) 
                 {
                      val = Integer.parseInt(num1.getText().toString());
                      val2 = Integer.parseInt(num2.getText().toString());
                      int value = gcd(val,val2);
                      lblMessage.setText("Calculated");
                      lblMessage.setTextFill(Color.GREEN);
                      gcdb.setText(Integer.toString(value));
                }
            }
        );

        bp.setTop(hb);
        bp.setCenter(gridPane);  
        Scene scene = new Scene(bp);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("gcd.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}