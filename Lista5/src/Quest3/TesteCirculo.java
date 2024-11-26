package Quest3;

import Quest2.Retangulo;

import java.util.Scanner;

public class TesteCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio = 0;
        Circulo circulo = null;

        boolean continuar = true;
        while(continuar) {
            System.out.println("1. Criar um círculo\n" +
                    "2. Calcular Área\n" +
                    "3. Calcular Perímetro\n" +
                    "0. Sair");

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Digite o valor do raio: ");
                    raio = sc.nextDouble();
                    circulo = new Circulo(raio);
                    break;
                case 2:
                    System.out.println("O valor da area é: " + circulo.calcularArea());
                    break;
                case 3:
                    System.out.println("O valor do perimetro é: " + circulo.calcularPerimetro());
                    break;
                case 0:
                    continuar = false;
                    break;
            }
        }
    }
}
