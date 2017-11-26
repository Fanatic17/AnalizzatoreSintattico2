package GUI;

import javafx.application.Application;
import javafx.scene.control.Accordion;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import main.ParseProgram;

public class Gui extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Analizzatore Sintattico");
        TextField program = new TextField();
        program.setPromptText("Inserisci il programma");
        TreeView<String> visual = new TreeView<>();

        HBox layout= new HBox();
        BorderPane pannello = new BorderPane();
        pannello.setTop(layout);
        layout.getChildren().addAll(program,visual);


        primaryStage.show();
    }


    public void printGUI(String input){

        System.out.print(input);

    }
}
