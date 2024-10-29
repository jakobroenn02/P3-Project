package p3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("Start method running");
        try{
            Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
            if (root == null){
                System.out.println("FXML not loaded!");
                return;
            }
            System.out.println("FXML loaded successfully");
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
            System.out.println("CSS loaded successfully");
            primaryStage.setTitle("Hello JavaFX!");
            primaryStage.setScene(scene);
            primaryStage.show();
            System.out.println("window running");
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}