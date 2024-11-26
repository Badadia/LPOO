package Quest5;

import java.util.Scanner;

public class TesteCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro c;
        double ef;
        double combu;
        double km;
        boolean continuar = true;

        System.out.println("Bem vindo!");
        System.out.println("Digite a eficiencia do carro: ");
        ef = sc.nextDouble();
        System.out.println("Porfavor abasteça o carro! Quanto deseja abastecer?: ");
        combu = sc.nextDouble();
        c = new Carro(ef,combu);
        while (continuar) {
            System.out.println("Vamos viajar!");
            System.out.println("1. Andar\n" +
                    "2. Reabastecer\n" +
                    "3. Verificar a quantidade de combustível restante\n" +
                    "4. Encerrar a viagem");

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Quantos quilometros deseja percorrer?: ");
                    km = sc.nextDouble();
                    c.Andar(km);
                    break;
                case 2:
                    System.out.println("Quanto deseja reabastecer?: ");
                    combu = sc.nextDouble();
                    c.Reabastecer(combu);
                    break;
                case 3:
                    System.out.println("Combustível restante: " + c.getCombustivel() + "Litros");
                    break;
                case 4:
                    continuar = false;
                    break;
            }
        }

    }
}
