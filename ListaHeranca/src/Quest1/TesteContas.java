package Quest1;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteContas {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        int LIMITE_CONTAS = 5;
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1) Incluir conta de cliente");
            System.out.println("2) Sacar de uma conta");
            System.out.println("3) Depositar em uma conta");
            System.out.println("4) Calcular novo saldo (Conta Poupança)");
            System.out.println("5) Mostrar dados de todas as contas");
            System.out.println("0) Sair");
            System.out.print("Escolha uma opção: ");

            switch (scanner.nextInt()) {
                case 0:
                    continuar = false;
                    break;
                case 1:
                    if (contas.size() >= LIMITE_CONTAS) {
                        System.out.println("Limite de contas atingido!");
                        return;
                    }

                    System.out.print("Nome do cliente: ");
                    String nome = scanner.next();
                    System.out.print("Número da conta: ");
                    int numero = scanner.nextInt();
                    System.out.print("Saldo inicial: ");
                    double saldo = scanner.nextDouble();

                    System.out.println("Tipo de conta:");
                    System.out.println("1) Conta Poupança");
                    System.out.println("2) Conta Especial");
                    int tipo = scanner.nextInt();

                    if (tipo == 1) {
                        System.out.print("Dia de rendimento: ");
                        int diaRendimento = scanner.nextInt();
                        contas.add(new ContaPoupanca(nome, numero, saldo, diaRendimento));
                    } else if (tipo == 2) {
                        System.out.print("Limite da conta: ");
                        double limite = scanner.nextDouble();
                        contas.add(new ContaEspecial(nome, numero, saldo, limite));
                    } else {
                        System.out.println("Tipo de conta inválido!");
                    }
                    break;
                case 2:
                    System.out.print("Número da conta: ");
                    numero = scanner.nextInt();
                    for (ContaBancaria conta : contas) {
                        if(conta.getNumConta() == numero) {
                            System.out.print("Valor a sacar: ");
                            double valor = scanner.nextDouble();
                            if (conta.sacar(valor)) {
                                System.out.println("Saque realizado com sucesso!");
                            } else {
                                System.out.println("Saldo insuficiente!");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.print("Número da conta: ");
                    numero = scanner.nextInt();
                    for (ContaBancaria conta : contas) {
                        if(conta.getNumConta() == numero) {
                            System.out.print("Valor a depositar: ");
                            double valor = scanner.nextDouble();
                            conta.depositar(valor);
                            System.out.println("Depósito realizado com sucesso!");
                        }
                        }
                    break;
                case 4:
                    System.out.print("Número da conta: ");
                    numero = scanner.nextInt();

                    for (ContaBancaria conta : contas) {
                        if(conta.getNumConta() == numero) {
                            if (conta instanceof ContaPoupanca) {
                                System.out.print("Taxa de rendimento (%): ");
                                double taxa = scanner.nextDouble();
                                ((ContaPoupanca) conta).calcularNovoSaldo(taxa);
                                System.out.println("Novo saldo calculado!");
                            } else {
                                System.out.println("Conta não é do tipo poupança!");
                            }
                        }
                    }
                    break;
                case 5:
                    if (contas.isEmpty()) {
                        System.out.println("Nenhuma conta cadastrada.");
                    } else {
                        System.out.println("-----------------------------");
                        for (ContaBancaria conta : contas) {
                            System.out.println(conta.getDados());
                            System.out.println("-----------------------------");
                        }
                    }
            }
        }

    }
}
