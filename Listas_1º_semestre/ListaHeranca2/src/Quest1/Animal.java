package Quest1;

public class Animal {
    private String nome;
    private String raca;

    // Construtores
    public Animal() {
        this.nome = "";
        this.raca = "";
    }

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    // Métodos
    public String caminha() {
        return nome + " está caminhando.";
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}

