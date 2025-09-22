import java.util.Scanner; // 1. Importa a classe Scanner

public class MenuInterativo {

    public static void main(String[] args) {
        // 2. Cria um objeto Scanner para ler a entrada do teclado
        Scanner leitor = new Scanner(System.in);
        
        // 3. Inicia um loop infinito que só será quebrado internamente
        while (true) {
            // 4. Exibe o menu de opções para o usuário
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Consultar Preço");
            System.out.println("0. Sair do Sistema");
            System.out.println("==========================");
            System.out.print("Digite a opção desejada: ");

            // 5. Pausa a execução e espera o usuário digitar um número inteiro
            int opcao;
            try {
                opcao = leitor.nextInt();
            } catch (Exception e) {
                // Se o usuário digitar algo que não é um número (ex: "abc")
                System.out.println("\n[ERRO] Opção inválida! Por favor, digite apenas números.");
                System.out.println("O sistema será encerrado.");
                break; // Encerra o loop while
            }
            
            // 6. Usa um switch para tratar a opção escolhida
            switch (opcao) {
                case 1:
                    System.out.println("\n-> Você selecionou: Cadastrar Produto.");
                    // Aqui você colocaria a lógica para cadastrar um produto
                    break; // Volta para o início do loop e exibe o menu novamente
                
                case 2:
                    System.out.println("\n-> Você selecionou: Listar Produtos.");
                    // Lógica para listar os produtos
                    break;

                case 3:
                    System.out.println("\n-> Você selecionou: Consultar Preço.");
                    // Lógica para consultar o preço
                    break;

                case 0:
                    System.out.println("\nSaindo do sistema... Até logo!");
                    leitor.close(); // 7. Fecha o Scanner antes de sair
                    return; // 8. Encerra o método main e, consequentemente, o programa

                default:
                    // 9. Caso o usuário digite um número que não está no menu
                    System.out.println("\n[ERRO] Opção inválida! O sistema será encerrado.");
                    leitor.close();
                    return; // Encerra o programa
            }
        }
    }
}
