package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import utilitario.Utilitario;

public class MainViewController {

    private final Utilitario u = new Utilitario();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane anchorPaneButtons;

    @FXML
    private AnchorPane anchorPanePrincipal;

    @FXML
    private Button buttonAdicionar;

    @FXML
    private Button buttonApagar;

    @FXML
    private Button buttonDividir;

    @FXML
    private Button buttonDoubleZero;

    @FXML
    private Button buttonLimpar;

    @FXML
    private Button buttonMultiplicar;

    @FXML
    private Button buttonNumCinco;

    @FXML
    private Button buttonNumDois;

    @FXML
    private Button buttonNumNove;

    @FXML
    private Button buttonNumOito;

    @FXML
    private Button buttonNumQuatro;

    @FXML
    private Button buttonNumSeis;

    @FXML
    private Button buttonNumSete;

    @FXML
    private Button buttonNumTres;

    @FXML
    private Button buttonNumUm;

    @FXML
    private Button buttonPonto;

    @FXML
    private Button buttonPorcentagem;

    @FXML
    private Button buttonRemover;

    @FXML
    private Button buttonResultado;

    @FXML
    private Button buttonZero;

    @FXML
    private TextField labelResposta;

    @FXML
    private TextArea textAreaPrincipal;

    private double num1;
    private double num2;
    private String opcao;
    private String resultado;
    private int setNum2 = 0;

    @FXML
    public void handleButtonAdicionar() {

        opcao = "+";
        if (u.newOperacao(labelResposta, textAreaPrincipal))
        {
            num1 = Double.parseDouble(labelResposta.getText());
            textAreaPrincipal.setText(labelResposta.getText() + " " + opcao + " ");
        }
        else
        {
            num1 = Double.parseDouble(textAreaPrincipal.getText());
            String aux = textAreaPrincipal.getText();
            textAreaPrincipal.setText(aux + " " + opcao + " ");
        }

    }

    @FXML
    public void handleButtonRemover() {

        opcao = "-";
        if (u.newOperacao(labelResposta, textAreaPrincipal))
        {
            num1 = Double.parseDouble(labelResposta.getText());
            textAreaPrincipal.setText(labelResposta.getText() + " " + opcao + " ");
        }
        else
        {
            num1 = Double.parseDouble(textAreaPrincipal.getText());
            String aux = textAreaPrincipal.getText();
            textAreaPrincipal.setText(aux + " " + opcao + " ");
        }

    }

    @FXML
    public void handleButtonMultiplicar() {

        opcao = "*";
        if (u.newOperacao(labelResposta, textAreaPrincipal))
        {
            num1 = Double.parseDouble(labelResposta.getText());
            textAreaPrincipal.setText(labelResposta.getText() + " " + opcao + " ");
        }
        else
        {
            num1 = Double.parseDouble(textAreaPrincipal.getText());
            String aux = textAreaPrincipal.getText();
            textAreaPrincipal.setText(aux + " " + opcao + " ");
        }

    }

    @FXML
    public void handleButtonDividir() {

        opcao = "/";
        if (u.newOperacao(labelResposta, textAreaPrincipal))
        {
            num1 = Double.parseDouble(labelResposta.getText());
            textAreaPrincipal.setText(labelResposta.getText() + " " + opcao + " ");
        }
        else
        {
            num1 = Double.parseDouble(textAreaPrincipal.getText());
            String aux = textAreaPrincipal.getText();
            textAreaPrincipal.setText(aux + " " + opcao + " ");
        }

    }

    @FXML
    public void handleButtonPorcentagem() {

        opcao = "%";
        if (u.newOperacao(labelResposta, textAreaPrincipal))
        {
            num1 = Double.parseDouble(labelResposta.getText());
            textAreaPrincipal.setText(labelResposta.getText() + " " + opcao + " ");
        }
        else
        {
            num1 = Double.parseDouble(textAreaPrincipal.getText());
            String aux = textAreaPrincipal.getText();
            textAreaPrincipal.setText(aux + " " + opcao + " ");
        }

    }

    @FXML
    public void handleButtonApagar() {

        String aux = textAreaPrincipal.getText();
        if (!aux.isEmpty())
        {
            aux = "";
            for (int i = 0; i < (textAreaPrincipal.getText().length() - 1); i = i + 1)
            {
                aux = aux + textAreaPrincipal.getText().charAt(i);
            }
            textAreaPrincipal.setText(aux);
        }

    }

    @FXML
    public void handleButtonLimpar() {

        textAreaPrincipal.setText("");
        labelResposta.setText("");

    }

    @FXML
    public void handleButtonPonto() {

        if (textAreaPrincipal.getText().isEmpty())
        {
            textAreaPrincipal.setText("0.");
        }
        else
        {
            String aux = textAreaPrincipal.getText();
            textAreaPrincipal.setText(aux + ".");
        }

    }

    @FXML
    public void handleButtonDoubleZero() {

        if (!textAreaPrincipal.getText().isEmpty())
        {
            String aux = textAreaPrincipal.getText();
            textAreaPrincipal.setText(aux + "00");

        }

    }

    @FXML
    public void handleButtonZero() {

        if (!textAreaPrincipal.getText().isEmpty())
        {
            String aux = textAreaPrincipal.getText();
            textAreaPrincipal.setText(aux + "0");
        }

    }

    @FXML
    public void handleButtonNumUm() {

        String aux = textAreaPrincipal.getText();
        textAreaPrincipal.setText(aux + "1");

    }

    @FXML
    public void handleButtonNumDois() {

        String aux = textAreaPrincipal.getText();
        textAreaPrincipal.setText(aux + "2");

    }

    @FXML
    public void handleButtonNumTres() {

        String aux = textAreaPrincipal.getText();
        textAreaPrincipal.setText(aux + "3");

    }

    @FXML
    public void handleButtonNumQuatro() {

        String aux = textAreaPrincipal.getText();
        textAreaPrincipal.setText(aux + "4");

    }

    @FXML
    public void handleButtonNumCinco() {

        String aux = textAreaPrincipal.getText();
        textAreaPrincipal.setText(aux + "5");

    }

    @FXML
    public void handleButtonNumSeis() {

        String aux = textAreaPrincipal.getText();
        textAreaPrincipal.setText(aux + "6");

    }

    @FXML
    public void handleButtonNumSete() {

        String aux = textAreaPrincipal.getText();
        textAreaPrincipal.setText(aux + "7");

    }

    @FXML
    public void handleButtonNumOito() {

        String aux = textAreaPrincipal.getText();
        textAreaPrincipal.setText(aux + "8");

    }

    @FXML
    public void handleButtonNumNove() {

        String aux = textAreaPrincipal.getText();
        textAreaPrincipal.setText(aux + "9");

    }

    @FXML
    public void handleButtonResultado() {

        String aux = "";
        if (!textAreaPrincipal.getText().isEmpty())
        {
            for (int i = 0; i < textAreaPrincipal.getText().length(); i = i + 1) {
                if (textAreaPrincipal.getText().charAt(i) == ' ') {
                    setNum2 = setNum2 + 1;
                } else if (setNum2 == 2) {
                    aux = aux + textAreaPrincipal.getText().charAt(i);
                }
            }
            num2 = Double.parseDouble(aux);

            resultado = u.gerarResultado(num1, num2, opcao);
            if (u.testInt(resultado))
            {
                String aux2 = "";
                for (int i = 0; i < resultado.length() - 2; i = i + 1)
                {
                    aux2 = aux2 + resultado.charAt(i);
                }
                resultado = aux2;
            }

            labelResposta.setText(resultado);

            textAreaPrincipal.setText("");

            setNum2 = 0;
        }
        else if (!labelResposta.getText().isEmpty())
        {
            aux = labelResposta.getText();
            labelResposta.setText(aux);
        }
        else if (labelResposta.getText().isEmpty() && textAreaPrincipal.getText().isEmpty())
        {
            labelResposta.setText("");
        }

        System.out.println(num1);
        System.out.println(opcao);
        System.out.println(num2);

    }

    @FXML
    void initialize() {
        assert anchorPaneButtons != null : "fx:id=\"anchorPaneButtons\" was not injected: check your FXML file 'MainView.fxml'.";
        assert anchorPanePrincipal != null : "fx:id=\"anchorPanePrincipal\" was not injected: check your FXML file 'MainView.fxml'.";
        assert buttonAdicionar != null : "fx:id=\"buttonAdicionar\" was not injected: check your FXML file 'MainView.fxml'.";
        assert buttonApagar != null : "fx:id=\"buttonApagar\" was not injected: check your FXML file 'MainView.fxml'.";
        assert buttonDividir != null : "fx:id=\"buttonDividir\" was not injected: check your FXML file 'MainView.fxml'.";
        assert buttonDoubleZero != null : "fx:id=\"buttonDoubleZero\" was not injected: check your FXML file 'MainView.fxml'.";
        assert buttonLimpar != null : "fx:id=\"buttonLimpar\" was not injected: check your FXML file 'MainView.fxml'.";
        assert buttonMultiplicar != null : "fx:id=\"buttonMultiplicar\" was not injected: check your FXML file 'MainView.fxml'.";
        assert buttonNumCinco != null : "fx:id=\"buttonNumCinco\" was not injected: check your FXML file 'MainView.fxml'.";
        assert buttonNumDois != null : "fx:id=\"buttonNumDois\" was not injected: check your FXML file 'MainView.fxml'.";
        assert buttonNumNove != null : "fx:id=\"buttonNumNove\" was not injected: check your FXML file 'MainView.fxml'.";
        assert buttonNumOito != null : "fx:id=\"buttonNumOito\" was not injected: check your FXML file 'MainView.fxml'.";
        assert buttonNumQuatro != null : "fx:id=\"buttonNumQuatro\" was not injected: check your FXML file 'MainView.fxml'.";
        assert buttonNumSeis != null : "fx:id=\"buttonNumSeis\" was not injected: check your FXML file 'MainView.fxml'.";
        assert buttonNumSete != null : "fx:id=\"buttonNumSete\" was not injected: check your FXML file 'MainView.fxml'.";
        assert buttonNumTres != null : "fx:id=\"buttonNumTres\" was not injected: check your FXML file 'MainView.fxml'.";
        assert buttonNumUm != null : "fx:id=\"buttonNumUm\" was not injected: check your FXML file 'MainView.fxml'.";
        assert buttonPonto != null : "fx:id=\"buttonPonto\" was not injected: check your FXML file 'MainView.fxml'.";
        assert buttonPorcentagem != null : "fx:id=\"buttonPorcentagem\" was not injected: check your FXML file 'MainView.fxml'.";
        assert buttonRemover != null : "fx:id=\"buttonRemover\" was not injected: check your FXML file 'MainView.fxml'.";
        assert buttonResultado != null : "fx:id=\"buttonResultado\" was not injected: check your FXML file 'MainView.fxml'.";
        assert buttonZero != null : "fx:id=\"buttonZero\" was not injected: check your FXML file 'MainView.fxml'.";
        assert labelResposta != null : "fx:id=\"labelResposta\" was not injected: check your FXML file 'MainView.fxml'.";
        assert textAreaPrincipal != null : "fx:id=\"textAreaPrincipal\" was not injected: check your FXML file 'MainView.fxml'.";

        textAreaPrincipal.setWrapText(true);

    }

}
