/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package scentificcalculator_group01;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

/**
 *
 * @author giuli
 */
public class ScienticCalculator_Group01Controller implements Initializable {
    
    private Label label;
    @FXML
    private StackPane lettersStackPane;
    @FXML
    private Button numbersToLetters;
    @FXML
    private Button lettersToNumbers;
    @FXML
    private AnchorPane NA;
    @FXML
    private AnchorPane LA;
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //rendo invisibile il pannello delle lettere
        LA.setVisible(false);
        binding();
    }
    
    public void binding(){
        NA.visibleProperty().setValue(Boolean.FALSE).bind(Bindings.when(numbersToLetters.pressedProperty()).then(NA.visibleProperty().setValue(Boolean.TRUE)));
    }
    
}
