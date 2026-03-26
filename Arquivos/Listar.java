package ManipulacaoArquivosJava.Arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Listar {
    public static void listarArquivos(Scanner input, String path){
        System.out.println("Processo de listagem foi iniciado..");

        File pasta = new File(path, "Files");
        String arquivos[] = pasta.list();

        if(arquivos == null) {
            System.out.println("Não foi possível realizar a operação de listagem");
            return;
        }

        for (int i = 0; i < arquivos.length; i++) {
            System.out.println(arquivos[i]);
        }


    }
}
