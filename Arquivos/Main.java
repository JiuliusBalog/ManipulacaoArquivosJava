package Arquivos;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        int opc = 0;
        Scanner input = new Scanner(System.in);

        while (opc != 9) {
            System.out.println("========================================\n                  MENU\n========================================\n1. Criar\n2. Ler\n3. Deletar\n9. Fechar programa");
            opc = input.nextInt();
            switch (opc) {
                case 1:
                    Criar.criar();
                    break;
                case 2:
                    Ler.ler();
                    break;
                case 3:
                    Apagar.apagar();
                    break;
                case 9:
                    System.out.println("to dando o fora daqui tlgd mermao");
                    System.exit(0);
                default:
                    System.out.println("seleciona o bgl certo aí mano");
            }
        }
    }
}
