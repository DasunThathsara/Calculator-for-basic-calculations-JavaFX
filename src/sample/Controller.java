package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField textField;
    @FXML
    private Button btn0;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;

    String cn = "";
    String ln = "";
    String sign = "";

    String result = "0";

    public void equal(javafx.event.ActionEvent event){

        if (sign.equals("+")) {
            try{
                result = String.valueOf(Integer.parseInt(cn) + Integer.parseInt(ln));
            }
            catch(Exception e){
                result = "E";
            }
        }
        else if (sign.equals("-")) {
            try{
                result = String.valueOf(Integer.parseInt(ln) - Integer.parseInt(cn));
            }
            catch(Exception e) {
                result = "E";
            }
        }
        else if (sign.equals("/")) {
            try{
                result = String.valueOf(Integer.parseInt(ln) / Integer.parseInt(cn));
            }
            catch(Exception e){
                result = "E : Zero Div Error";
            }

        }
        else if (sign.equals("*")) {
            try{
                result = String.valueOf(Integer.parseInt(cn) * Integer.parseInt(ln));
            }
            catch(Exception e) {
                result = "E";
            }
        }
        textField.setText(String.valueOf(result));
    }

    public void clear(javafx.event.ActionEvent event){
        textField.setText("");
        ln = "";
        cn = "";
        result = "0";
    }


    // Operators
    public void plus(javafx.event.ActionEvent event){
        textField.setText("");
        ln = cn;
        cn = "";
        sign = "+";
    }
    public void subs(javafx.event.ActionEvent event){
        textField.setText("");
        ln = cn;
        cn = "";
        sign = "-";
    }
    public void mul(javafx.event.ActionEvent event){
        textField.setText("");
        ln = cn;
        cn = "";
        sign = "*";
    }
    public void div(javafx.event.ActionEvent event){
        textField.setText("");
        ln = cn;
        cn = "";
        sign = "/";
    }



    // Numbers
    public void B0(javafx.event.ActionEvent event){
        cn += "0";
        textField.setText(cn);
    }
    public void B1(javafx.event.ActionEvent event){
        cn += "1";
        textField.setText(cn);
    }
    public void B2(javafx.event.ActionEvent event){
        cn += "2";
        textField.setText(cn);
    }
    public void B3(javafx.event.ActionEvent event){
        cn += "3";
        textField.setText(cn);
    }
    public void B4(javafx.event.ActionEvent event){
        cn += "4";
        textField.setText(cn);
    }
    public void B5(javafx.event.ActionEvent event){
        cn += "5";
        textField.setText(cn);
    }
    public void B6(javafx.event.ActionEvent event){
        cn += "6";
        textField.setText(cn);
    }
    public void B7(javafx.event.ActionEvent event){
        cn += "7";
        textField.setText(cn);
    }
    public void B8(javafx.event.ActionEvent event){
        cn += "8";
        textField.setText(cn);
    }
    public void B9(javafx.event.ActionEvent event){
        cn += "9";
        textField.setText(cn);
    }
}
