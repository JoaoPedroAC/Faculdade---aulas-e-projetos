package matrizes;

import javax.swing.*;

public class Somar {
  public static void main(String args []) {
    int MatSoma[][], r, c, soma = 0; // r = row and c = column
    MatSoma = new int[10][12]; // 10x12 matrix

    String entradaLinha = javax.swing.JOptionPane.showInputDialog("Quantidade de linhas (Máximo 10 linhas)");
    String entradaColuna = javax.swing.JOptionPane.showInputDialog("Quantidade de colunas(Máximo 12 colunas)");
    String entradaSoma = JOptionPane.showInputDialog("Quantos números você deseja somar? (Máximo 100)");

    for (r = 0; r < Integer.parseInt(entradaLinha); r++) {
      for (c = 0; c < Integer.parseInt(entradaColuna); c++) {
        MatSoma[r][c] = Integer.parseInt(entradaSoma);
        soma += MatSoma[r][c];
        System.out.println("Matriz[" + r + "][" + c + "] = " + MatSoma[r][c] + " + " + (soma - Integer.parseInt(entradaSoma)) + " - Soma parcial: " + soma);
      }
    }
    // System.out.println("A soma dos números é: " + soma);
    javax.swing.JOptionPane.showMessageDialog(null, "A soma dos números é: " + soma);
    System.exit(0);

  }
}
