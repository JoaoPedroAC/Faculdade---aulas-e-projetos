import javax.swing.*;
public class ProgramaSwing {
    public static void main(String entrada[]) {

        // Declaração de variaveis
        int n1, n2, resto;
        double raiz01, raiz02;
        String msg = "";

        // Entrada de dados
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite aqui um numero inteiro!"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite aqui outro numero inteiro!"));

        // Processamento
        resto = n1 % n2;
        raiz01 = Math.sqrt(n1);
        raiz02 = Math.sqrt(n2);

        // Saída de dados
        msg = "Resto da divisão de "+ n1 + " por " + n2 + " = " + resto + "\n";
        msg = msg + "Raiz quadrada de " + n1 + " = " + raiz01 + "\n";
        msg = msg + "Raiz quadrada de " + n2 + " = " + raiz02 + "\n";
        JOptionPane.showMessageDialog(null, msg);

    }
}
