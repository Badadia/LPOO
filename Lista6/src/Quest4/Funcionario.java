package Quest4;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void CalcularImposto() {
        double imposto = 0;
        if(this.salario <= 2000) {
            System.out.println("Isento de imposto");
        } else if(this.salario > 2000 && this.salario <= 3500) {
            imposto = this.salario * 0.15;
            System.out.println("Imposto a pagar: R$ " + imposto);
        } else if(this.salario > 3500 && this.salario <= 5000) {
            imposto = this.salario * 0.22;
            System.out.println("Imposto a pagar: R$ " + imposto);
        } else{
            imposto = this.salario * 0.3;
            System.out.println("Imposto a pagar: R$ " + imposto);
        }
    }
}
