import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11, 12, 13, 14));
        pane.setHgap(5);
        pane.setVgap(5);

        // Place nodes in the pane
        pane.getChildren().addAll(new Label("First Name:"),
                new TextField(), new Label("MI:"));
        TextField tfMi = new TextField();
        tfMi.setPrefColumnCount(2);
        pane.getChildren().addAll(tfMi, new Label("Last Name:"),
                new TextField());
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 250);
        stage.setTitle("ShowFlowPane");
        stage.setScene(scene);
        stage.show();

    }
}
