import javafx.application.Application;
import javafx.stage.Stage;



public class Main extends Application {
    @Override
    public void start(Stage primaryStage){
        System.out.println("Start method running");
        primaryStage.setTitle("Hello JavaFX!");
        primaryStage.show();
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        launch(args);
    }
}
