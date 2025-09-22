package ArvoreBinaria;

import javax.swing.*;

public class ArvoreBinaria {
  int valor;
  ArvoreBinaria esquerda, direita;
  private ArvoreBinaria raiz;

  ArvoreBinaria(int novoValor) {
    valor = novoValor;
    esquerda = direita = null;
  }

  public ArvoreBinaria inserir(ArvoreBinaria arvore, int novoValor) {
    if (novoValor < valor) {
      if (esquerda == null) {
        esquerda = new ArvoreBinaria(novoValor);
      } else {
        esquerda.inserir(esquerda, novoValor);
      }
    } else if (novoValor > valor) {
      if (direita == null) {
        direita = new ArvoreBinaria(novoValor);
      } else {
        direita.inserir(direita, novoValor);
      }
    } else {
      JOptionPane.showMessageDialog(null, "Valor já existe na árvore.");
    }
    return this;
  }

  public void inserirNo( int novoValor) {
    if (raiz == null) {
      raiz = new ArvoreBinaria(novoValor);
    } else {
      raiz.inserir(raiz, novoValor);
    }
  }

  public void exibirEsquerda() {
    if (esquerda != null) {
      esquerda.exibirEsquerda();
    }
    System.out.print(valor + " ");
  }

  public void exibirDireita() {
    System.out.print(valor + " ");
    if (direita != null) {
      direita.exibirDireita();
    }
  }

  public void exibirRaiz() {
    if (esquerda != null) {
      esquerda.exibirRaiz();
    }
    System.out.print(valor + " ");
    if (direita != null) {
      direita.exibirRaiz();
    }
  }

  public void exibirNoEsquerda() {
    if (raiz != null) {
      raiz.exibirEsquerda();
    } else {
      System.out.println("A árvore está vazia.");
    }
  }

  public void exibirNoDireita() {
    if (raiz != null) {
      raiz.exibirDireita();
    } else {
      System.out.println("A árvore está vazia.");
    }
  }

  public void exibirNo() {
    if (raiz != null) {
      raiz.exibirRaiz();
    } else {
      System.out.println("A árvore está vazia.");
    }
  }

  public void excluirNo(int valor) {
    raiz = excluir(raiz, valor);
  }

  private ArvoreBinaria excluir(ArvoreBinaria arvore, int valor) {
    if (arvore == null) {
      JOptionPane.showMessageDialog(null, "Valor não encontrado na árvore.");
      return null;
    }
    if (valor < arvore.valor) {
      arvore.esquerda = excluir(arvore.esquerda, valor);
    } else if (valor > arvore.valor) {
      arvore.direita = excluir(arvore.direita, valor);
    } else {
      // Nó com apenas um filho ou nenhum
      if (arvore.esquerda == null)
        return arvore.direita;
      else if (arvore.direita == null)
        return arvore.esquerda;

      // Nó com dois filhos: obter o menor valor da subárvore direita
      arvore.valor = minValor(arvore.direita);
      arvore.direita = excluir(arvore.direita, arvore.valor);
    }
    return arvore;
  }

  private int minValor(ArvoreBinaria arvore) {
    int minv = arvore.valor;
    while (arvore.esquerda != null) {
      arvore = arvore.esquerda;
      minv = arvore.valor;
    }
    return minv;
  }

}
