package Quest2;

import java.util.Scanner;

public class TesteRetangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base = 0;
        double altura = 0;
        Retangulo retangulo = null;

        boolean continuar = true;
        while(continuar) {
            System.out.println("1. Criar um retângulo\n" +
                    "2. Calcular Área\n" +
                    "3. Calcular Perímetro\n" +
                    "0. Sair");

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Digite o valor da base: ");
                    base = sc.nextDouble();
                    System.out.println("Digite o valor da altura: ");
                    altura = sc.nextDouble();
                    retangulo = new Retangulo(base, altura);
                    break;
                case 2:
                    System.out.println("O valor da area é: " + retangulo.getArea());
                    break;
                case 3:
                    System.out.println("O valor do perimetro é: " + retangulo.getPerimetro());
                    break;
                case 0:
                    continuar = false;
                    break;
            }
        }
}
}
