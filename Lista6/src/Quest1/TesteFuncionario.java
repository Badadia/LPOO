package Quest1;

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
            System.out.println("1. Cadastrar um funcionário\n" +
                    "2. Exibir os funcionários de alta renda\n" +
                    "0. Sair");
            int opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite o nome: ");
                    nome = sc.next();
                    System.out.println("Digite o salario: ");
                    salario = sc.nextDouble();

                    f = new Funcionario(nome, salario);
                    list.add(f);
                    break;
                case 2:
                    System.out.println("Funcionarios de alta renda: ");
                    altaRenda(list);
                    break;
                case 0:
                    continuar = false;
                    break;
            }
        }
    }

    public static void altaRenda(List<Funcionario> lista){
        for (Funcionario f : lista) {
            if(f.getSalario() > 5000){
                System.out.println(f.getNome());
            }
        }
    }
}
