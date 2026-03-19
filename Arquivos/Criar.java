package Arquivos;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Criar {
    public static void criar() throws IOException {
        String nomeArquivo;
        String path = "/home/jiuliusbalog/Downloads/Programas/idea-IC-233.15619.7/projetos/Arquivos/src/Arquivos/";
        File pasta = new File(path, "Files");

        try {
            System.out.println("Processo de criação iniciado.\n");
            Scanner scan = new Scanner(System.in);

            System.out.println("Nome do arquivo: ");
            nomeArquivo = scan.nextLine();


            if (pasta.exists() == false) {
                System.out.println("A pasta necessária não existe, portanto está sendo criada");
                pasta.mkdirs();
                System.out.println("Pasta criada com sucesso");
            }
            File arquivo = new File(pasta, nomeArquivo);
            boolean status = arquivo.createNewFile();

            if (status){
                System.out.println("Arquivo " + nomeArquivo + " criado com êxito");
            } else {
                System.out.println("Esse arquivo já existe. Utilize-o ou crie outro com outro nome.");
            }

        } catch (IOException e){
            System.out.println("Falha no processo de criação");
            e.printStackTrace();
        }
    }
}
