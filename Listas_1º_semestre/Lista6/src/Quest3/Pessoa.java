package Quest3;

public class Pessoa {
    private double peso;
    private double altura;
    private String nome;

    public Pessoa(double peso, double altura, String nome) {
        this.peso = peso;
        this.altura = altura;
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularImc(){
        double imc = peso/(altura*altura);
        return imc;
    }
}
