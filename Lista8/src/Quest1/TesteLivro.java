package Quest1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteLivro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Livro> livros = new ArrayList<Livro>();
        Livro l;
        boolean continuar = true;
        while (continuar) {
            System.out.println("1. Cadastrar livro\n" +
                    "2. Buscar livro por titulo\n" +
                    "3. Listar livros por autor\n" +
                    "4. Listar todos os livros\n" +
                    "0. Sair");

            switch (sc.nextInt()){
                case 1:
                    System.out.println("Digite o nome do autor: ");
                    String autor = sc.next();
                    System.out.println("Digite o cpf do autor: ");
                    int cpf = sc.nextInt();
                    System.out.println("Digite o endereço do autor: ");
                    String endereco = sc.next();
                    System.out.println("Digite o CNPJ da editora: ");
                    int cnpj = sc.nextInt();
                    System.out.println("Digite o nome da editora: ");
                    String nome = sc.next();
                    System.out.println("Digite o edereço da editora: ");
                    String editora = sc.next();
                    System.out.println("Digite o telefone da editora: ");
                    int telefone = sc.nextInt();
                    System.out.println("Digite o ISBN: ");
                    String isbn = sc.next();
                    System.out.println("Digite o titulo do livro: ");
                    String titulo = sc.next();
                    System.out.println("Digite o ano do livro: ");
                    int ano = sc.nextInt();

                    l = new Livro(autor,cpf,endereco,cnpj,nome,editora,telefone,isbn,titulo,ano);
                    livros.add(l);
                    break;
                case 2:
                    System.out.println("Digite o titulo do livro: ");
                    titulo = sc.next();
                    System.out.println("|---------------------------------------|");
                    for(Livro l2 : livros){
                        if(l2.getTitulo().equals(titulo)){
                            l2.mostrar();
                            System.out.println("|---------------------------------------|");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do autor: ");
                    autor = sc.next();
                    System.out.println("|---------------------------------------|");
                    for(Livro l2 : livros){
                        if(l2.getAutor().equals(autor)){
                            l2.mostrar();
                            System.out.println("|---------------------------------------|");
                        }
                    }
                    break;
                case 4:
                    System.out.println("|---------------------------------------|");
                    for(Livro l2 : livros){
                        l2.mostrar();
                        System.out.println("|---------------------------------------|");
                    }
                    break;
                case 0:
                    continuar = false;
                    break;
            }
        }
    }
}
