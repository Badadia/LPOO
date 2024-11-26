package Quest1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteLivro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Livro> livros = new ArrayList<Livro>();
        Livro l;
        String autor;
        String editora;
        int isbn;
        String titulo;
        int ano;

        boolean continua = true;

        while (continua) {
            System.out.println("1. Cadastrar livro\n" +
                    "2. Buscar livro por titulo\n" +
                    "3. Listar livros por autor \n" +
                    "4. Listar todos os livros\n" +
                    "0. Sair");

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Digite o autor do livro: ");
                    autor = sc.next();
                    System.out.println("Digite o editora do livro: ");
                    editora = sc.next();
                    System.out.println("Digite o isbn do livro: ");
                    isbn = sc.nextInt();
                    System.out.println("Digite o titulo do livro: ");
                    titulo = sc.next();
                    System.out.println("Digite o ano de edição do livro: ");
                    ano = sc.nextInt();

                    l = new Livro(autor, editora, isbn, titulo, ano);
                    livros.add(l);
                    break;
                case 2:
                    System.out.println("Digite o titulo do livro do livro: ");
                    titulo = sc.next();
                    for (Livro l2 : livros) {
                        if (l2.getTitulo().equals(titulo)) {
                            l2.imprimir();
                            System.out.println("|---------------------------|");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite o autor que deseja ver os livros: ");
                    autor = sc.next();
                    System.out.println("|---------------------------|");
                    for (Livro l2 : livros) {
                        if (l2.getAutor().equals(autor)) {
                            l2.imprimir();
                            System.out.println("|---------------------------|");
                        }
                    }
                    break;
                case 4:
                    System.out.println("|---------------------------|");
                    for (Livro l2 : livros) {
                        l2.imprimir();
                        System.out.println("|---------------------------|");
                    }
                    break;
                case 0:
                    continua = false;
                    break;
            }
        }
    }
}
