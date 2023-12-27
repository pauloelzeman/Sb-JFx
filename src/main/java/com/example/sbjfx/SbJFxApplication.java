package com.example.sbjfx;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.net.URL;


@SpringBootApplication
public class SbJFxApplication{

    public static void main(String[] args) {
        SpringApplication.run(SbJFxApplication.class, args);
     //   launch(args);
    }

/*
    @Override
    public void start(Stage primaryStage) throws Exception {
       URL arquivoFXML = getClass().getResource("Login.fxml");
       GridPane raiz = FXMLLoader.load(arquivoFXML);
       Scene cena = new Scene(raiz, 350, 350);

       primaryStage.setResizable(false);
       primaryStage.setTitle("Tela de Login");
       primaryStage.setScene(cena);
       primaryStage.show();
    }
    */
}
