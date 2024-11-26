package Quest2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Aluno> list = new ArrayList<>();
        Aluno a;
        String matricula;
        String nome;
        double nota1;
        double nota2;
        boolean continuar = true;

        while (continuar) {
            System.out.println("1. Cadastrar um estudante\n" +
                    "2. Obter o nome do estudante (procurar pela matricula)\n" +
                    "3. Calcular a média (informar se o estudante foi aprovado ou não)\n" +
                    "0. Sair");
            int opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite a matricula do estudante: ");
                    matricula = sc.next();
                    System.out.println("Digite o nome do estudante: ");
                    nome = sc.next();
                    System.out.println("Digite a primeira nota: ");
                    nota1 = sc.nextDouble();
                    System.out.println("Digite a segunda nota: ");
                    nota2 = sc.nextDouble();

                    a = new Aluno(matricula,nome,nota1,nota2);
                    list.add(a);
                    break;
                case 2:
                    System.out.println("Digite a matricula do estudante que deseja consultar: ");
                    matricula = sc.next();
                    for (Aluno aluno : list) {
                        if (aluno.getMatricula().equals(matricula)) {
                            System.out.println(aluno.getNome());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite a matricula do estudante que deseja calcular a média: ");
                    matricula = sc.next();
                    for (Aluno aluno : list) {
                        if (aluno.getMatricula().equals(matricula)) {
                            aluno.calcularMedia();
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

