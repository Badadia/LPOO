package Quest1;

public class Gato extends Animal {
    public Gato() {
        super();
    }

    public Gato(String nome, String raca) {
        super(nome,raca);
    }

    public String mia() {
        return getNome() + " está miando.";
    }
}

