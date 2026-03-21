package ManipulacaoArquivosJava.Arquivos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Ler {
    public static void ler(Scanner input, String path) throws FileNotFoundException {
        System.out.println("Processo de leitura foi iniciado.");

        String nomeArquivo;
        System.out.println("Nome do arquivo a ser lido (incluindo a extensão, ex: arquivo.txt)");
        nomeArquivo = input.nextLine();

        File pasta = new File(path, "Files");
        File arquivo = new File(pasta, nomeArquivo);
        try(Scanner leitor = new Scanner(arquivo)){
            while(leitor.hasNextLine()){
                String conteudo = leitor.nextLine();
                System.out.print(conteudo + "\n");
            }
        } catch(IOException e){
            System.out.println("Não existe nenhum arquivo com este nome, tente novamente");
        }

    }
}

//> ele vai ler a pasta
//> ele vai ler um determinado arquivo dessa pasta (String criado pelo usuário)
//> ele vai exibir o conteúdo que o usuário escolheu na tela