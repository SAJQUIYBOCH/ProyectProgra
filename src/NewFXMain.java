import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class NewFXMain extends Application {

    Stage primaryStage;
    private Stage previousStage;
     
    private TextField textField;
    private VBox vbox;
    private ObservableList<String> eventosRegistrados = FXCollections.observableArrayList();
    private ListView<String> listView;

    
    public static void main(String[] args) {
        //launch(args);
        LoginApp.launch(LoginApp.class, args);
    }

    @Override
    public void start(Stage primaryStage) {
        
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Gestor de eventos y venta de boletos EMSA");

        Button verEventosButton = new Button("Ver eventos");
        verEventosButton.setOnAction(event -> mostrarEventos());
   
        Button comprarBoletosButton = new Button("Comprar boletos");
        comprarBoletosButton.setOnAction(event -> comprarBoletos());
        
        Button consultaBoletosButton = new Button("Consulta de boletos");
        consultaBoletosButton.setOnAction(event -> consultarBoletos());

        textField = new TextField(); //ad
        Button registrarEventoButton = new Button("Registrar evento");
        registrarEventoButton.setOnAction(event -> registrarEvento());
        

        vbox = new VBox(10);//ad
        vbox.setPadding(new Insets(10));
        vbox.getChildren().addAll(textField, registrarEventoButton);
        
        listView = new ListView<>(eventosRegistrados);
        vbox.getChildren().add(listView);
//AD
        
        Button listadoUsuariosButton = new Button("Listado de usuarios");
        listadoUsuariosButton.setOnAction(event -> mostrarListadoUsuarios());

        Button salirButton = new Button("Salir");
        salirButton.setOnAction(event -> primaryStage.close());

        VBox root = new VBox(10);
        root.getChildren().addAll(
                verEventosButton,
                comprarBoletosButton,
                consultaBoletosButton,
                registrarEventoButton,
                listadoUsuariosButton,
                salirButton
        );
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    private void mostrarEventos() {
        
        Button button1 = new Button("Post Malone in concert (Twelve Carat Tour 2023):   09/09/2023: 8:00pm");
        button1.setOnAction(event -> showMessage("Lugares disponibles para Post Malone"));
        
        Button button2 = new Button("Linkin Park (In honor Chester Bennington):   10/10/2023: 9:00pm");
        button2.setOnAction(event -> showMessage("Lugares disponibles para el concierto"));
        
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

    private void comprarBoletos(){
        // Lógica para comprar boletos
        Button button1 = new Button("Asientos VIP+M&G");
        button1.setOnAction(event -> showMessage("¡Compraste un Asiento Tipo VIP+M&G!\nGRACIAS POR TU COMPRA"));
        
        Button button2 = new Button("Asientos VIP");
        button2.setOnAction(event -> showMessage("¡Compraste un Asiento Tipo VIP¡\nGRACIAS POR TU COMPRA"));
           
        Button button3 = new Button("Asientos PlateaA");
        button3.setOnAction(event -> showMessage("¡Compraste un Asiento Tipo PlateaA¡\nGRACIAS POR TU COMPRA"));
         
        Button button4 = new Button("Asientos PlateaB");
        button4.setOnAction(event -> showMessage("¡Compraste un Asiento Tipo PlateaB¡\nGRACIAS POR TU COMPRA"));
        
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

    private void showMessage(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Mensaje");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    
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

    private void registrarEvento() {
        // Lógica para registrar un evento
        String evento = textField.getText();
        eventosRegistrados.add(evento);
        textField.clear();
       }

    private void mostrarListadoUsuarios(){
        // Lógica para mostrar el listado de usuarios
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Listado de usuarios");
        alert.setHeaderText(null);
        alert.setContentText("USUARIOS REGISTRADOS:\n\nAdmin\nCliente");
        alert.showAndWait();
    }

    private void verEventos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  private void mostrarMensaje(String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Registro de Evento");
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
  
  
}
