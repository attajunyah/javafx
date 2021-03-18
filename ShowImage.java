import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ShowImage extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // Create a pane to hold the image views
        Pane pane = new HBox(50);
        pane.setPadding(new Insets(15, 15, 15, 15));
        Image image = new Image("images/sika.jpeg");
        pane.getChildren().add(new ImageView(image));

        ImageView imageView2 = new ImageView(image);
        imageView2.setFitHeight(300);
        imageView2.setFitWidth(200);
        pane.getChildren().add(imageView2);

        ImageView imageView3 = new ImageView(image);
        imageView3.setRotate(90);
        pane.getChildren().add(imageView3);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        stage.setTitle("ShowImage");
        stage.setScene(scene);
        stage.show();

    }
}
