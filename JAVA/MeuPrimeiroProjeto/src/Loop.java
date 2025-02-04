import javax.swing.*;

// É importante perceber que para o WHILE E DO/WHILE que não possuem progressão do loop como no FOR, é necessário que a sua progressão esteja nas ultimas linhas dentro do loop, para que a sua execução seja correta!

public class Loop {
    public static void main(String entrada[]) {
        // Declaracao
        int tabuada, cont = 0;
        char op = 0;
        String msg = "", msgEnt = "Digite 1 para repeticao FOR \nDigite 2 para repeticao WHILE \nDigite 3 para repeticao DO/WHILE ";

        // Entrada de dados
        tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite seu numero aqui!"));
        op = (JOptionPane.showInputDialog(msgEnt)).charAt(0);

        // Precessando     
          switch (op) {
            
            case '1': {
                for(int i = 0; i <= 10; i++){
                    int result = tabuada * i;
                    // saida
                    msg = msg + String.format("\nFOR: %d X %d = %d", tabuada, i, result);
                };
                JOptionPane.showMessageDialog(null, msg);
                break;
            }            
            case '2': {
                while (cont <= 10) {
                    int result = tabuada * cont;
                    // saida
                    msg = msg + String.format("\nWHILE: %d X %d = %d", tabuada, cont, result);
                    cont++;
                }
                JOptionPane.showMessageDialog(null, msg);
                break;
            }
            case '3':{
                do{
                    int result = tabuada * cont;
                    // saida
                    msg = msg + String.format("\nDO/WHILE: %d X %d = %d", tabuada, cont, result);
                    cont++;
                }while (cont <= 10);
                JOptionPane.showMessageDialog(null, msg);
                break;
            }        
            // saida
            default: JOptionPane.showMessageDialog(null, "Opcao invalida, escolha certo na proxima!");

        }
        
    }
    
}