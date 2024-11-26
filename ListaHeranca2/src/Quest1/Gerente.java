package Quest1;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Departamento: " + departamento);
    }
}

