package AtributosDnD;

import java.util.*;
import javax.swing.*;

public class AtributosDnD {
  public static void main(String[] args) {
    AtributosDnD atributos = new AtributosDnD(15, 14, 13, 12, 10, 8);
    atributos.mostrarAtributos();
  }
  
  public int pontosADistribuir = 27;
  public int forca;
  public int destreza;
  public int constituicao;
  public int inteligencia;
  public int sabedoria;
  public int carisma;

  public AtributosDnD(int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma) {
    this.forca = forca;
    this.destreza = destreza;
    this.constituicao = constituicao;
    this.inteligencia = inteligencia;
    this.sabedoria = sabedoria;
    this.carisma = carisma;
  }

  public int calcularModificador(int atributo) {
    if(pontosADistribuir < 0) {
      JOptionPane.showMessageDialog(null, "Você excedeu os pontos disponíveis! Reduza algum atributo.");
      return 0;
    }
    switch (atributo) {
      case 8:
        pontosADistribuir -= 0;
        break;
      case 9:
        pontosADistribuir -= 1;
        break;
      case 10:
        pontosADistribuir -= 2;
        break;
      case 11:
        pontosADistribuir -= 3;
        break;
      case 12:
        pontosADistribuir -= 4;
        break;
      case 13:
        pontosADistribuir -= 5;
        break;
      case 14:
        pontosADistribuir -= 7;
        break;
      case 15:
        pontosADistribuir -= 9;
        break;
      default:
        JOptionPane.showMessageDialog(null, "Atributo inválido! Insira um valor entre 8 e 15.");
        break;
    }
    return Math.round((atributo - 10) / 2);
  }

  public int getPontosADistribuir() {
    return pontosADistribuir;
  }
  public void setPontosADistribuir(int pontosADistribuir) {
    this.pontosADistribuir = pontosADistribuir;
  }
  public int getForca() {
    return forca;
  }
  public void setForca(int forca) {
    this.forca = forca;
  }
  public int getDestreza() {
    return destreza;
  }
  public void setDestreza(int destreza) {
    this.destreza = destreza;
  }
  public int getConstituicao() {
    return constituicao;
  }
  public void setConstituicao(int constituicao) {
    this.constituicao = constituicao;
  }
  public int getInteligencia() {
    return inteligencia;
  }
  public void setInteligencia(int inteligencia) {
    this.inteligencia = inteligencia;
  }
  public int getSabedoria() {
    return sabedoria;
  }
  public void setSabedoria(int sabedoria) {
    this.sabedoria = sabedoria;
  }
  public int getCarisma() {
    return carisma;
  }
  public void setCarisma(int carisma) {
    this.carisma = carisma;
  }

  JOptionPane pane = new JOptionPane();
  public void mostrarAtributos() {
    String atributos = "Força: " + forca + " seu medificador " + calcularModificador(forca)+ "\n" +
                      "Destreza: " + destreza + " seu medificador " + calcularModificador(destreza)+ "\n" +
                      "Constituição: " + constituicao + " seu medificador " + calcularModificador(constituicao)+ "\n" +
                      "Inteligência: " + inteligencia + " seu medificador " + calcularModificador(inteligencia)+ "\n" +
                      "Sabedoria: " + sabedoria + " seu medificador " + calcularModificador(sabedoria)+ "\n" +
                      "Carisma: " + carisma + " seu medificador " + calcularModificador(carisma)+ "\n" +
                      "Pontos restantes: " + pontosADistribuir;
    pane.showMessageDialog(null, atributos, "Atributos do Personagem", JOptionPane.INFORMATION_MESSAGE);
  }



}