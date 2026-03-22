package ManipulacaoArquivosJava.Arquivos;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Criar {
    public static void criar(Scanner input, String path) throws IOException {
        String nomeArquivo;
        File pasta = new File(path, "Files");

        try {
            System.out.println("Processo de criação foi iniciado.\n");

            System.out.print("Nome do arquivo: ");
            nomeArquivo = input.nextLine();

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
