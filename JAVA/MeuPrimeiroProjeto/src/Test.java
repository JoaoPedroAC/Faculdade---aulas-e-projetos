import javax.swing.*;
public class Test {
    public static void main(String[] args) {
        //Declaracao de variaveis
        int num01, num02, div;
        double pot;
        String msg = "";

        // Entrada de dados
        num01 = Integer.parseInt(JOptionPane.showInputDialog("escreva o teu numero aqui!")); // inputs que captam e transformam string em inteiro
        num02 = Integer.parseInt(JOptionPane.showInputDialog("escreva o teu outro numero aqui!"));

        // Processamento
        div = (int)num01 / (int)num02;
        pot = Math.pow(num01, num02);

        // Saidas
        msg = "Seu primeiro numero foi " + num01 + " e o segundo foi " + num02 + "\n";
        msg = msg + "Quociente da divisão do 1º numero e 2º numero foi: " + div + "\n";
        msg = msg + "A potencia do 1º numero pelo 2º numero foi: " + pot + "\n";
        JOptionPane.showMessageDialog(null, msg); // mostra a mensagem com resultado
    }
}
