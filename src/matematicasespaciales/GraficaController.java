package matematicasespaciales;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


public class GraficaController implements Initializable {
    
    @FXML static LineChart<Double, Double> graph;
    @FXML private NumberAxis x;
    @FXML private NumberAxis y;
    
   
    @FXML private void AccionPintar(ActionEvent event) throws IOException {
      
    }
    
     
    static public void pintarGraficaA(int a1,int a2,int a3){
        /*graph.getData().clear();
        XYChart.Series<Number,Number> series = new XYChart.Series<Number, Number>();
        series.getData().add(new XYChart.Data<Number, Number>(0,a1));
        series.getData().add(new XYChart.Data<Number, Number>(1,a2));
        series.getData().add(new XYChart.Data<Number, Number>(0,a3));
        graph.getData().add(series);*/
    }
    
    private void pintarGrafica () throws IOException{
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Sample.fxml"));
    Parent root1 = (Parent) fxmlLoader.load();
    Stage stage = new Stage();
    stage.initModality(Modality.APPLICATION_MODAL);
    stage.setTitle("Grafica de A");
    stage.setScene(new Scene(root1));  
    stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
}