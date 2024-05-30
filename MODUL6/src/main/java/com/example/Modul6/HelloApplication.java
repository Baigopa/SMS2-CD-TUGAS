package com.example.Modul6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.text.*;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        Text sceneTitle = new Text("Halaman Login");
        sceneTitle.setFont(Font.font("tahoma", FontWeight.NORMAL, 20));
        GridPane.setConstraints(sceneTitle, 0 ,0 ,2 ,1);
        grid.getChildren().add(sceneTitle);

        Label usernameLabel = new Label("Username:");
        GridPane.setConstraints(usernameLabel, 0, 1);
        TextField usernameField = new TextField();
        GridPane.setConstraints(usernameField, 1, 1);

        Label passwordLabel = new Label("Password:");
        GridPane.setConstraints(passwordLabel, 0, 2);
        PasswordField passwordField = new PasswordField();
        GridPane.setConstraints(passwordField, 1, 2);

        Button loginButton = new Button("Login");
        GridPane.setConstraints(loginButton, 1, 3);

        Label statusLabel = new Label();
        GridPane.setConstraints(statusLabel, 1, 4);

        loginButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();

            if (username.equals("admin") && password.equals("admin")) {
                statusLabel.setText("Login berhasil!");
                statusLabel.setStyle(""); // Clear any previous styles
                openNewPage(primaryStage);
            } else {
                statusLabel.setText("Username atau password salah!");
                statusLabel.setStyle("-fx-text-fill: red;"); // Set text color to red
            }
        });

        grid.getChildren().addAll(usernameLabel, usernameField, passwordLabel, passwordField, loginButton, statusLabel);

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void openNewPage(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        Label welcomeLabel = new Label("Halo Yogi!");
        GridPane.setConstraints(welcomeLabel, 25, 15);

        grid.getChildren().addAll(welcomeLabel);

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}