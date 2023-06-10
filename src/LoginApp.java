import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class LoginApp extends Application {

    private static final String ADMIN_USERNAME = "Admin";
    private static final String ADMIN_PASSWORD = "brandon123";
    private static final String CLIENTE_USERNAME = "cliente";
    private static final String CLIENTE_PASSWORD = "cliente123";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Venta de Boletos y Gestor de Eventos EMSA");

        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label titleLabel = new Label("Venta de Boletos y Gestor de Eventos EMSA");
        titleLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(titleLabel, 0, 0, 2, 1);

        Label usernameLabel = new Label("Usuario:");
        grid.add(usernameLabel, 0, 1);

        TextField usernameTextField = new TextField();
        grid.add(usernameTextField, 1, 1);

        Label passwordLabel = new Label("Contraseña:");
        grid.add(passwordLabel, 0, 2);

        PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 2);

        Button loginButton = new Button("Iniciar sesión");
        grid.add(loginButton, 1, 3);

        loginButton.setOnAction(event -> {
            String username = usernameTextField.getText();
            String password = passwordField.getText();

            if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
                showMessageBox("Inicio de sesión exitoso como Admin");

                NewFXMain newFXMain = new NewFXMain();
                newFXMain.start(new Stage());

                primaryStage.close();
            } else if (username.equals(CLIENTE_USERNAME) && password.equals(CLIENTE_PASSWORD)) {
                showMessageBox("Inicio de sesión exitoso como Cliente");

                NewFXMain newFXMain = new NewFXMain();
                newFXMain.start(new Stage());

                primaryStage.close();
            } else {
                showMessageBox("Nombre de usuario o contraseña incorrectos");
            }
        });

        Button exitButton = new Button("Salir");
        grid.add(exitButton, 1, 4);

        exitButton.setOnAction(event -> {
            primaryStage.close();
        });

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showMessageBox(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Mensaje");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
