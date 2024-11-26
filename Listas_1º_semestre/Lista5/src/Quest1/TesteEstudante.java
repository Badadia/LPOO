package Quest1;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteEstudante {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<Double>();

        String nome;
        String matricula;
        String endereco;
        Estudante est = null;

        boolean continuar = true;
        while(continuar) {
            System.out.println("1. Criar um Estudante\n" +
                    "2. Calcular Média\n" +
                    "3. Obter número de matricula\n" +
                    "4. Obter Endereço\n" +
                    "0. Sair");

            switch(sc.nextInt()) {
                case 1:
                    System.out.println("Digite o nome do estudante: ");
                    nome = sc.next();
                    System.out.println("Digite o matricula do estudante: ");
                    matricula = sc.next();
                    System.out.println("Digite o endereco do estudante: ");
                    endereco = sc.next();
                    for(int i = 0; i < 4; i++){
                        System.out.println("Digite a nota " +(i+1)+ " do estudante: ");
                        sc.nextLine();
                        notas.add(sc.nextDouble());
                    }
                    est = new Estudante(nome, matricula, endereco, notas);
                    break;
                case 2:
                    est.getMedia();
                    break;
                case 3:
                    System.out.println(est.getMatricula());
                    break;
                case 4:
                    System.out.println(est.getEndereco());
                    break;
                case 0:
                    System.out.println("Saindo");
                    continuar = false;
                    break;
            }
        }
    }
}
