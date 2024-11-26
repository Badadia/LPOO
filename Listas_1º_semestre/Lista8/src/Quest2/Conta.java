package Quest2;

public class Conta {
    private int numero;
    private int numAgencia;
    private String nomeAgencia;
    private String nome;
    private int cpf;
    private double saldo;

    public Conta(int numero, int numAgencia, String nomeAgencia, String nome, int cpf, double saldo) {
        this.numero = numero;
        this.numAgencia = numAgencia;
        this.nomeAgencia = nomeAgencia;
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
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

    public void depositar(double valor){
        if (valor>0){
            this.saldo+=valor;
            System.out.println("Deposito realizado com sucesso!");
        } else {
            System.out.println("Valor invalido!");
        }
    }

    public void sacar(double valor){
        if (valor<=this.saldo){
            this.saldo-=valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
