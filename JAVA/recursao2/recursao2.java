package recursao2;

import javax.swing.*;

public class recursao2 {
  // Recursão sem cauda

  static void fatorialSemCauda(int n, int x, int f) {
    if (x == 0 || x == 1) {
      System.out.println("O Fatorial de " + x + " é: " + f);
    } else {
      System.out.println("Fatorial de " + n + " é " + x + " resultando em " + f);
      fatorialSemCauda(n, x - 1, f * n);
    }
    System.exit(0);
  }

  // Recursão com cauda
  static int fatorialComCauda(int n) {
    int f;

    if (n == 0) {
      return 1;
    } else {
      f = n * fatorialComCauda(n - 1);
      System.out.println("Fatorial de " + n + " resultando em " + f);
      return f;
    }
  }

  public static void main(String[] args) {
    int entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular o fatorial: "));

    if (entrada < 0) {
      System.out.println("Número inválido. O fatorial não é definido para números negativos.");
      System.exit(0);
    } else {
      // fatorialSemCauda(entrada, entrada, 1);
      fatorialComCauda(entrada);
    }

    // System.out.print("Fatorial com cauda: ");

  }
}
