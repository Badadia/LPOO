package Quest1;

public class Miseravel extends Pessoa {
    public Miseravel(String nome, int idade) {
        super(nome, idade);
    }

    public void mendiga() {
        System.out.println(getNome() + " está mendigando.");
    }
}

