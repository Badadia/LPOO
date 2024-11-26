package Quest3;

public class Conta {
    private int numero;
    private String agencia;
    private String titular;
    private int cpf;
    private double saldo;

    public Conta(int numero, String agencia, String titular, int cpf, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor invalido");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 ) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente para sacar!");
            }
        } else {
            System.out.println("Valor invalido!");
        }
    }
}
