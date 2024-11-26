package Quest1;

public class Administrativo extends Assistente {
    private String turno; //
    private double adicionalNoturno;

    public Administrativo(String nome, double salario, String numeroMatricula, String turno, double adicionalNoturno) {
        super(nome, salario, numeroMatricula);
        this.turno = turno;
        this.adicionalNoturno = turno.equalsIgnoreCase("noite") ? adicionalNoturno : 0;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Turno: " + turno);
        if (adicionalNoturno > 0) {
            System.out.println("Adicional Noturno: R$" + adicionalNoturno);
            System.out.println("Salário Total: R$" + (salario + adicionalNoturno));
        } else {
            System.out.println("Salário Total: R$" + salario);
        }
    }
}

