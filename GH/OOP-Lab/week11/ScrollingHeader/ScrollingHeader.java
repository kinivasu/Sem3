import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ScrollingHeader extends Application implements Runnable
{
    int scrollbol;
    Text text;
    TextField num1;
    String msg;

    public String strl2r(String s)
    {
        char ch = s.charAt(s.length()-1);
        String news = ch + s.substring(0,s.length()-1);
        return news;
    }

    public String strr2l(String s)
    {
        char ch = s.charAt(0);
        String news = s.substring(1)+ ch ;
        return news;
    }
      
    @Override
    public void start(Stage primaryStage) 
    {
        primaryStage.setTitle("Scrolling Header");
         
        BorderPane bp = new BorderPane();
        bp.setPadding(new Insets(10,50,50,50));
         
        HBox hb = new HBox();
        hb.setPadding(new Insets(20,20,20,30));
         
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20,20,20,20));
        gridPane.setHgap(5);
        gridPane.setVgap(5);
         
        Label lbnum1 = new Label("Header Text");
        num1 = new TextField();
        
        Button cmpt = new Button("L2R");
        final Label lblMessage = new Label();

        Button cmpt2 = new Button("R2L");
        final Label lblMessage2 = new Label();

        gridPane.add(lbnum1, 0, 0);
        gridPane.add(num1, 1, 0);
        gridPane.add(cmpt, 2, 1);
        gridPane.add(lblMessage, 1, 1);
        gridPane.add(cmpt2, 2, 2);
        gridPane.add(lblMessage2, 1, 2);
         
        text = new Text("ScrollRound");
        text.setFont(Font.font("Courier New", FontWeight.BOLD, 40));
         
        hb.getChildren().add(text);
                           
        bp.setId("bp");
        gridPane.setId("root");
        cmpt.setId("CmpBttn");
        cmpt2.setId("CmpBttn2");
        text.setId("text");
                 
        cmpt.setOnAction(new EventHandler<ActionEvent>()
        {
                public void handle(ActionEvent event) 
                {
                    scrollbol = 1;
                    runApp();
                }
            }
        );

        cmpt2.setOnAction(new EventHandler<ActionEvent>()
        {
                public void handle(ActionEvent event) 
                {
                    scrollbol = 0;
                    runApp();
                }
            }
        );

        bp.setTop(hb);
        bp.setCenter(gridPane);  
        Scene scene = new Scene(bp);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("sh.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void runApp()
    {
        Thread t1 = new Thread(this);
        t1.start();
    }

    public void run()
    {
        for(;;)
        {
            msg = num1.getText();
            msg = new String((scrollbol==1)?strl2r(msg):strr2l(msg));
            try{
                Thread.sleep(1000);
                text.setText(msg);
                num1.setText(msg);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
            
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
}