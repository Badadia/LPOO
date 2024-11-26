package Quest2;

public class Mamifero extends Animal {
    private String alimentoPreferido;

    public Mamifero(String nome, double comprimento, String cor, double velocidade, String alimentoPreferido) {
        super(nome, comprimento, 4, cor, "Terra", velocidade);
        this.alimentoPreferido = alimentoPreferido;
    }

    public String getAlimentoPreferido() {
        return alimentoPreferido;
    }

    public void setAlimentoPreferido(String alimentoPreferido) {
        this.alimentoPreferido = alimentoPreferido;
    }

    @Override
    public String getDados() {
        return super.getDados() + ", Alimento preferido: " + alimentoPreferido;
    }
}

