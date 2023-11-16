import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try { 
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml")); 
            ScrollPane scrollPane = loader.load(); 

            // agora a MenuBar ocupa toda a largura e altura da tela
            scrollPane.setFitToHeight(true);
            scrollPane.setFitToWidth(true);

            Scene mainScene = new Scene(scrollPane); 
            primaryStage.setScene(mainScene); 
            primaryStage.setTitle("Sample JavaFX application"); 
            primaryStage.show(); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
    }
}
