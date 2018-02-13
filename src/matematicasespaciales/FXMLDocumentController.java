/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicasespaciales;

import static matematicasespaciales.GraficaController.graph;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Fabian Portillo Moreno
 */
public class FXMLDocumentController implements Initializable {

    static int flagA = 0;
    static int flagB = 0;
    static int flagGA = 0;
    static int flagGB = 0;
    static int flagresta = 0;
    static int flagsuma = 0;
    static int flagmultiplicar = 0;
    static int flagdividir = 0;
    
    
    @FXML
    private Button graft;
    @FXML
    private Accordion intervaloA,resultado;
    @FXML
    private TitledPane AlfaCortesA;
    @FXML
    private TitledPane pertenenciaA;
    @FXML
    private TitledPane TripletaA;
    @FXML
    private Button graft1;
    @FXML
    private Accordion intervaloA1;
    @FXML
    private TitledPane TripletaB;
    @FXML
    private TitledPane pertenenciaB;
    @FXML
    private TitledPane AlfaCortesB;
    @FXML
    static Button sumt2, grafa, grafb;
    @FXML
    private TextField alfaA1, TripA1, TripB1,perA2,perA2_1,perA2_2,perA2_3;
    @FXML
    private TextField alfaA1_1, TripA2, TripB2,perA3_3,perA3_2,perA3_1,perA3;
    @FXML
    private TextField alfaA2, TripA3, TripB3;
    @FXML
    private TextField alfaA2_2,perA1,perA1_1,perA1_2,perA1_3;
    @FXML
    private TextField alfaA3,perB3,perB3_1,perB3_2,perB3_3;
    @FXML
    private TextField alfaA3_3,perB2,perB2_1,perB2_2,perB2_3;
    @FXML
    private TextField alfaB1,perB1,perB1_1,perB1_2,perB1_3;
    @FXML
    private TextField alfaB1_1;
    @FXML
    private TextField alfaB2;
    @FXML
    private TextField alfaB2_2;
    @FXML
    private TextField alfaB3;
    @FXML
    private TextField alfaB3_3;
    @FXML
    private Text alfaT1, alfaTB1, tripb1, tripa1,pertRR2;
    @FXML
    private Text alfaT2, alfaTB2, tripb2, tripa2,pertRR3;
    @FXML
    private Text alfaT3, alfaTB3, tripb3, tripa3;
    @FXML
    private Text alfaT4, alfaTB4, TripT1,tripRB1;
    @FXML
    private Text alfaT5, alfaTB5, TripT2,tripRB2,pertR2;
    @FXML
    private Text alfaT6, alfaTB6, TripT3,tripRB3,pertR2_1;
    @FXML
    private Text alfaT7, alfaTB7, TripTitulo,pertR1_1;
    @FXML
    private Text alfaT8, alfaTB8, TripTB1,pertRR1,pertR3;
    @FXML
    private Text alfaT9, alfaTB9, TripTB2;
    @FXML
    private Text alfaT10, alfaTB10, TripTB3;
    @FXML
    private Text alfaT11, alfaTB11,pertR1,pertRR4;
    @FXML
    private Text alfaT12, alfaTB12,pertR3_3;
    @FXML
    private Text alfaT13, alfaTB13;
    @FXML
    private Text alfaT14, alfaTB14,alfaRR90;
    @FXML
    private Text alfaT15, alfaTB15,alfaRR3;
    @FXML
    private Text alfaT16, alfaTB16;
    @FXML
    private Text alfaT17, alfaTB17,alfaRR4;
    @FXML
    private Button BotonVA, botonVB, botonVTB, botonVTA;
    @FXML
    static Text aLfaTitulo;
    @FXML
    static Text alfaRA0;
    @FXML
    static Text alfaRA1,alfaRR1;
    @FXML
    static Text alfaRA2,alfaRR2;
    @FXML
    static Text alfaRA3,alfaRR30;
    @FXML
    static Text alfaRA4;
    @FXML
    static Text alfaRA5;
    @FXML
    static Text alfaRA6;
    @FXML
    static Text alfaRA7;
    @FXML
    static Text alfaRA8;
    @FXML
    static Text alfaRA9;
    @FXML
    static Text alfaRA10;
    @FXML
    static Text alfaRA11;
    @FXML
    static Text alfaRB11;
    @FXML
    static Text alfaRB1;
    @FXML
    static Text alfaRB2;
    @FXML
    static Text alfaRB3;
    @FXML
    static Text alfaRB4;
    @FXML
    static Text alfaRB5;
    @FXML
    static Text alfaRB6;
    @FXML
    static Text alfaRB7;
    @FXML
    static Text alfaRB8;
    @FXML
    static Text alfaRB9;
    @FXML
    static Text alfaRB10;
    @FXML
    static Text alfaRB12;
    @FXML
    static Text alfaTitulo1;

    @FXML
    static Button botonSumar;
    @FXML
    static Button botonRestar;
    @FXML
    static Button botonMultiplicar;
    @FXML
    static Button botonDividir;
    @FXML 
    static Text TripTituloB;

    @FXML
    private void verGrafica(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Grafica.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Grafica");
        stage.setScene(new Scene(root1));
        stage.show();
        obtenerPuntosA();
    }

    public void obtenerPuntosA() {

        double a1 = Double.parseDouble(tripa1.getText());
        double a2 = Double.parseDouble(tripa2.getText());
        double a3 = Double.parseDouble(tripa3.getText());
        
        graph.getData().clear();
        XYChart.Series<Double, Double> series = new XYChart.Series<Double, Double>();
        series.getData().add(new XYChart.Data<Double, Double>(a1, 0.0));
        series.getData().add(new XYChart.Data<Double, Double>(a2, 1.0));
        series.getData().add(new XYChart.Data<Double, Double>(a3, 0.0));
        series.setName("Intervalo A");
        
        
        graph.getData().add(series);
        double b1 = Double.parseDouble(alfaB1.getText());
        double b2 = Double.parseDouble(alfaB2.getText());
        double b3 = Double.parseDouble(alfaB3.getText());
        XYChart.Series<Double, Double> seriesB = new XYChart.Series<Double, Double>();
        seriesB.getData().add(new XYChart.Data<Double, Double>(b1, 0.0));
        seriesB.getData().add(new XYChart.Data<Double, Double>(b2, 1.0));
        seriesB.getData().add(new XYChart.Data<Double, Double>(b3, 0.0));
        seriesB.setName("Intervalo B");
        graph.getData().add(seriesB);
        
        
        if (flagsuma ==1 ){
        double r1 = Double.parseDouble(tripRB1.getText());
        double r2 = Double.parseDouble(tripRB2.getText());
        double r3 = Double.parseDouble(tripRB3.getText());
        XYChart.Series<Double, Double> serie = new XYChart.Series<Double, Double>();
        serie.getData().add(new XYChart.Data<Double, Double>(r1, 0.0));
        serie.getData().add(new XYChart.Data<Double, Double>(r2, 1.0));
        serie.getData().add(new XYChart.Data<Double, Double>(r3, 0.0));
        serie.setName("Suma");
        graph.getData().add(serie);  
        }
        
        if (flagresta ==1 ){
        double r1 = Double.parseDouble(tripRB1.getText());
        double r2 = Double.parseDouble(tripRB2.getText());
        double r3 = Double.parseDouble(tripRB3.getText());
        XYChart.Series<Double, Double> serie = new XYChart.Series<Double, Double>();
        serie.getData().add(new XYChart.Data<Double, Double>(r1, 0.0));
        serie.getData().add(new XYChart.Data<Double, Double>(r2, 1.0));
        serie.getData().add(new XYChart.Data<Double, Double>(r3, 0.0));
        serie.setName("Resta");
        graph.getData().add(serie);  
        }
        
        if (flagmultiplicar ==1 ){     
         ObservableList<XYChart.Series<Double, Double>> lineChartData = FXCollections.observableArrayList();
         XYChart.Series<Double, Double> ser = new XYChart.Series<Double, Double>();
         
         double r3 = Double.parseDouble(tripRB3.getText());
         double r1 = Double.parseDouble(tripRB1.getText());
         
        double rA1 = Double.parseDouble(alfaRA1.getText());
        double rA2 = Double.parseDouble(alfaRA4.getText());
        
        double rA3 = Double.parseDouble(alfaRA7.getText());
        double rA4 = Double.parseDouble(alfaRA10.getText());
        
        double rB1 = Double.parseDouble(alfaRB2.getText());
        double rB2 = Double.parseDouble(alfaRB5.getText());
        
        double rB3 = Double.parseDouble(alfaRB8.getText());
        double rB4 = Double.parseDouble(alfaRB11.getText());
         
        //Intervalo 1
        double rm1 = rA1 * rB1; // Da el cuadrado 
        double rm2 = rA1 * rB2; // Da 1 grado
        
        double rm3 = rA2 * rB1; // Da 1 grado
        double rm4 = rA2 * rB2; // Termino indepentediente
        
        //Intervalo 2
        double rm5 = rA3 * rB3; // Da el cuadrado 
        double rm6 = rA3 * rB4; // Da 1 grado
        
        double rm7 = rA4 * rB3; //Da 1 grado
        double rm8 = rA4 * rB4;  // Termino independiente
        
        double grado1 = rm2+rm3;
        double grado2 = -(rm6+rm7);
        
        System.out.println("Cuadrado1: " +rm1);
        System.out.println("Cuadrado2: " +rm5);
        System.out.println("grado1: " +grado1);
        System.out.println("grado2: " +grado2);
        System.out.println("idependiente: " +rm4);
        System.out.println("idependiente2: " +rm8);
         for (double i = 0.0; i<1.0; i=i+0.1){
            ser.getData().add(new XYChart.Data<Double, Double>((rm1*(Math.pow(i, 2)))+(grado1*(i))+rm4,i));
        }
        for (double i = 0.0; i<=1.0; i=i+0.1){
            ser.getData().add(new XYChart.Data<Double, Double>((rm5*(Math.pow(i, 2)))+(grado2*(i))+rm8,i));
        }
        lineChartData.add(ser);
        ser.setName("Multiplicacion");
        graph.setData(lineChartData); 
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void ActivarAlfaA(javafx.scene.input.MouseEvent event) {
        AlfaCortesA.setExpanded(true);
        AlfaCortesB.setExpanded(true);
    }

    @FXML
    private void ActivarAlfaB(javafx.scene.input.MouseEvent event) {
        AlfaCortesA.setExpanded(true);
        AlfaCortesB.setExpanded(true);
    }

    @FXML
    private void ActivarTripleA(javafx.scene.input.MouseEvent event) {
        TripletaA.setExpanded(true);
        TripletaB.setExpanded(true);
    }

    @FXML
    private void ActivarTripleB(javafx.scene.input.MouseEvent event) {
        TripletaA.setExpanded(true);
        TripletaB.setExpanded(true);
    }

    @FXML
    private void ActivarFuncionB(javafx.scene.input.MouseEvent event) {
        pertenenciaA.setExpanded(true);
        pertenenciaB.setExpanded(true);
    }

    @FXML
    private void ActivarFuncionA(javafx.scene.input.MouseEvent event) {
        pertenenciaA.setExpanded(true);
        pertenenciaB.setExpanded(true);
    }

    @FXML
    private void alfaA1Key1(javafx.scene.input.KeyEvent event) {
        alfaA1_1.setText(alfaA1.getText());
    }

    @FXML
    private void validarCamposALFA(javafx.scene.input.KeyEvent event) {
        char c = event.getCharacter().charAt(0);
        if (!(Character.isDigit(c))) {
            alfaA1.setText("");
            alfaA1_1.setText("");
            alfaA2.setText("");
            alfaA2_2.setText("");
            alfaA3.setText("");
            alfaA3_3.setText("");
        }
    }

    @FXML
    private void alfaA1Key1_1(javafx.scene.input.KeyEvent event) {
        alfaA1.setText(alfaA1_1.getText());
    }

    @FXML
    private void alfaA1Key2(javafx.scene.input.KeyEvent event) {
        alfaA2_2.setText(alfaA2.getText());
    }

    @FXML
    private void alfaA1Key2_2(javafx.scene.input.KeyEvent event) {
        alfaA2.setText(alfaA2_2.getText());
    }

    @FXML
    private void alfaA1Key3(javafx.scene.input.KeyEvent event) {
        alfaA3_3.setText(alfaA3.getText());
    }

    @FXML
    private void alfaA1Key3_3(javafx.scene.input.KeyEvent event) {
        alfaA3.setText(alfaA3_3.getText());
    }

    @FXML
    private void ValidarAlfaA(ActionEvent event) {

        if (alfaA1.getText().isEmpty() || alfaA1_1.getText().isEmpty() || alfaA2.getText().isEmpty() || alfaA2_2.getText().isEmpty() || alfaA3.getText().isEmpty() || alfaA3_3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor llene los espacios vacios");
        } else {
            int a1 = Integer.parseInt(alfaA1.getText());
            int a2 = Integer.parseInt(alfaA2.getText());
            int a3 = Integer.parseInt(alfaA3.getText());
            if (a1 > a2) {
                JOptionPane.showMessageDialog(null, "A1 debe ser menor que A2");
            }
            if (a2 > a3) {
                JOptionPane.showMessageDialog(null, "A2 debe ser menor que A3");
            }
            if (a1 < a2 && a2 < a3) {
                desactivarAlfaA();
                flagA++;
                calcularTripletaA(a1, a2, a3);
                calcularAlfaCortes(a1, a2, a3);
                calcularPertenenciaA(a1, a2, a3);
            }
        }
    }
    private void calcularPertenenciaA(int a1,int a2,int a3){
        perA1.setText(String.valueOf(a1));
        perA1_1.setText(String.valueOf(a1));
        perA1_2.setText(String.valueOf(a1));
        perA1_3.setText(String.valueOf(a1));
        perA2.setText(String.valueOf(a2));
        perA2_1.setText(String.valueOf(a2));
        perA2_2.setText(String.valueOf(a2));
        perA2_3.setText(String.valueOf(a2));
        perA3.setText(String.valueOf(a3));
        perA3_1.setText(String.valueOf(a3));
        perA3_2.setText(String.valueOf(a3));
        perA3_3.setText(String.valueOf(a3));
        desactivarPerA();
        
    }
    
    private void calcularPertenenciaB(int a1,int a2,int a3){
        perB1.setText(String.valueOf(a1));
        perB1_1.setText(String.valueOf(a1));
        perB1_2.setText(String.valueOf(a1));
        perB1_3.setText(String.valueOf(a1));
        perB2.setText(String.valueOf(a2));
        perB2_1.setText(String.valueOf(a2));
        perB2_2.setText(String.valueOf(a2));
        perB2_3.setText(String.valueOf(a2));
        perB3.setText(String.valueOf(a3));
        perB3_1.setText(String.valueOf(a3));
        perB3_2.setText(String.valueOf(a3));
        perB3_3.setText(String.valueOf(a3));
        desactivarPerB();
        
    }
    private void desactivarAlfaB() {
        alfaTB1.setVisible(false);
        alfaB1.setVisible(false);
        alfaB1_1.setVisible(false);
        alfaB2.setVisible(false);
        alfaB2_2.setVisible(false);
        alfaB3.setVisible(false);
        alfaB3_3.setVisible(false);
        alfaTB2.setVisible(false);
        alfaTB3.setVisible(false);
        alfaTB4.setVisible(false);
        alfaTB5.setVisible(false);
        alfaTB6.setVisible(false);
        alfaTB7.setVisible(false);
        alfaTB8.setVisible(false);
        alfaTB9.setVisible(false);
        alfaTB10.setVisible(false);
        alfaTB11.setVisible(false);
        alfaTB12.setVisible(false);
        alfaTB13.setVisible(false);
        alfaTB14.setVisible(false);
        alfaTB15.setVisible(false);
        alfaTB16.setVisible(false);
        alfaTB17.setVisible(false);
        botonVB.setVisible(false);
    }

    private void desactivarAlfaA() {
        alfaA1.setVisible(false);
        alfaA1_1.setVisible(false);
        alfaA2.setVisible(false);
        alfaA2_2.setVisible(false);
        alfaA3.setVisible(false);
        alfaA3_3.setVisible(false);
        alfaT1.setVisible(false);
        alfaT2.setVisible(false);
        alfaT3.setVisible(false);
        alfaT4.setVisible(false);
        alfaT5.setVisible(false);
        alfaT6.setVisible(false);
        alfaT7.setVisible(false);
        alfaT8.setVisible(false);
        alfaT9.setVisible(false);
        alfaT10.setVisible(false);
        alfaT11.setVisible(false);
        alfaT12.setVisible(false);
        alfaT13.setVisible(false);
        alfaT14.setVisible(false);
        alfaT15.setVisible(false);
        alfaT16.setVisible(false);
        alfaT17.setVisible(false);
        BotonVA.setVisible(false);
    }

    private void desactivarTripletaA() {
        TripA1.setVisible(false);
        TripA2.setVisible(false);
        TripA3.setVisible(false);
        TripT1.setVisible(false);
        TripT2.setVisible(false);
        TripT3.setVisible(false);
        botonVTA.setVisible(false);
    }

    private void calcularTripletaA(int a1, int a2, int a3) {
        tripa1.setText(String.valueOf(a1));
        tripa2.setText(String.valueOf(a2));
        tripa3.setText(String.valueOf(a3));
        tripa1.setVisible(true);
        tripa2.setVisible(true);
        tripa3.setVisible(true);
        TripTitulo.setVisible(true);
        desactivarTripletaA();
    }

    private void desactivarTripletaB() {
        TripTB1.setVisible(false);
        TripTB2.setVisible(false);
        TripTB3.setVisible(false);
        tripb1.setVisible(true);
        tripb2.setVisible(true);
        tripb3.setVisible(true);
        botonVTB.setVisible(false);
        TripB1.setVisible(false);
        TripB2.setVisible(false);
        TripB3.setVisible(false);

    }

    private void calcularTripletaB(int a1, int a2, int a3) {
        tripb1.setText(String.valueOf(a1));
        tripb2.setText(String.valueOf(a2));
        tripb3.setText(String.valueOf(a3));
        tripb1.setVisible(true);
        tripb2.setVisible(true);
        tripb3.setVisible(true);
        TripTituloB.setVisible(true);
        TripB1.setVisible(true);
        TripB2.setVisible(true);
        TripB3.setVisible(true);
        desactivarTripletaB();
        calcularAlfaCortes(a1, a2, a3);
    }

    @FXML
    private void ValidarAlfaB(ActionEvent event) {

        if (alfaB1.getText().isEmpty() || alfaB1_1.getText().isEmpty() || alfaB2.getText().isEmpty() || alfaB2_2.getText().isEmpty() || alfaB3.getText().isEmpty() || alfaB3_3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor llene los espacios vacios");
        } else {
            int a1 = Integer.parseInt(alfaB1.getText());
            int a2 = Integer.parseInt(alfaB2.getText());
            int a3 = Integer.parseInt(alfaB3.getText());
            if (a1 > a2) {
                JOptionPane.showMessageDialog(null, "A1 debe ser menor que A2");
            }
            if (a2 > a3) {
                JOptionPane.showMessageDialog(null, "A2 debe ser menor que A3");
            }
            if (a1 < a2 && a2 < a3) {
                flagB++;
                calcularTripletaB(a1, a2, a3);
                calcularAlfaCortes(a1, a2, a3);
                calcularPertenenciaB(a1,a2,a3);
                desactivarAlfaB();
                desactivarTripletaB();
            }
        }
    }

    static public void calcularAlfaCortes(int a1, int a2, int a3) {
        if (flagA == 1) {
            int alfaA1 = a2 - a1;
            int alfaA2 = a3 - a2;
            aLfaTitulo.setVisible(true);
            alfaRA1.setText(String.valueOf(alfaA1));
            alfaRA4.setText(String.valueOf(a1));
            alfaRA7.setText(String.valueOf(alfaA2));
            alfaRA10.setText(String.valueOf(a3));
            alfaRA0.setVisible(true);
            alfaRA1.setVisible(true);
            alfaRA2.setVisible(true);
            alfaRA3.setVisible(true);
            alfaRA4.setVisible(true);
            alfaRA5.setVisible(true);
            alfaRA6.setVisible(true);
            alfaRA7.setVisible(true);
            alfaRA8.setVisible(true);
            alfaRA9.setVisible(true);
            alfaRA10.setVisible(true);
            alfaRA11.setVisible(true);
            flagA++;
        }
        if (flagB == 1) {
            int alfaB1 = a2 - a1;
            int alfaB2 = a3 - a2;
            alfaTitulo1.setVisible(true);
            alfaRB2.setText(String.valueOf(alfaB1));
            alfaRB5.setText(String.valueOf(a1));
            alfaRB8.setText(String.valueOf(alfaB2));
            alfaRB5.setText(String.valueOf(a1));
            alfaRB11.setText(String.valueOf(a3));
            alfaRB11.setVisible(true);
            alfaRB1.setVisible(true);
            alfaRB2.setVisible(true);
            alfaRB3.setVisible(true);
            alfaRB4.setVisible(true);
            alfaRB5.setVisible(true);
            alfaRB6.setVisible(true);
            alfaRB7.setVisible(true);
            alfaRB8.setVisible(true);
            alfaRB9.setVisible(true);
            alfaRB10.setVisible(true);
            alfaRB12.setVisible(true);
            flagB++;
        }
        if (flagB == 2 && flagA == 2) {
            botonSumar.setDisable(false);
            botonRestar.setDisable(false);
            botonDividir.setDisable(false);
            botonMultiplicar.setDisable(false);
            grafa.setDisable(false);
        }
    }

    @FXML
    private void alfaB1Key1(javafx.scene.input.KeyEvent event) {
        alfaB1_1.setText(alfaB1.getText());
    }

    @FXML
    private void alfaB1Key1_1(javafx.scene.input.KeyEvent event) {
        alfaB1.setText(alfaB1_1.getText());
    }

    @FXML
    private void alfaB1Key2(javafx.scene.input.KeyEvent event) {
        alfaB2_2.setText(alfaB2.getText());
    }

    @FXML
    private void alfaB1Key2_2(javafx.scene.input.KeyEvent event) {
        alfaB2.setText(alfaB2_2.getText());
    }

    @FXML
    private void alfaB1Key3(javafx.scene.input.KeyEvent event) {
        alfaB3_3.setText(alfaB3.getText());
    }

    @FXML
    private void alfaB1Key3_3(javafx.scene.input.KeyEvent event) {
        alfaB3.setText(alfaB3_3.getText());
    }

    @FXML
    private void ValidarTripA(ActionEvent event) {
        if (TripA1.getText().isEmpty() || TripA2.getText().isEmpty() || TripA3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor llene los espacios vacios");
        } else {
            int a1 = Integer.parseInt(TripA1.getText());
            int a2 = Integer.parseInt(TripA2.getText());
            int a3 = Integer.parseInt(TripA3.getText());
            if (a1 > a2) {
                JOptionPane.showMessageDialog(null, "a1 debe ser menor que a2");
            }
            if (a2 > a3) {
                JOptionPane.showMessageDialog(null, "a2 debe ser menor que a3");
            }
            if (a1 < a2 && a2 < a3) {
                TripA1.setVisible(false);
                TripA2.setVisible(false);
                TripA3.setVisible(false);
                tripa1.setText(TripA1.getText());
                tripa2.setText(TripA2.getText());
                tripa3.setText(TripA3.getText());
                tripa1.setVisible(true);
                tripa2.setVisible(true);
                tripa3.setVisible(true);
                TripTitulo.setVisible(true);
                TripT1.setVisible(false);
                TripT2.setVisible(false);
                TripT3.setVisible(false);
                botonVTA.setVisible(false);
                alfaA1.setText(tripa1.getText());
                alfaA2.setText(tripa2.getText());
                alfaA3.setText(tripa3.getText());
                flagA++;
                calcularAlfaCortes(a1, a2, a3);
                desactivarAlfaA();
                calcularPertenenciaA(a1,a2,a3);
            }
        }
    }

    @FXML
    private void ValidarTripB(ActionEvent event) {
        if (TripB1.getText().isEmpty() || TripB2.getText().isEmpty() || TripB3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor llene los espacios vacios");
        } else {
            int a1 = Integer.parseInt(TripB1.getText());
            int a2 = Integer.parseInt(TripB2.getText());
            int a3 = Integer.parseInt(TripB3.getText());
            if (a1 > a2) {
                JOptionPane.showMessageDialog(null, "a1 debe ser menor que a2");
            }
            if (a2 > a3) {
                JOptionPane.showMessageDialog(null, "a2 debe ser menor que a3");
            }
            if (a1 < a2 && a2 < a3) {
                tripb1.setText(TripB1.getText());
                tripb2.setText(TripB2.getText());
                tripb3.setText(TripB3.getText());
                alfaB1.setText(tripb1.getText());
                alfaB2.setText(tripb2.getText());
                alfaB3.setText(tripb3.getText());
                TripTituloB.setVisible(true);
                flagB++;
                calcularAlfaCortes(a1, a2, a3);
                calcularPertenenciaB(a1,a2,a3);
                desactivarAlfaB();
                desactivarTripletaB();
            }
        }
    }
  
    @FXML 
    private void sumar(ActionEvent event){
        flagresta=0;
        flagdividir = 0;
        flagmultiplicar = 0;
        int a1 = Integer.parseInt(tripa1.getText());
        int a2 = Integer.parseInt(tripa2.getText());
        int a3 = Integer.parseInt(tripa3.getText());
        int b1 = Integer.parseInt(tripb1.getText());
        int b2 = Integer.parseInt(tripb2.getText());
        int b3 = Integer.parseInt(tripb3.getText());
       
        int tripR1 = a1+b1;
        int tripR2 = a2+b2;
        int tripR3 = a3+b3;
        
        int alfa1 = a2-a1;
        int alfa2 = a3-a2;
        
        int alfb1 = b2-b1;
        int alfb2 = b3-b2;
        
        int resulalf1 = alfa1+alfb1;
        int resulalf2 = alfa2+alfb2;
        int ra1 = a1+b1;
        int ra3 = a3+b3;
        
       alfaRR1.setText(String.valueOf(resulalf1));
       alfaRR2.setText(String.valueOf(ra1));
       alfaRR3.setText(String.valueOf(resulalf2));
       alfaRR4.setText(String.valueOf(ra3));
       
       tripRB1.setText(String.valueOf(tripR1));
       tripRB2.setText(String.valueOf(tripR2));
       tripRB3.setText(String.valueOf(tripR3));
       resultado.setDisable(false);
       
       calcularPertenenciaResultado();
       flagsuma++;
    }
    
    @FXML 
    private void restar(ActionEvent event){
        flagsuma = 0;
        flagmultiplicar = 0;
        flagdividir = 0;
        int a1 = Integer.parseInt(tripa1.getText());
        int a2 = Integer.parseInt(tripa2.getText());
        int a3 = Integer.parseInt(tripa3.getText());
        
        int b1 = Integer.parseInt(tripb1.getText());
        int b2 = Integer.parseInt(tripb2.getText());
        int b3 = Integer.parseInt(tripb3.getText());

        int tripR1 = a1 - b1;
        int tripR2 = a2 - b2;
        int tripR3 = a3 - b3;

        int alfa1 = a2 - a1;
        int alfa2 = a3 - a2;

        int alfb1 = b2 - b1;
        int alfb2 = b3 - b2;

        int resulalf1 = alfa1 - alfb1;
        int resulalf2 = alfa2 - alfb2;
        int ra1 = a1 - b1;
        int ra3 = a3 - b3;

        alfaRR1.setText(String.valueOf(resulalf1));
        alfaRR2.setText(String.valueOf(ra1));
        alfaRR3.setText(String.valueOf(resulalf2));
        alfaRR4.setText(String.valueOf(ra3));

        tripRB1.setText(String.valueOf(tripR1));
        tripRB2.setText(String.valueOf(tripR2));
        tripRB3.setText(String.valueOf(tripR3));
        resultado.setDisable(false);
        calcularPertenenciaResultado();
        flagresta++;
    }
    
     @FXML 
    private void multiplicar(ActionEvent event){
        flagsuma = 0;
        flagresta = 0;
        flagdividir = 0;
        int a1 = Integer.parseInt(tripa1.getText());
        int a2 = Integer.parseInt(tripa2.getText());
        int a3 = Integer.parseInt(tripa3.getText());
        
        int b1 = Integer.parseInt(tripb1.getText());
        int b2 = Integer.parseInt(tripb2.getText());
        int b3 = Integer.parseInt(tripb3.getText());
        
        int tripR1 = a1 * b1;
        int tripR2 = a2 * b2;
        int tripR3 = a3 * b3;

        int alfa1 = a2 - a1;
        int alfa2 = a3 - a2;

        int alfb1 = b2 - b1;
        int alfb2 = b3 - b2;

        int resulalf1 = alfa1 * alfb1;
        int resulalf2 = alfa2 * alfb2;
        
        int ra1 = a1 * b1;
        int ra3 = a3 * b3;
        
        if (a1 > 0 && a2 > 0 && a3 > 0 && a3 > 0 && b1 > 0 && b2 > 0 && b3 > 0 ){
        alfaRR1.setText(String.valueOf(resulalf1));
        alfaRR2.setText(String.valueOf(ra1));
        alfaRR3.setText(String.valueOf(resulalf2));
        alfaRR4.setText(String.valueOf(ra3));

        tripRB1.setText(String.valueOf(tripR1));
        tripRB2.setText(String.valueOf(tripR2));
        tripRB3.setText(String.valueOf(tripR3));
        alfaRR30.setText("α²");
        alfaRR90.setText("α²");
        calcularPertenenciaResultado();
        resultado.setDisable(false);
         }
        flagmultiplicar++;
    }
    
    @FXML
    private void perA1Key(javafx.scene.input.KeyEvent event) { 
        perA1_2.setText(perA1.getText());
        perA1_1.setText(perA1.getText());
        perA1_3.setText(perA1.getText());    
    }
    @FXML
    private void perA1_1Key(javafx.scene.input.KeyEvent event) {
        perA1.setText(perA1_1.getText());
        perA1_2.setText(perA1_1.getText());
        perA1_3.setText(perA1_1.getText());
    }
    @FXML
    private void perA1_2Key(javafx.scene.input.KeyEvent event) {
        perA1.setText(perA1_2.getText());
        perA1_1.setText(perA1_2.getText());
        perA1_3.setText(perA1_2.getText());
    }
    @FXML
    private void perA1_3Key(javafx.scene.input.KeyEvent event) {
        perA1.setText(perA1_3.getText());
        perA1_1.setText(perA1_3.getText());
        perA1_2.setText(perA1_3.getText());
    }
    
     @FXML
    private void perA2Key(javafx.scene.input.KeyEvent event) { 
        perA2_2.setText(perA2.getText());
        perA2_1.setText(perA2.getText());
        perA2_3.setText(perA2.getText());    
    }
    @FXML
    private void perA2_1Key(javafx.scene.input.KeyEvent event) {
        perA2.setText(perA2_1.getText());
        perA2_2.setText(perA2_1.getText());
        perA2_3.setText(perA2_1.getText());
    }
    @FXML
    private void perA2_2Key(javafx.scene.input.KeyEvent event) {
        perA2.setText(perA2_2.getText());
        perA2_1.setText(perA2_2.getText());
        perA2_3.setText(perA2_2.getText());
    }
    @FXML
    private void perA2_3Key(javafx.scene.input.KeyEvent event) {
        perA2.setText(perA2_3.getText());
        perA2_1.setText(perA2_3.getText());
        perA2_2.setText(perA2_3.getText());
    }
@FXML
    private void perA3Key(javafx.scene.input.KeyEvent event) { 
        perA3_2.setText(perA3.getText());
        perA3_1.setText(perA3.getText());
        perA3_3.setText(perA3.getText());    
    }
    @FXML
    private void perA3_1Key(javafx.scene.input.KeyEvent event) {
        perA3.setText(perA3_1.getText());
        perA3_2.setText(perA3_1.getText());
        perA3_3.setText(perA3_1.getText());
    }
    @FXML
    private void perA3_2Key(javafx.scene.input.KeyEvent event) {
        perA3.setText(perA3_2.getText());
        perA3_1.setText(perA3_2.getText());
        perA3_3.setText(perA3_2.getText());
    }
    @FXML
    private void perA3_3Key(javafx.scene.input.KeyEvent event) {
        perA3.setText(perA3_3.getText());
        perA3_1.setText(perA3_3.getText());
        perA3_2.setText(perA3_3.getText());
    }
    @FXML
   private void validarPertenencia(ActionEvent event){
       if (perA3.getText().isEmpty() || perA1.getText().isEmpty() || perA2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor llene los espacios vacios");
        }else{
           int a1 = Integer.parseInt(perA1.getText()); 
           int a2 = Integer.parseInt(perA2.getText());
           int a3 = Integer.parseInt(perA3.getText());
           if (a1 > a2 || a2 > a3){
               JOptionPane.showMessageDialog(null, "Por favor, verifique los numeros");
           }
           desactivarPerA();
           desactivarAlfaA();
           flagA++;
           calcularTripletaA(a1, a2, a3);
           alfaA1.setText(tripa1.getText());
           alfaA2.setText(tripa2.getText());
           alfaA3.setText(tripa3.getText());
           calcularAlfaCortes(a1, a2, a3);
       }
   }
   
    @FXML
   private void validarPertenenciaB(ActionEvent event){
       if (perB3.getText().isEmpty() || perB1.getText().isEmpty() || perB2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor llene los espacios vacios");
        }else{
           int a1 = Integer.parseInt(perB1.getText()); 
           int a2 = Integer.parseInt(perB2.getText());
           int a3 = Integer.parseInt(perB3.getText());
           if (a1 > a2 || a2 > a3){
               JOptionPane.showMessageDialog(null, "Por favor, verifique los numeros");
           }
           desactivarPerB();
           desactivarAlfaB();
           flagB++;
           calcularTripletaB(a1, a2, a3);
           alfaB1.setText(tripb1.getText());
           alfaB2.setText(tripb2.getText());
           alfaB3.setText(tripb3.getText());
           calcularAlfaCortes(a1, a2, a3);
       }
   }
   
   private void desactivarPerB(){
       perB1.setDisable(true);
       perB1_1.setDisable(true);
       perB1_2.setDisable(true);
       perB1_3.setDisable(true);
       perB2.setDisable(true);
       perB2_1.setDisable(true);
       perB2_2.setDisable(true);
       perB2_3.setDisable(true);
       perB3.setDisable(true);
       perB3_1.setDisable(true);
       perB3_2.setDisable(true);
       perB3_3.setDisable(true);
               
   }
   
   private void desactivarPerA(){
       perA1.setDisable(true);
       perA1_1.setDisable(true);
       perA1_2.setDisable(true);
       perA1_3.setDisable(true);
       perA2.setDisable(true);
       perA2_1.setDisable(true);
       perA2_2.setDisable(true);
       perA2_3.setDisable(true);
       perA3.setDisable(true);
       perA3_1.setDisable(true);
       perA3_2.setDisable(true);
       perA3_3.setDisable(true);
               
   }
   
   @FXML
    private void perB1Key(javafx.scene.input.KeyEvent event) { 
        perB1_2.setText(perB1.getText());
        perB1_1.setText(perB1.getText());
        perB1_3.setText(perB1.getText());    
    }
    @FXML
    private void perB1_1Key(javafx.scene.input.KeyEvent event) {
        perB1.setText(perB1_1.getText());
        perB1_2.setText(perB1_1.getText());
        perB1_3.setText(perB1_1.getText());
    }
    @FXML
    private void perB1_2Key(javafx.scene.input.KeyEvent event) {
        perB1.setText(perB1_2.getText());
        perB1_1.setText(perB1_2.getText());
        perB1_3.setText(perB1_2.getText());
    }
    @FXML
    private void perB1_3Key(javafx.scene.input.KeyEvent event) {
        perB1.setText(perB1_3.getText());
        perB1_1.setText(perB1_3.getText());
        perB1_2.setText(perB1_3.getText());
    }
    
     @FXML
    private void perB2Key(javafx.scene.input.KeyEvent event) { 
        perB2_2.setText(perB2.getText());
        perB2_1.setText(perB2.getText());
        perB2_3.setText(perB2.getText());    
    }
    @FXML
    private void perB2_1Key(javafx.scene.input.KeyEvent event) {
        perB2.setText(perB2_1.getText());
        perB2_2.setText(perB2_1.getText());
        perB2_3.setText(perB2_1.getText());
    }
    @FXML
    private void perB2_2Key(javafx.scene.input.KeyEvent event) {
        perB2.setText(perB2_2.getText());
        perB2_1.setText(perB2_2.getText());
        perB2_3.setText(perB2_2.getText());
    }
    @FXML
    private void perB2_3Key(javafx.scene.input.KeyEvent event) {
        perB2.setText(perB2_3.getText());
        perB2_1.setText(perB2_3.getText());
        perB2_2.setText(perB2_3.getText());
    }
@FXML
    private void perB3Key(javafx.scene.input.KeyEvent event) { 
        perB3_2.setText(perB3.getText());
        perB3_1.setText(perB3.getText());
        perB3_3.setText(perB3.getText());    
    }
    @FXML
    private void perB3_1Key(javafx.scene.input.KeyEvent event) {
        perB3.setText(perB3_1.getText());
        perB3_2.setText(perB3_1.getText());
        perB3_3.setText(perB3_1.getText());
    }
    @FXML
    private void perB3_2Key(javafx.scene.input.KeyEvent event) {
        perB3.setText(perB3_2.getText());
        perB3_1.setText(perB3_2.getText());
        perB3_3.setText(perB3_2.getText());
    }
    @FXML
    private void perB3_3Key(javafx.scene.input.KeyEvent event) {
        perB3.setText(perB3_3.getText());
        perB3_1.setText(perB3_3.getText());
        perB3_2.setText(perB3_3.getText());
    }
    
    private void calcularPertenenciaResultado(){
      int a1 = Integer.parseInt(tripRB1.getText());  
      int a2 = Integer.parseInt(tripRB2.getText());  
      int a3 = Integer.parseInt(tripRB3.getText());
        
      int ra1 = a2-a1;
      int ra2 = a3-a2;
      
      pertR1.setText(String.valueOf(a1));
      pertRR1.setText(String.valueOf(a1));
      pertR1_1.setText(String.valueOf(a1));
      pertRR2.setText(String.valueOf(ra1));
      pertRR4.setText(String.valueOf(ra2));
      pertR2.setText(String.valueOf(a2));
      pertR2_1.setText(String.valueOf(a2));
      pertRR3.setText(String.valueOf(a3));
      pertR3.setText(String.valueOf(a3));
      pertR3_3.setText(String.valueOf(a3));
      
    }
    
     @FXML
    private void dividir(ActionEvent event) {
      // JOptionPane.showConfirmDialog(null, flagA)
    }
}
