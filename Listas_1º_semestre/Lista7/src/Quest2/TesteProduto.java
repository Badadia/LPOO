package Quest2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<Produto>();
        Produto p;
        String nome;
        int codigo;
        double preco;
        int quantidade;

        boolean continua = true;

        while (continua) {
            System.out.println("1. Cadastrar produto\n" +
                    "2. Buscar Produto\n" +
                    "3. Listar todos os produtos\n" +
                    "4. Efetuar venda de produto\n" +
                    "0. Sair");

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    nome = sc.next();
                    System.out.println("Digite o codigo do produto: ");
                    codigo = sc.nextInt();
                    System.out.println("Digite o preço do produto: ");
                    preco = sc.nextDouble();
                    System.out.println("Digite a quantidade do produto: ");
                    quantidade = sc.nextInt();

                    p = new Produto(nome, codigo, preco, quantidade);
                    produtos.add(p);
                    break;
                case 2:
                    System.out.println("Digite o nome do produto que deseja buscar: ");
                    nome = sc.next();
                    for (Produto p2 : produtos) {
                        if (p2.getNome().equals(nome)) {
                            p2.Imprime();
                            System.out.println("|---------------------------|");
                        }
                    }
                    break;
                case 3:
                    System.out.println("|---------------------------|");
                    for(Produto p2 : produtos) {
                        p2.Imprime();
                        System.out.println("|---------------------------|");
                    }
                    break;
                case 4:
                    System.out.println("Digite o nome do produto que deseja comprar: ");
                    nome = sc.next();
                    System.out.println("Digite a quantidade que deseja comprar: ");
                    quantidade = sc.nextInt();
                    for (Produto p2 : produtos) {
                        if (p2.getNome().equals(nome)) {
                            p2.Vender(quantidade);
                        }
                    }
                    break;
                case 0:
                    continua = false;
                    break;
            }
        }
    }
}
