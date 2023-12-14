/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package scientificcalculator_group01.graphicInterface;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import scientificcalculator_group01.common_resources.ScientificCalculator;
import scientificcalculator_group01.exceptions.MathErrorException;
import scientificcalculator_group01.exceptions.StackErrorException;
import scientificcalculator_group01.exceptions.SyntaxErrorException;

/**
 *
 * 
 */
public class ScienticCalculator_Group01Controller implements Initializable {

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
    @FXML
    private Label inputNum;
    @FXML
    private Label stackn;
    @FXML
    private Label stackl;
    @FXML
    private Label inputLet;
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
    private Button dot;
    @FXML
    private Button sum;
    @FXML
    private Button mult;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button canc;
    @FXML
    private Button diff;
    @FXML
    private Button div;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button inver;
    @FXML
    private Button sqrt;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button clear;
    @FXML
    private Button over;
    @FXML
    private Button magg;
    @FXML
    private Button min;
    @FXML
    private Button complex;
    @FXML
    private Button zero;
    @FXML
    private Button drop;
    @FXML
    private Button dup;
    @FXML
    private Button swap;
    @FXML
    private Button enter;

    private ScientificCalculator calculator;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // rendo invisibile il pannello delle lettere
        LA.setVisible(false);
        binding();
        calculator = new ScientificCalculator();
    }

    public void binding() {
        LA.setVisible(false);

        numbersToLetters.setOnAction((event) -> {
            NA.setVisible(false);
            LA.setVisible(true);
        });

        lettersToNumbers.setOnAction((event) -> {
            NA.setVisible(true);
            LA.setVisible(false);
        });

    }

    @FXML
    private void writeA(ActionEvent event) {
        inputNum.setText(inputNum.getText() + a.getText());
        inputLet.setText(inputLet.getText() + a.getText());
    }

    @FXML
    private void writeB(ActionEvent event) {
        inputNum.setText(inputNum.getText() + b.getText());
        inputLet.setText(inputLet.getText() + b.getText());
    }

    @FXML
    private void writeC(ActionEvent event) {
        inputNum.setText(inputNum.getText() + c.getText());
        inputLet.setText(inputLet.getText() + c.getText());
    }

    @FXML
    private void writeD(ActionEvent event) {
        inputNum.setText(inputNum.getText() + d.getText());
        inputLet.setText(inputLet.getText() + d.getText());
    }

    @FXML
    private void writeE(ActionEvent event) {
        inputNum.setText(inputNum.getText() + e.getText());
        inputLet.setText(inputLet.getText() + e.getText());
    }

    @FXML
    private void writeF(ActionEvent event) {
        inputNum.setText(inputNum.getText() + f.getText());
        inputLet.setText(inputLet.getText() + f.getText());
    }

    @FXML
    private void writeG(ActionEvent event) {
        inputNum.setText(inputNum.getText() + g.getText());
        inputLet.setText(inputLet.getText() + g.getText());
    }

    @FXML
    private void writeH(ActionEvent event) {
        inputNum.setText(inputNum.getText() + h.getText());
        inputLet.setText(inputLet.getText() + h.getText());
    }

    @FXML
    private void writeI(ActionEvent event) {
        inputNum.setText(inputNum.getText() + i.getText());
        inputLet.setText(inputLet.getText() + i.getText());
    }

    @FXML
    private void writeJ(ActionEvent event) {
        inputNum.setText(inputNum.getText() + j.getText());
        inputLet.setText(inputLet.getText() + j.getText());
    }

    @FXML
    private void writeK(ActionEvent event) {
        inputNum.setText(inputNum.getText() + k.getText());
        inputLet.setText(inputLet.getText() + k.getText());
    }

    @FXML
    private void writeL(ActionEvent event) {
        inputNum.setText(inputNum.getText() + l.getText());
        inputLet.setText(inputLet.getText() + l.getText());
    }

    @FXML
    private void writeM(ActionEvent event) {
        inputNum.setText(inputNum.getText() + m.getText());
        inputLet.setText(inputLet.getText() + m.getText());
    }

    @FXML
    private void writeN(ActionEvent event) {
        inputNum.setText(inputNum.getText() + n.getText());
        inputLet.setText(inputLet.getText() + n.getText());
    }

    @FXML
    private void writeO(ActionEvent event) {
        inputNum.setText(inputNum.getText() + o.getText());
        inputLet.setText(inputLet.getText() + o.getText());
    }

    @FXML
    private void writeP(ActionEvent event) {
        inputNum.setText(inputNum.getText() + p.getText());
        inputLet.setText(inputLet.getText() + p.getText());
    }

    @FXML
    private void writeQ(ActionEvent event) {
        inputNum.setText(inputNum.getText() + q.getText());
        inputLet.setText(inputLet.getText() + q.getText());
    }

    @FXML
    private void writeT(ActionEvent event) {
        inputNum.setText(inputNum.getText() + t.getText());
        inputLet.setText(inputLet.getText() + t.getText());
    }

    @FXML
    private void writeU(ActionEvent event) {
        inputNum.setText(inputNum.getText() + u.getText());
        inputLet.setText(inputLet.getText() + u.getText());
    }

    @FXML
    private void writeW(ActionEvent event) {
        inputNum.setText(inputNum.getText() + w.getText());
        inputLet.setText(inputLet.getText() + w.getText());
    }

    @FXML
    private void writeS(ActionEvent event) {
        inputNum.setText(inputNum.getText() + s.getText());
        inputLet.setText(inputLet.getText() + s.getText());
    }

    @FXML
    private void writeR(ActionEvent event) {
        inputNum.setText(inputNum.getText() + r.getText());
        inputLet.setText(inputLet.getText() + r.getText());
    }

    @FXML
    private void writeV(ActionEvent event) {
        inputNum.setText(inputNum.getText() + v.getText());
        inputLet.setText(inputLet.getText() + v.getText());
    }

    @FXML
    private void writeX(ActionEvent event) {
        inputNum.setText(inputNum.getText() + x.getText());
        inputLet.setText(inputLet.getText() + x.getText());
    }

    @FXML
    private void writeY(ActionEvent event) {
        inputNum.setText(inputNum.getText() + y.getText());
        inputLet.setText(inputLet.getText() + y.getText());
    }

    @FXML
    private void writeZ(ActionEvent event) {
        inputNum.setText(inputNum.getText() + z.getText());
        inputLet.setText(inputLet.getText() + z.getText());
    }

    @FXML
    private void writedot(ActionEvent event) {
        inputNum.setText(inputNum.getText() + dot.getText());
        inputLet.setText(inputLet.getText() + dot.getText());
    }

    @FXML
    private void makesum(ActionEvent event) {
        inputNum.setText(inputNum.getText() + sum.getText());
        inputLet.setText(inputLet.getText() + sum.getText());
    }

    @FXML
    private void makemult(ActionEvent event) {
        inputNum.setText(inputNum.getText() + mult.getText());
        inputLet.setText(inputLet.getText() + mult.getText());
    }

    @FXML
    private void make1(ActionEvent event) {
        inputNum.setText(inputNum.getText() + one.getText());
        inputLet.setText(inputLet.getText() + one.getText());

    }

    @FXML
    private void write2(ActionEvent event) {
        inputNum.setText(inputNum.getText() + two.getText());
        inputLet.setText(inputLet.getText() + two.getText());
    }

    @FXML
    private void write3(ActionEvent event) {
        inputNum.setText(inputNum.getText() + three.getText());
        inputLet.setText(inputLet.getText() + three.getText());
    }

    @FXML
    private void cancel(ActionEvent event) {
        inputNum.setText("");
        inputLet.setText("");
    }

    @FXML
    private void makediff(ActionEvent event) {
        inputNum.setText(inputNum.getText() + diff.getText());
        inputLet.setText(inputLet.getText() + diff.getText());
    }

    @FXML
    private void makediv(ActionEvent event) {
        inputNum.setText(inputNum.getText() + div.getText());
        inputLet.setText(inputLet.getText() + div.getText());
    }

    @FXML
    private void write4(ActionEvent event) {
        inputNum.setText(inputNum.getText() + four.getText());
        inputLet.setText(inputLet.getText() + four.getText());
    }

    @FXML
    private void make5(ActionEvent event) {
        inputNum.setText(inputNum.getText() + five.getText());
        inputLet.setText(inputLet.getText() + five.getText());
    }

    @FXML
    private void make6(ActionEvent event) {
        inputNum.setText(inputNum.getText() + six.getText());
        inputLet.setText(inputLet.getText() + six.getText());
    }

    @FXML
    private void makeinv(ActionEvent event) {
        inputNum.setText(inputNum.getText() + inver.getText());
        inputLet.setText(inputLet.getText() + inver.getText());
    }

    @FXML
    private void makesqrt(ActionEvent event) {
        inputNum.setText(inputNum.getText() + sqrt.getText());
        inputLet.setText(inputLet.getText() + sqrt.getText());
    }

    @FXML
    private void write7(ActionEvent event) {
        inputNum.setText(inputNum.getText() + seven.getText());
        inputLet.setText(inputLet.getText() + seven.getText());
    }

    @FXML
    private void write8(ActionEvent event) {
        inputNum.setText(inputNum.getText() + eight.getText());
        inputLet.setText(inputLet.getText() + eight.getText());
    }

    @FXML
    private void write9(ActionEvent event) {
        inputNum.setText(inputNum.getText() + nine.getText());
        inputLet.setText(inputLet.getText() + nine.getText());
    }

    @FXML
    private void writeClear(ActionEvent event) {
        inputNum.setText(inputNum.getText() + clear.getText());
        inputLet.setText(inputLet.getText() + clear.getText());
    }

    @FXML
    private void makeOver(ActionEvent event) {
        inputNum.setText(inputNum.getText() + over.getText());
        inputLet.setText(inputLet.getText() + over.getText());
    }

    @FXML
    private void writeMagg(ActionEvent event) {
        inputNum.setText(inputNum.getText() + magg.getText());
        inputLet.setText(inputLet.getText() + magg.getText());
    }

    @FXML
    private void writeMin(ActionEvent event) {
        inputNum.setText(inputNum.getText() + min.getText());
        inputLet.setText(inputLet.getText() + min.getText());
    }

    @FXML
    private void writeComplex(ActionEvent event) {
        inputNum.setText(inputNum.getText() + complex.getText());
        inputLet.setText(inputLet.getText() + complex.getText());
    }

    @FXML
    private void writeZero(ActionEvent event) {
        inputNum.setText(inputNum.getText() + zero.getText());
        inputLet.setText(inputLet.getText() + zero.getText());
    }

    @FXML
    private void writeDrop(ActionEvent event) {
        inputNum.setText(inputNum.getText() + drop.getText());
        inputLet.setText(inputLet.getText() + drop.getText());
    }

    @FXML
    private void writeDup(ActionEvent event) {
        inputNum.setText(inputNum.getText() + dup.getText());
        inputLet.setText(inputLet.getText() + dup.getText());
    }

    @FXML
    private void writeSwap(ActionEvent event) {
        inputNum.setText(inputNum.getText() + swap.getText());
        inputLet.setText(inputLet.getText() + swap.getText());
    }

    @FXML
    private void makeEnter(ActionEvent event) {
        try {
            calculator.calculate(inputNum.getText());
            inputNum.setText("");
            inputLet.setText("");
        } catch (MathErrorException e) {
            inputNum.setText("MATH ERROR");
            inputLet.setText("MATH ERROR");
        } catch (StackErrorException e) {
            inputNum.setText("STACK ERROR");
            inputLet.setText("STACK ERROR");
        } catch (SyntaxErrorException e) {
            inputNum.setText("SYNTAX ERROR");
            inputLet.setText("SYNTAX ERROR");
        } finally {
            String s = calculator.getTop12Numbers().toString();

            int pos1 = s.indexOf("[");
            int pos2 = s.indexOf("]");

            String sub = s.substring(pos1 + 1, pos2);

            stackn.setText(sub);
            stackl.setText(sub);
        }

    }

}
