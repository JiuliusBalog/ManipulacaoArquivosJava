package ManipulacaoArquivosJava.Arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Escrever {

    public static void escrever(Scanner input, String path){
        System.out.println("Processo de escrita foi iniciado.");
        String nomeArquivo;
        String conteudo;

        System.out.print("Nome do arquivo a ser escrito: ");
        nomeArquivo = input.nextLine();

        File pasta = new File(path, "Files");
        File arquivo = new File(pasta, nomeArquivo);

        if(!arquivo.exists()){
            System.out.println("Arquivo não foi encontrado, tente novamente.");
            return;
        }

        System.out.print("Insira o conteúdo a ser escrito no arquivo: ");
        conteudo = input.nextLine();

        try (FileWriter escritor = new FileWriter(arquivo)){
            escritor.write(conteudo);
        } catch (IOException e) {
            System.out.println("Não foi possível realizar a operação de escrita");
            e.printStackTrace();
        }
    }
}

// Lógica principal:
// Vamo ler a pasta
// Vamo ler um determinado arquivo escolhido por um usuário
// Na leitura, a gente vai verificar se esse arquivo tem conteúdo, se tiver, pergunta se quer
// sobrescrever ou adicionar mais coisa

// Nota: essa é a versão 1, eu pretendo adicionar um Append
// no futuro pra adição de conteúdo novo em arquivos que já tem conteúdo presente através de uma
// função nova, ou talvez separar o código em duas funções, uma pra arquivos vazios e outra pra
// arquivos "cheios" digamos assim
