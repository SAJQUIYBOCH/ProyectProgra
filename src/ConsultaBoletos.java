
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class ConsultaBoletos {
    private void consultarBoletos() {
        // Lógica para consultar boletos
        Button button1 = new Button("Consulta VIP+M&G");
        button1.setOnAction(event -> showMessage("Admin: Haz comprado un asiento tipo VIP+M&G\n Codigo: A1"));
        
        Button button2 = new Button("Consulta VIP");
        button2.setOnAction(event -> showMessage("ASIENTOS AGOTADOS\n"));
           
        Button button3 = new Button("Consulta PlateaA");
        button3.setOnAction(event -> showMessage("Asientos disponibles PlateaA: PA2 a PA178"));
         
        Button button4 = new Button("Consulta PlateaB");
        button4.setOnAction(event -> showMessage("Asinto Disponibles PlateaB:\n PB3, PB6, PB9, PB13, PB32"));
        
        Button salirButton = new Button("Salir");
        salirButton.setOnAction(event -> primaryStage.close());
        
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(button1, button2,button3,
                button4,salirButton);

        VBox root = new VBox(10);
        root.getChildren().addAll(
                button2,
                button1,
                button3,
                button4,
   
                salirButton);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
       
    }

    private void showMessage(String admin_Haz_comprado_un_asiento_tipo_VIPMG_) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class primaryStage {

        private static void show() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void setScene(Scene scene) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void close() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public primaryStage() {
        }
    }

}
