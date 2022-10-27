package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.SpringJavaConfig;
import ui.controllers.RootLayoutController;

import java.io.IOException;

public class StoryMoneyApplication extends Application {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringJavaConfig.class);

    public static void main(String[] arg) {
//        LauncherImpl.launchApplication(StoryMoneyApplication.class, arg);
        launch();
    }

    @Override
    public void start(Stage stage) {
        try {

            FXMLLoader fxmlLoader = applicationContext.getBean("rootLayout", FXMLLoader.class);
            stage.setScene(new Scene(fxmlLoader.load()));
            ((RootLayoutController) fxmlLoader.getController()).init();

        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle("Учет расходов и доходов");
        stage.setResizable(false);
        stage.show();
    }
}
