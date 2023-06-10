
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;



public class mostrarEventos extends NewFXMain {
    private void mostrarEventos() {
        
        Button button1 = new Button("Post Malone in concert (Twelve Carat Tour 2023):   09/09/2023: 8:00pm");
        Button button2 = new Button("Linkin Park (In honor Chester Bennington):   10/10/2023: 9:00pm");
        Button button3 = new Button("Daddy Yankee (LEGENDADDY Tour):   12/12/2023: 8:00pm");
        Button button4 = new Button("Twenty One Pilots (AKEØVER Tour):   20/11/2023: 10:00pm");
        Button button5 = new Button("Three Days Grace in concert:   04/10/2023: 9:00pm");
        
        Button salirButton = new Button("Salir");
        salirButton.setOnAction(event -> primaryStage.close());
        
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(button1, button2,button3,
                button4,button5,salirButton);

        VBox root = new VBox(10);
        root.getChildren().addAll(
                button2,
                button1,
                button3,
                button4,
                button5,
     
                salirButton);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
       /* primaryStage.setScene(new Scene(stackPane, 200, 200));
        primaryStage.show();  */
        
            }

}
    
 
