package Quest3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestePessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();
        Pessoa p;
        double peso;
        double altura;
        String nome;
        boolean continuar = true;

        while (continuar) {
            System.out.println("1. Cadastrar uma pessoa\n" +
                    "2. Mostrar as pessoas que estão abaixo do peso\n" +
                    "3. Mostrar as pessoas que estão dentro do peso ideal\n" +
                    "4. Mostrar as pessoas que estão acima do peso\n" +
                    "0. Sair");

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Digite o nome da pessoa: ");
                    nome = sc.next();
                    System.out.println("Digite o peso do pessoa: ");
                    peso = sc.nextDouble();
                    System.out.println("Digite o altura do pessoa: ");
                    altura = sc.nextDouble();

                    p = new Pessoa(peso,altura,nome);
                    list.add(p);
                    break;
                case 2:
                    System.out.println("Pessoas abaixo do peso ideal: ");
                    for (Pessoa pessoa : list) {
                        if(pessoa.calcularImc()<18.5){
                            System.out.println(pessoa.getNome());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Pessoas dentro do peso ideal: ");
                    for (Pessoa pessoa : list) {
                        if(pessoa.calcularImc()>18.5 && pessoa.calcularImc()<25){
                            System.out.println(pessoa.getNome());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Pessoas acima do peso ideal: ");
                    for (Pessoa pessoa : list) {
                        if(pessoa.calcularImc()>=25){
                            System.out.println(pessoa.getNome());
                        }
                    }
                    break;
                case 0:
                    continuar = false;
                    break;
            }
        }
    }
}
