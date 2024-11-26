package Quest1;

public class Funcionario {
        String nome;
        double salario;

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
}
