package pilha;

import java.util.*;

public class pilha {
  public static void main(String[] args) {
    simularPilha();
  }


  public static void simularPilha() {
    // sua implementação aqui
    // Empilhe: 5, 8, 4, 7 (nesta ordem)
    Stack<Integer> pilha = new Stack<>();
    pilha.push(5);
    pilha.push(8);
    pilha.push(4);
    pilha.push(7);

    // o limite da pilha é 3
    if (pilha.size() > 3) { // size() retorna o número de elementos na pilha
      StackOverflowError e = new StackOverflowError("A pilha excedeu o limite de 3 elementos!\n");
      System.out.println(e.getMessage() + "Excluindo 1 item da pilha\n");
      pilha.pop(); // remove o elemento do topo da pilha
    } else {
      System.out.println("A pilha está dentro do limite de 3 elementos.\n");
      System.out.println("Pilha após empilhar" + pilha + " \n");
    }

    // Desempilhe duas vezes
    for (int i = 0; i <= 2; i++) {
      if (pilha.isEmpty()) {
      // Cheque se a pilha está vazia
        System.out.println("\nA pilha está vazia!");
        return;
      } else {
        System.out.println("\nA pilha não está vazia!");
        pilha.pop();
        System.out.println("Pilha após desempilhar 2x: " + pilha);
        i++;
      }
    }

    // Consulte o topo
    System.out.println("\nO elemento do topo atual é: " + pilha.peek() + "\n"); // peek() consulta o topo

    // Desempilhe mais duas vezes
    for (int i = 0; i <= 2; i++) {
      // Cheque se a pilha está vazia
      if (pilha.isEmpty()) {
        System.out.println("\nA pilha está vazia!");
      } else {
        System.out.println("\nA pilha não está vazia!");
        pilha.pop();
        System.out.println("Pilha após desempilhar mais 2x: " + pilha);
        i++;
      }
    }

  }

}
