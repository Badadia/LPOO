package Quest3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Conta> contas = new ArrayList<Conta>();
        Conta c;
        int numero;
        String agencia;
        String titular;
        int cpf;
        double saldo;
        double valor;

        boolean continuar = true;

        while (continuar) {
            System.out.println("1. Cadastrar Conta\n" +
                    "2. Realizar depósito\n" +
                    "3. Realizar saque\n" +
                    "4. Verificar saldo\n" +
                    "5. Consultar Cliente\n" +
                    "0. Sair");

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Digite o número da conta: ");
                    numero = sc.nextInt();
                    System.out.println("Digite a agência da conta: ");
                    agencia = sc.next();
                    System.out.println("Digite o nome do titular da conta: ");
                    titular = sc.next();
                    System.out.println("Digite o cpf do titular: ");
                    cpf = sc.nextInt();
                    System.out.println("Digite o saldo da conta: ");
                    saldo = sc.nextDouble();

                    c = new Conta(numero, agencia, titular, cpf, saldo);
                    contas.add(c);
                    break;
                case 2:
                    System.out.println("Digite o nome do titular da conta que deseja depositar: ");
                    titular = sc.next();
                    System.out.println("Digite o valor a depositar: ");
                    valor = sc.nextDouble();

                    for (Conta conta : contas) {
                        if (titular.equals(conta.getTitular())) {
                            conta.depositar(valor);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do titular da conta que deseja sacar: ");
                    titular = sc.next();
                    System.out.println("Digite o valor a sacar: ");
                    valor = sc.nextDouble();

                    for (Conta conta : contas) {
                        if (titular.equals(conta.getTitular())) {
                            conta.sacar(valor);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Digite o nome do titular da conta que deseja verificar o saldo: ");
                    titular = sc.next();
                    for (Conta conta : contas) {
                        if (titular.equals(conta.getTitular())) {
                            System.out.println("Saldo da conta: R$" + conta.getSaldo());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Digite o nome do cliente: ");
                    titular = sc.next();
                    for (Conta conta : contas) {
                        if (titular.equals(conta.getTitular())) {
                            System.out.println("Nome do cliente: " + conta.getTitular());
                            System.out.println("CPF do cliente: " + conta.getCpf());
                        }
                    }
                case 0:
                    continuar = false;
                    break;
            }
        }
    }
}
