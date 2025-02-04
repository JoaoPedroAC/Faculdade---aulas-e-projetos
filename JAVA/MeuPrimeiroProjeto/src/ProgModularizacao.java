import javax.swing.*;

public class ProgModularizacao {

    // modulos
    public static int soma(int x, int y){
        int result = x + y;
        return result;
    };
    
    public static int subtracao(int x, int y){
        int result = x - y;
        return result;
    };

    public static double divisao(double x, double y){
        double result =  x / y;
        return result;
    };

    public static int multiplicacao(int x, int y){
        int result = x * y;
        return result;
    };

    public static void main(String[] args) {
        int n1, n2;
        String msg;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Escreva um numero aqui!"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Escreva outro numero aqui!"));
        int soma = soma(n1, n2);
        int sub = subtracao(n1, n2);
        double div = divisao(n1, n2);
        int mult = multiplicacao(n1, n2);
        msg = String.format("A soma dos numeros eh: %d \nA subtracao dos numeros eh: %d \nA divisao dos numeros eh: %.2f \nA multiplicacao dos numeros eh: %d", soma, sub, div, mult);


        JOptionPane.showMessageDialog(null, msg);
    }
}
