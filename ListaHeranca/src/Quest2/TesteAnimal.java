package Quest2;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteAnimal {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1) Incluir dados relativo a um peixe");
            System.out.println("2) Incluir dados relativo a um mamífero");
            System.out.println("3) Listar todos os animais cadastrados");
            System.out.println("4) Listar todos os peixes cadastrados");
            System.out.println("0) Sair");
            System.out.print("Escolha uma opção: ");

            switch(scanner.nextInt()){
                case 1:
                    System.out.print("Nome do peixe: ");
                    String nome = scanner.next();
                    System.out.print("Comprimento (em metros): ");
                    double comprimento = scanner.nextDouble();
                    System.out.print("Velocidade (em m/s): ");
                    double velocidade = scanner.nextDouble();

                    Peixe peixe = new Peixe(nome, comprimento, velocidade);
                    animais.add(peixe);
                    System.out.println("Peixe cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.print("Nome do mamífero: ");
                   nome = scanner.next();
                    System.out.print("Comprimento (em metros): ");
                    comprimento = scanner.nextDouble();
                    System.out.print("Cor: ");
                    String cor = scanner.next();
                    System.out.print("Velocidade (em m/s): ");
                    velocidade = scanner.nextDouble();
                    System.out.print("Alimento preferido: ");
                    String alimentoPreferido = scanner.next();

                    Mamifero mamifero = new Mamifero(nome, comprimento, cor, velocidade, alimentoPreferido);
                    animais.add(mamifero);
                    System.out.println("Mamífero cadastrado com sucesso!");
                    break;
                case 3:
                    if (animais.isEmpty()) {
                        System.out.println("Nenhum animal cadastrado.");
                    } else {
                        System.out.println("Animais cadastrados:");
                        for (Animal animal : animais) {
                            System.out.println(animal.getDados());
                        }
                    }
                    break;
                case 4:
                    boolean temPeixes = false;

                    for (Animal animal : animais) {
                        if (animal instanceof Peixe) {
                            System.out.println(animal.getDados());
                            temPeixes = true;
                        }
                    }
                    if (!temPeixes) {
                        System.out.println("Nenhum peixe cadastrado.");
                    }
                    break;
                case 0:
                    continuar = false;
                    break;
            }
        }
    }
}
