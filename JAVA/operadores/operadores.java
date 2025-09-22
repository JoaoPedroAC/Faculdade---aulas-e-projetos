public class operadores {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;

    // Operadores Aritméticos
    System.out.println("Soma: " + (a + b)); // 30
    System.out.println("Subtração: " + (a - b)); // -10
    System.out.println("Multiplicação: " + (a * b)); // 200
    System.out.println("Divisão: " + (b / a)); // 2
    System.out.println("Módulo: " + (b % a)); // 0

    // Operadores de Atribuição
    int c = a; // Atribuição simples
    c += b; // c = c + b
    System.out.println("Atribuição com soma: " + c); // 30

    // Operadores de Comparação
    System.out.println("Igualdade: " + (a == b)); // false
    System.out.println("Diferença: " + (a != b)); // true
    System.out.println("Maior que: " + (a > b)); // false
    System.out.println("Menor que: " + (a < b)); // true
    System.out.println("Maior ou igual a: " + (a >= b)); // false
    System.out.println("Menor ou igual a: " + (a <= b)); // true

    // Operadores Lógicos
    boolean x = true;
    boolean y = false;
    System.out.println("E lógico: " + (x && y)); // false
    System.out.println("Ou lógico: " + (x || y)); // true
    System.out.println("Negação lógica: " + (!x)); // false

    // Operadores Unários
    int d = 5;
    d++; // Incremento
    System.out.println("Incremento: " + d); // 6
    d--; // Decremento
    System.out.println("Decremento: " + d); // 5

    // Operador Ternário
    String resultado = (a > b) ? "A é maior" : "B é maior";
    System.out.println(resultado); // B é maior
  }
}
