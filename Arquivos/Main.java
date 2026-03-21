package ManipulacaoArquivosJava.Arquivos;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        int opc = 0;
        String path = "/home/jiuliusbalog/Downloads/Programas/idea-IC-233.15619.7/projetos/Arquivos/src/ManipulacaoArquivosJava/Arquivos/";
        Scanner input = new Scanner(System.in);


        while (opc != 9) {
            System.out.println("========================================\n                  MENU\n========================================\n|1.              Criar                 |\n|2.               Ler                  |\n|3.             Deletar                |\n|4.             Escrever               |\n|9.          Fechar programa           |\n========================================");
            opc = input.nextInt();
            input.nextLine();
            switch (opc) {
                case 1:
                    Criar.criar(input, path);
                    break;
                case 2:
                    Ler.ler(input, path);
                    break;
                case 3:
                    Apagar.apagar(input, path);
                    break;
                case 4:
                    Escrever.escrever(input, path);
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
