package utilitario;


import controller.MainViewController;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Utilitario {

    private double resultado;

    public String gerarResultado(double num1, double num2, String operacao) {

        switch (operacao)
        {
            case "+":
            {
                resultado = somar(num1, num2);
                break;
            }
            case "-":
            {
                resultado = subtrair(num1, num2);
                break;
            }
            case "*":
            {
                resultado = multiplicar(num1, num2);
                break;
            }
            case "/":
            {
                resultado = dividir(num1, num2);
                break;
            }
            case "%":
            {
                resultado = porcentagem(num1, num2);
                break;
            }
        }

        return String.valueOf(resultado);

    }

    public boolean testInt(String resultado) {

        double doubleResultado = Double.parseDouble(resultado);
        return ((doubleResultado % 10) == 0);

    }

    public boolean newOperacao(TextField textField, TextArea textArea) {

        return (!textField.getText().isEmpty() && textArea.getText().isEmpty());

    }

    public double somar(double num1, double num2) {

        return Double.sum(num1, num2);

    }

    public double subtrair(double num1, double num2) {

        return somar(num1, multiplicar(num2, -1));

    }

    public double multiplicar(double num1, double num2) {

        return (double) (num1 * num2);

    }

    public double dividir(double num1, double num2) {

        return (double) (num1 / num2);

    }

    public double porcentagem(double num1, double num2) {

        return multiplicar(num2, dividir(num1, 100));

    }

}
