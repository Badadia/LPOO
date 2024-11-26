package Quest4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> list = new ArrayList<>();
        Funcionario f;
        String nome;
        double salario;
        boolean continuar = true;

        while (continuar) {
            System.out.println("1. Cadastrar funcionário\n" +
                    "2. Calcular imposto\n" +
                    "0. Sair");

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Digite o nome do funcionario: ");
                    nome = sc.next();
                    System.out.println("Digite o salario do funcionario: ");
                    salario = sc.nextDouble();

                    f = new Funcionario(nome, salario);
                    list.add(f);
                    break;
                case 2:
                    System.out.println("Digite o nome do funcionario que deseja calcular o imposto: ");
                    nome = sc.next();
                    for(Funcionario fi : list) {
                        if(fi.getNome().equals(nome)) {
                            fi.CalcularImposto();
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
