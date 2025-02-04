import java.util.Scanner;

public class introducao {
    // modulo principal com a entrada  pela linha de comando
    // As declarações de variaveis são feitas aqui se tornando globais ou dentro do public static... para serem exclusivas dele!
    public static void main(String[] args) {
        int idade = 25;
        double altura = 1.5;
        // char caracter = 'o'; // apenas 1 caracter
        // String frase = "João Pedro"; // palavras inteiras ou frases
        boolean vf = true;
        System.out.print("Escreva seu nome aqui: ");
        Scanner write = new Scanner(System.in);
        if (vf == true) {
            String nome = write.nextLine();
            System.out.println("Eu sou " + nome + " tenho " + altura + " de altura " + "e " + idade + " anos");
        } 
        write.close();
    }
}