package Quest1;

import java.util.ArrayList;

public class Estudante {

    private String nome;
    private String matricula;
    private String endereco;
    ArrayList<Double> notas = new ArrayList<Double>();
    public Estudante(String nome, String matricula, String endereco, ArrayList<Double> notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco;
        this.notas = notas;
    }

    public void getMedia() {
        double media = 0;
        for (Double nota : notas) {
            media += nota;
        }
        media = media / notas.size();
        if(media >= 6){
            System.out.println("O estudante foi aprovado!");
        } else {
            System.out.println("O estudante foi reprovado!");
        }
        return;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
}
