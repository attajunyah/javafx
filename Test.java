import javafx.application.Application;
import javafx.stage.Stage;

public class Test extends Application {
    public Test() {
        System.out.println("Test constructor is invoked");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("start method is invoked");
    }

    public static void main(String[] args) {
        System.out.println("launch application");
        launch(args);
    }
}
