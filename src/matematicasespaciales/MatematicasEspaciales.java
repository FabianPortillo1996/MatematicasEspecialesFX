/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicasespaciales;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TitledPane;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;


public class MatematicasEspaciales extends Application {
    
        
    @Override
    public void start(Stage stage) throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Pinta Funciones");
        stage.setScene(scene);
        stage.show();
        
        /*arent loader = FXMLLoader.load(getClass().getResource("Pricinpal.fxml"));
        loader.setController(new Controller());
        stage.setScene(new Scene((Parent) loader.load()));
        //Scene scene = new Scene(root.load());
        stage.setTitle("Pinta Funciones");
       // stage.setScene(scene);
        stage.show();*/
    }

    public static void main(String[] args) {
        launch(args);
    }
}

