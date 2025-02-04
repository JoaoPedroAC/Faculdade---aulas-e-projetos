public class Aritmetica {
    public static void main(String entrace[]) {
        int n1, n2, resto, div;
        double pot, raiz;
        String msg = "";
        
        // Entrada de dados
        n1 = 5;
        n2 = 10;
        // Processando
        resto = n1 % n2;
        div = (int)n1 / (int)n2; // Isso é apenas para agarantir que seja realmente inteiro os numero, não há necessidade disso, porém é mais garantido que o calculo seja mais certeiro
        raiz = Math.sqrt(n1);
        pot = Math.pow(n1, n2);
        // Saída
        msg = "n1 = " + n1 + " n2 = " + n2 + "\n";
        msg = msg + "Resto da divisão de n1 por n2 = " + resto + "\n";
        msg = msg + "Quociente da divisão de n1 por n2: " + div + "\n";
        msg = msg + "Raiz quadrada de n1 por n2: " + raiz + "\n";
        msg = msg + "Potência de n1 por n2: " + pot + "\n";
        System.out.println(msg);
    }
    
}