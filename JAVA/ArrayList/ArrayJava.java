package ArrayList;


import javax.swing.*;
import java.util.*;

public class ArrayJava {

  public static void main(String[] args) {
    listaNumerica();


  }

  public static void listaNumerica() {
    ArrayList<Integer> listaNumero = new ArrayList<>(10);
    // cadastrar 3 numeros apenas
    for (int i = 0; i < 3; i++) {
      int input = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));
      listaNumero.add(input);
    }
    System.out.println("Apresentando a lista de números: " + listaNumero + "\n");
    
    // ordenar a lista
    Collections.sort(listaNumero);
    System.out.println("Apresentando a lista de números ordenada: " + listaNumero + "\n");

    // somar os valores da lista
    System.err.println("Apresentando a soma dos valores da lista: " + somaListaNumerica(listaNumero) + "\n");

  }

  public static int somaListaNumerica(ArrayList<Integer> listaNumero) {
    int soma = 0;
    for (int i = 0; i < listaNumero.size(); i++) {
      soma += listaNumero.get(i);
    }
    return soma;
  }
}