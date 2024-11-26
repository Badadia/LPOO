package Quest3;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteSistema {
    public static void main(String[] args) {
        ArrayList<Turma> turmas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n--- Sistema de Ensino ---");
            System.out.println("1. Cadastrar turma");
            System.out.println("2. Cadastrar estudante");
            System.out.println("3. Listar turmas");
            System.out.println("4. Listar estudantes por turma");
            System.out.println("5. Consultar média de um estudante");
            System.out.println("6. Alterar notas de um estudante");
            System.out.println("7. Exibir média dos estudantes de uma turma");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            switch (scanner.nextInt()){
                case 0:
                    continuar = false;
                    break;
                case 1:
                    if (turmas.size() >= 10) {
                        System.out.println("Não é possível cadastrar mais turmas (limite atingido).");
                        break;
                    }
                    System.out.print("Digite o código da turma: ");
                    String codigo = scanner.next();
                    System.out.print("Digite o nome da turma: ");
                    String nome = scanner.next();
                    turmas.add(new Turma(codigo, nome));
                    System.out.println("Turma cadastrada com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o código da turma: ");
                    codigo = scanner.next();
                    for (Turma turma : turmas) {
                        if (turma.getCodigo().equals(codigo)) {
                            if (turma.getEstudantes().size() >= 10) {
                                System.out.println("A turma já atingiu o limite de estudantes.");
                                break;
                            } else {
                                System.out.print("Digite a matrícula do estudante: ");
                                String matricula = scanner.next();
                                System.out.print("Digite o nome do estudante: ");
                                nome = scanner.next();
                                double[] novasNotas = new double[4];
                                for (int i = 0; i < 4; i++) {
                                    System.out.print("Digite a nota " + (i + 1) + ": ");
                                    novasNotas[i] = scanner.nextDouble();
                                }
                                Estudante estudante = new Estudante(matricula, nome);
                                estudante.setNotas(novasNotas);
                                turma.adicionarEstudante(estudante);
                                System.out.println("Estudante cadastrado com sucesso!");
                            }
                        }
                    }
                    break;
                case 3:
                    if (turmas.isEmpty()) {
                        System.out.println("Nenhuma turma cadastrada.");
                    } else {
                        System.out.println("\n--- Turmas Cadastradas ---");
                        for (Turma turma : turmas) {
                            turma.exibirTurma();
                        }
                    }
                    break;
                case 4:
                    System.out.print("Digite o código da turma: ");
                    codigo = scanner.next();
                    for (Turma turma : turmas) {
                        if (turma.getCodigo().equals(codigo)) {
                            System.out.println("\n--- Estudantes da Turma " + turma.getNome() + " ---");
                            for (Estudante estudante : turma.getEstudantes()) {
                                estudante.exibirEstudante();
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.print("Digite o código da turma: ");
                    codigo = scanner.next();
                    for (Turma turma : turmas) {
                        if (turma.getCodigo().equals(codigo)) {
                            System.out.print("Digite a matrícula do estudante: ");
                            String matricula = scanner.next();
                            for (Estudante estudante : turma.getEstudantes()) {
                                if (estudante.getMatricula().equals(matricula)) {
                                    System.out.println("Média do estudante " + estudante.getNome() + ": " + estudante.calcularMedia());
                                }
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.print("Digite o código da turma: ");
                    codigo = scanner.next();
                    for (Turma turma : turmas) {
                        if (turma.getCodigo().equals(codigo)) {
                            System.out.print("Digite a matrícula do estudante: ");
                            String matricula = scanner.next();
                            for (Estudante estudante : turma.getEstudantes()) {
                                if (estudante.getMatricula().equals(matricula)) {
                                    double[] novasNotas = new double[4];
                                    for (int i = 0; i < 4; i++) {
                                        System.out.print("Digite a nota " + (i + 1) + ": ");
                                        novasNotas[i] = scanner.nextDouble();
                                    }
                                    estudante.setNotas(novasNotas);
                                    System.out.println("Notas atualizadas com sucesso!");
                                }
                            }

                        }
                    }
                    break;
                case 7:
                    System.out.print("Digite o código da turma: ");
                    codigo = scanner.next();
                    for (Turma turma : turmas) {
                        if (turma.getCodigo().equals(codigo)) {
                            double somaMedias = 0;
                            for (Estudante estudante : turma.getEstudantes()) {
                                somaMedias += estudante.calcularMedia();
                            }
                            double mediaTurma = somaMedias / turma.getEstudantes().size();
                            System.out.println("Média da turma " + turma.getNome() + ": " + mediaTurma);
                        }
                    }
                    break;
            }
            }
        }
    }

