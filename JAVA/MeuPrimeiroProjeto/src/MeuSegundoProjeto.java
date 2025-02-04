class MeuSegundoProjeto {
    public static void main(String entrada[]) {
        // declarando
        int n1,n2,soma;
        n1 = Integer.parseInt(entrada[0]);
        n2 = Integer.parseInt(entrada[1]);
        // processando
        soma = n1 + n2;
        System.out.printf("%d + %d = %d",n1,n2,soma);
        System.exit(0);
    }
}

// É para executar no CMD
// veja em qual diretorio vc esta no cmd, Exemplo: c:\User\..., caso não esteja puxando no local onde estará o arquivo, basta escrever cd e a localização completa de onde o arquivo java se encontra e depois ENTER
// depois disso escreva path e a localização da pasta bin do jdk, dentro de aspas duplas
// dpois ENTER
// depois escreva dir *.java para saber se foi localizado o seu arquivo
// depois javac  e nome do arquivo.java para copilar e entao ENTER
// para executar este em especifico será necessario dar java o nome do arquivo numero numero e ENTER
// executará normalmente e FIM  