import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class GhanaElections extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // Create a pane
        HBox pane = new HBox(20);
        pane.setAlignment(Pos.CENTER);

        // Create buttons
        Button btNana = new Button("Vote 4 Nana NPP");
        Button btJM = new Button("Vote 4 Mahama NDC");

        Vote4NanaHandler voteHandler1 = new Vote4NanaHandler();
        btNana.setOnAction(voteHandler1);

        Vote4MahamaHandler voteHandler2 = new Vote4MahamaHandler();
        btJM.setOnAction(voteHandler2);

        pane.getChildren().addAll(btNana, btJM);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        stage.setTitle("HandleEvent"); // Set the stage title
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage

    }
}

class Vote4NanaHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("4More4Nana");
    }
}

class Vote4MahamaHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("JMToaso");
    }
}