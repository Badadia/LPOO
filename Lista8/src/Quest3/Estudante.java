package Quest3;

class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;

    public Estudante(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = new double[4];
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public void exibirEstudante() {
        System.out.println("Matrícula: " + matricula + ", Nome: " + nome + ", Média: " + calcularMedia());
    }
}
