package vetores;
import javax.swing.*;

class Somar {
    public static void main(String argumentos[]) {
      int VetSoma[], i, soma = 0;
      VetSoma = new int[100];
      String entrada = JOptionPane.showInputDialog("Quantos números você deseja somar? (Máximo 100)");
      for (i = 0; i < VetSoma.length; i++) {
          VetSoma[i] = Integer.parseInt(entrada);
          soma += VetSoma[i];
          System.out.println("Vetor[" + i + "] = " + VetSoma[i] + " - Soma parcial: " + soma);
      }
      System.out.println("A soma dos números é: " + soma);
      System.exit(0);
    }
}
