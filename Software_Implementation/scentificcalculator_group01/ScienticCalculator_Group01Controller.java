/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scentificcalculator_group01;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author auror
 */
public class ScienticCalculator_Group01Controller implements Initializable {

    @FXML
    private StackPane lettersStackPane;
    @FXML
    private AnchorPane NA;
    @FXML
    private Button numbersToLetters;
    @FXML
    private AnchorPane LA;
    @FXML
    private Button lettersToNumbers;
    @FXML
    private Button a;
    @FXML
    private Button b;
    @FXML
    private Button c;
    @FXML
    private Button d;
    @FXML
    private Button e;
    @FXML
    private Button f;
    @FXML
    private Button g;
    @FXML
    private Button h;
    @FXML
    private Button i;
    @FXML
    private Button j;
    @FXML
    private Button m;
    @FXML
    private Button n;
    @FXML
    private Button o;
    @FXML
    private Button p;
    @FXML
    private Button q;
    @FXML
    private Button t;
    @FXML
    private Button u;
    @FXML
    private Button w;
    @FXML
    private Button l;
    @FXML
    private Button k;
    @FXML
    private Button s;
    @FXML
    private Button r;
    @FXML
    private Button v;
    @FXML
    private Button x;
    @FXML
    private Button y;
    @FXML
    private Button z;
    @FXML
    private Label inputNum;
    @FXML
    private Label stackn;
    @FXML
    private Label stackl;
    @FXML
    private Label inputLet;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        LA.setVisible(false);
        
        numbersToLetters.setOnAction((event) -> {
            NA.setVisible(false);
            LA.setVisible(true);  
        });
        
        lettersToNumbers.setOnAction((event) -> {
            NA.setVisible(true);
            LA.setVisible(false); 
        });
        
        /*for(char letter = 'a'; letter <= 'z'; letter++){ //SI DEVE FARE UN ARRAY DI BOTTONI
            letter.setOnAction((event) -> {
                inputNum.setText(inputNum.getText() + a.getText());
                inputLet.setText(inputLet.getText() + a.getText());
        
        });
        }*/
    }    
    
    
}
