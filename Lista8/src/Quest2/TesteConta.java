package Quest2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Conta> contas = new ArrayList<>();
        Conta c;
        int numero;
        int numAgencia;
        String agencia;
        String cliente;
        int cpf;
        double valor;
        double saldo;
        boolean continuar = true;
        while (continuar) {
            System.out.println("""
                    1. Cadastrar Conta
                    2. Realizar depósito
                    3. Realizar saque
                    4. Verificar saldo
                    5. Consultar número e nome da agência
                    6. Alterar o número e nome da agência
                    0. Sair""");

            switch (sc.nextInt()) {
                case 1:
                    if (contas.size() <=10) {
                        System.out.println("Digite o número da conta: ");
                        numero = sc.nextInt();
                        System.out.println("Digite o número da agencia: ");
                        numAgencia = sc.nextInt();
                        System.out.println("Digite o nome da agencia: ");
                        agencia = sc.next();
                        System.out.println("Digite o nome do cliente: ");
                        cliente = sc.next();
                        System.out.println("Digite o cpf do cliente: ");
                        cpf = sc.nextInt();
                        System.out.println("Digite o saldo da conta: ");
                        saldo = sc.nextDouble();

                        c = new Conta(numero,numAgencia,agencia,cliente,cpf,saldo);
                        contas.add(c);
                    } else{
                        System.out.println("Núremo maximo de contas atingido!");
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Digite o cpf do cliente da conta que deseja depositar: ");
                    cpf = sc.nextInt();
                    System.out.println("Digite o valor que quer depositar: ");
                    valor = sc.nextDouble();

                    for (Conta conta : contas) {
                        if (conta.getCpf().equals(cpf)){
                            conta.depositar(valor);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite o cpf do cliente da conta que deseja sacar: ");
                    cpf = sc.nextInt();
                    System.out.println("Digite o valor que quer sacar: ");
                    valor = sc.nextDouble();

                    for (Conta conta : contas) {
                        if (conta.getCpf().equals(cpf)){
                            conta.sacar(valor);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Digite o cpf do cliente da conta que deseja verificar o saldo: ");
                    cpf = sc.nextInt();

                    for (Conta conta : contas) {
                        if (conta.getCpf().equals(cpf)){
                            System.out.println("Saldo atual: " + conta.getSaldo());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Digite o nome do cliente: ");
                    cliente = sc.next();
                    for (Conta conta : contas) {
                        if (conta.getNome().equals(cliente)){
                            System.out.println("Nome: " + conta.getNome());
                            System.out.println("Cpf: " + conta.getCpf());
                            System.out.println("Agencia: " + conta.getNomeAgencia());
                            System.out.println("Numero da agencia: " + conta.getNumAgencia());
                        }
                    }
                    break;
                case 6:
                    System.out.println("Digite o nome do cliente que deseja alterar a agencia: ");
                    String nome = sc.next();
                    System.out.println("Digite o nome da nova agencia: ");
                    agencia = sc.next();
                    System.out.println("Digite o numero da nova agencia: ");
                    numAgencia = sc.nextInt();
                    for (Conta conta : contas) {
                        if (conta.getNome().equals(nome)){
                            conta.setNomeAgencia(agencia);
                            conta.setNumAgencia(numAgencia);
                            System.out.println("Mudanças concluidas!");
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
