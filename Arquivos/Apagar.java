package ManipulacaoArquivosJava.Arquivos;

import java.io.File;
import java.util.Scanner;

public class Apagar {
    public static void apagar(Scanner input, String path){
        System.out.println("apagano");

        String nomeArquivo;

        System.out.print("Nome do arquivo a ser excluído: ");
        nomeArquivo = input.nextLine();

        File pasta = new File(path, "Files");
        File arquivo = new File(pasta, nomeArquivo);

        if(!arquivo.exists()){
            System.out.println("O arquivo buscado não existe, tente novamente.");
            return;
        }

        if(arquivo.delete()){
            System.out.println("Arquivo excluído com êxito.");
        } else {
            System.out.println("Não foi possível excluir o arquivo.");
        }

    }
}
