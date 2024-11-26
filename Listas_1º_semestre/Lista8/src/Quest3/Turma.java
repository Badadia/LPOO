package Quest3;

import java.util.ArrayList;

class Turma {
    private String codigo;
    private String nome;
    private ArrayList<Estudante> estudantes;

    public Turma(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.estudantes = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }

    public boolean adicionarEstudante(Estudante estudante) {
        if (estudantes.size() < 10) {
            estudantes.add(estudante);
            return true;
        } else {
            return false;
        }
    }

    public void exibirTurma() {
        System.out.println("Código: " + codigo + ", Nome: " + nome + ", Estudantes: " + estudantes.size());
    }
}

