package sample.Calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Optional;

import javax.lang.model.util.ElementScanner6;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import javafx.event.ActionEvent;

public class Calculator {

    ScriptEngineManager sem=new ScriptEngineManager();
    ScriptEngine se=sem.getEngineByName("JavaScript");
    

    //TextFields
    @FXML TextField txtopera, txtresult;
    //Buttons Funciones
    @FXML Button btnAC,btnEraser,btnPorcentaje,btnDivision,btnMulti,btnResta,btnSuma,btnEquals;
    //Buttons Numbers
    @FXML Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    //Buttons Special
    @FXML Button btnMasMenos,btnDecimal;

    //Actions of Buttons Funciones
    @FXML
    private void btnAC(ActionEvent event){
        txtopera.setText("");
        txtresult.setText("");
        btnAC.setDisable(false);
        btnEraser.setDisable(false);
        btnPorcentaje.setDisable(false);
        btnDivision.setDisable(false);
        btnMulti.setDisable(false);
        btnResta.setDisable(false);
        btnSuma.setDisable(false);
        btnEquals.setDisable(false);
        btn0.setDisable(false);
        btn1.setDisable(false);
        btn2.setDisable(false);
        btn3.setDisable(false);
        btn4.setDisable(false);
        btn5.setDisable(false);
        btn6.setDisable(false);
        btn7.setDisable(false);
        btn8.setDisable(false);
        btn9.setDisable(false);
        btnMasMenos.setDisable(false);
        btnDecimal.setDisable(false);
        txtopera.setEditable(false);
        txtresult.setEditable(false);
    }

    @FXML
    private void btnEraser(ActionEvent event){
        if(txtopera.getText().length() !=0){
            txtopera.setText(txtopera.getText().substring(0,txtopera.getText().length()-1));
        }else{

        }

    }

    @FXML
    private void btnDecimal(ActionEvent event){
        addNumber(".");
    }


    @FXML
    private void btnPorcentaje(ActionEvent event){
        addNumber("%");
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Sintax Error");
                alert.setContentText("Al parecer sucedio un error inesperado al resolver la operación");
                Optional<ButtonType> action = alert.showAndWait();
                if (action.get()==ButtonType.OK){
                    txtopera.setText("Verifique su licencia");
                    txtresult.setText("Error");
                    btnAC.setDisable(false);
                    btnEraser.setDisable(true);
                    btnPorcentaje.setDisable(true);
                    btnDivision.setDisable(true);
                    btnMulti.setDisable(true);
                    btnResta.setDisable(true);
                    btnSuma.setDisable(true);
                    btnEquals.setDisable(true);
                    btn0.setDisable(true);
                    btn1.setDisable(true);
                    btn2.setDisable(true);
                    btn3.setDisable(true);
                    btn4.setDisable(true);
                    btn5.setDisable(true);
                    btn6.setDisable(true);
                    btn7.setDisable(true);
                    btn8.setDisable(true);
                    btn9.setDisable(true);
                    btnMasMenos.setDisable(true);
                    btnDecimal.setDisable(true);
                    txtopera.setEditable(false);
                    txtresult.setEditable(false);
                }if(action.get()==ButtonType.CANCEL){
                   txtopera.setText("Verifique su licencia");
                   btnAC.setDisable(false);
                    btnEraser.setDisable(true);
                    btnPorcentaje.setDisable(true);
                    btnDivision.setDisable(true);
                    btnMulti.setDisable(true);
                    btnResta.setDisable(true);
                    btnSuma.setDisable(true);
                    btnEquals.setDisable(true);
                    btn0.setDisable(true);
                    btn1.setDisable(true);
                    btn2.setDisable(true);
                    btn3.setDisable(true);
                    btn4.setDisable(true);
                    btn5.setDisable(true);
                    btn6.setDisable(true);
                    btn7.setDisable(true);
                    btn8.setDisable(true);
                    btn9.setDisable(true);
                    btnMasMenos.setDisable(true);
                    btnDecimal.setDisable(true);
                    txtopera.setEditable(false);
                    txtresult.setEditable(false);
                }
    }

    @FXML
    private void btnDivision(ActionEvent event){
        addNumber("/");
    }

    @FXML
    private void btnMulti(ActionEvent event){
        addNumber("x");
    }

    @FXML
    private void btnResta(ActionEvent event){
        addNumber("-");
    }

    @FXML
    private void btnSuma(ActionEvent event){
        addNumber("+");
    }

    @FXML
    private void btnEquals(ActionEvent event){
        igua();
    }

    //Actions of Buttons Numbers
    @FXML
    private void btn0(ActionEvent event){
        addNumber("0");
        igual();

    }

    @FXML
    private void btn1(ActionEvent event){
        addNumber("1");
        igual();

    }

    @FXML
    private void btn2(ActionEvent event){
        addNumber("2");
        igual();


    }

    @FXML
    private void btn3(ActionEvent event){
        addNumber("3");
        igual();

    }

    @FXML
    private void btn4(ActionEvent event){
        addNumber("4");
        igual();
    }

    @FXML
    private void btn5(ActionEvent event){
        addNumber("5");
        igual();
    }

    @FXML
    private void btn6(ActionEvent event){
        addNumber("6");
        igual();
    }

    @FXML
    private void btn7(ActionEvent event){
        addNumber("7");
        igual();
    }

    @FXML
    private void btn8(ActionEvent event){
        addNumber("8");
        igual();
    }

    @FXML
    private void btn9(ActionEvent event){
        addNumber("9");
        igual();
    }
    
    //Actions of Buttons Specials
    @FXML
    private void btnMasMenos(ActionEvent event){
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Sintax Error");
        alert.setContentText("Al parecer sucedio un error inesperado al resolver la operación");
        Optional<ButtonType> action = alert.showAndWait();
        if (action.get()==ButtonType.OK){
            txtopera.setText("Verifique su licencia");
            txtresult.setText("Error");
            btnAC.setDisable(false);
            btnEraser.setDisable(true);
            btnPorcentaje.setDisable(true);
            btnDivision.setDisable(true);
            btnMulti.setDisable(true);
            btnResta.setDisable(true);
            btnSuma.setDisable(true);
            btnEquals.setDisable(true);
            btn0.setDisable(true);
            btn1.setDisable(true);
            btn2.setDisable(true);
            btn3.setDisable(true);
            btn4.setDisable(true);
            btn5.setDisable(true);
            btn6.setDisable(true);
            btn7.setDisable(true);
            btn8.setDisable(true);
            btn9.setDisable(true);
            btnMasMenos.setDisable(true);
            btnDecimal.setDisable(true);
            txtopera.setEditable(false);
            txtresult.setEditable(false);
        }if(action.get()==ButtonType.CANCEL){
           txtopera.setText("Verifique su licencia");
           btnAC.setDisable(false);
            btnEraser.setDisable(true);
            btnPorcentaje.setDisable(true);
            btnDivision.setDisable(true);
            btnMulti.setDisable(true);
            btnResta.setDisable(true);
            btnSuma.setDisable(true);
            btnEquals.setDisable(true);
            btn0.setDisable(true);
            btn1.setDisable(true);
            btn2.setDisable(true);
            btn3.setDisable(true);
            btn4.setDisable(true);
            btn5.setDisable(true);
            btn6.setDisable(true);
            btn7.setDisable(true);
            btn8.setDisable(true);
            btn9.setDisable(true);
            btnMasMenos.setDisable(true);
            btnDecimal.setDisable(true);
            txtopera.setEditable(false);
            txtresult.setEditable(false);
        }

    }

    //Operacion para los digitos
    public void addNumber(String digito){
        txtopera.setText(txtopera.getText()+digito);
    }

    public void igua(){
        /*try {
            String resultado = se.eval(txtopera.getText()).toString();
            txtresult.setText(resultado);
            txtresult.setText("");
            txtopera.setText(resultado);
         } catch (Exception e) {
            
        }*/

        try {
            if(txtresult.getText().length()>=5){
                Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Sintax Error");
                alert.setContentText("Al parecer sucedio un error inesperado al resolver la operación");
                Optional<ButtonType> action = alert.showAndWait();
                if (action.get()==ButtonType.OK){
                    txtopera.setText("Sintax");
                    txtresult.setText("Error");
                }if(action.get()==ButtonType.CANCEL){
                    String resultado = se.eval(txtopera.getText()).toString();
                    txtresult.setText(resultado);
                    txtresult.setText("");
                    txtopera.setText(resultado);
                }
            }else{
                String resultado = se.eval(txtopera.getText()).toString();
                txtresult.setText(resultado);
                txtresult.setText("");
                txtopera.setText(resultado);
            }
            
         } catch (Exception e) {
            
        }

        
    }

    //Sumando cada vez que se oprecione un número
    public void igual(){
        try {
            if(txtresult.getText().length()>=18){
                txtresult.setText("Sintaxis Error");
            }else{
                String resultado = se.eval(txtopera.getText()).toString();
                txtresult.setText(resultado);
            }
            
         } catch (Exception e) {
            
        }

    }

    
   
}
