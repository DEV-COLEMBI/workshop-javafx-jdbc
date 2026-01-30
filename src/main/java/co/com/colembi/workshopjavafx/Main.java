package co.com.colembi.workshopjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        URL url = getClass().getResource("/co/com/colembi/workshopjavafx/gui/ViewMain.fxml");
        System.out.println(url);
      FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/com/colembi/workshopjavafx/gui/ViewMain.fxml"));
        Parent parent = loader.load();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("WorkShopJavaFX");
        stage.show();
    }
}
