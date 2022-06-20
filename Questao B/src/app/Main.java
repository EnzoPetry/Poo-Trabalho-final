package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        boolean finalizar = false;

        ArrayList<Turma> turmas = new ArrayList<>();
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Instrutor> instrutores = new ArrayList<>();

        do {
            Main.desenhaMenu(alunos.size(), turmas.size(), instrutores.size());

            Instrutor instrutor;
            Aluno aluno;
            Turma turma;

            String nome, titulacao, rg, endereco, tipoAtividade;
            Date dataNascimento, dataMatricula, horaAula, dataInicial, dataFinal;

            int opcaoMenu, qtdeAluno, duracaoAula, indiceTurma, indiceAluno, indiceInstrutor;

            float altura, peso;


            do {
                try {
                    opcaoMenu = Integer.parseInt(leitor.readLine());

                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, digite valores válidos.");
                    System.out.print("Selecione a opção: ");
                }
            } while (true);

            switch (opcaoMenu) {
                case 1:
                    instrutor = new Instrutor();

                    do {
                        try {
                            System.out.print("Digite o nome do instrutor: ");

                            nome = leitor.readLine();

                            if (nome.length() < 1) throw new Exception();

                            instrutor.setNome(nome);

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite um nome válido.");
                        }
                    } while (true);

                    do {
                        try {
                            System.out.print("Digite a data de nascimento do instrutor (dd/mm/aaaa): ");
                            dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(leitor.readLine());

                            instrutor.setDataNascimento(dataNascimento);

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite uma data válida.");
                        }
                    } while (true);

                    do {
                        try {
                            System.out.print("Digite o RG do instrutor: ");

                            rg = leitor.readLine();

                            if (rg.length() < 8) throw new Exception();

                            instrutor.setRg(rg);

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite um RG válido.");
                        }
                    } while (true);

                    do {
                        try {
                            System.out.print("Digite a titulação do instrutor: ");

                            titulacao = leitor.readLine();

                            if (titulacao.length() < 1) throw new Exception();

                            instrutor.setTitulacao(titulacao);

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite uma titulação válida.");
                        }
                    } while (true);

                    do {
                        try {
                            System.out.print("Digite o(s) telefone(s) do instrutor (separados por vírgula e espaço. Ex: 123, 321): ");

                            String[] telefoneLista = leitor.readLine().split(", ");

                            for (String telefone : telefoneLista) {
                                if (telefone.length() < 6) throw new Exception();

                                instrutor.addTelefone(telefone);
                            }

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite um telefone válido.");
                        }
                    } while (true);

                    instrutores.add(instrutor);
                    System.out.println("Instrtutor cadastrado com sucesso.");
                    break;
                case 2:
                    aluno = new Aluno();

                    do {
                        try {
                            System.out.print("Digite o nome do aluno: ");

                            nome = leitor.readLine();

                            if (nome.length() < 1) throw new Exception();

                            aluno.setNome(nome);

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite um nome válido.");
                        }
                    } while (true);

                    do {
                        try {
                            System.out.print("Digite o(s) telefone(s) do aluno (separados por vírgula e espaço. Ex: 123, 321): ");

                            String[] telefoneLista = leitor.readLine().split(", ");

                            for (String telefone : telefoneLista) {
                                if (telefone.length() < 1) throw new Exception();

                                aluno.addTelefone(telefone);
                            }

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite um telefone válido.");
                        }
                    } while (true);

                    do {
                        try {
                            System.out.print("Digite o seu enderço: ");

                            endereco = leitor.readLine();

                            if (endereco.length() < 1) throw new Exception();

                            aluno.setEndereco(endereco);

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite um endereco válido.");
                        }
                    } while (true);

                    do {
                        try {
                            System.out.print("Digite a altura do aluno: ");

                            altura = Float.parseFloat(leitor.readLine());

                            if (altura <= 0) throw new Exception();

                            aluno.setAltura(altura);

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite uma altura válida.");
                        }
                    } while (true);

                    do {
                        try {
                            System.out.print("Digite o peso do aluno: ");

                            peso = Float.parseFloat(leitor.readLine());

                            if (peso <= 0) throw new Exception();

                            aluno.setPeso(peso);

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite um peso válido.");
                        }
                    } while (true);

                    dataMatricula = new Date();
                    aluno.setCodMatricula(new SimpleDateFormat("ddMMyyyyHHmmss").format(dataMatricula));
                    aluno.setDataMatricula(dataMatricula);

                    alunos.add(aluno);
                    System.out.println("Aluno (matrícula " + aluno.getCodMatricula() + ") cadastrado com sucesso.");
                    break;
                case 3:
                    turma = new Turma();

                    try {
                        System.out.print("Digite o indice do aluno monitor: ");
                        indiceAluno = Integer.parseInt(leitor.readLine()) - 1;

                        System.out.print("Digite o indice do instrutor monitor: ");
                        indiceInstrutor = Integer.parseInt(leitor.readLine()) - 1;

                        aluno = alunos.get(indiceAluno);
                        instrutor = instrutores.get(indiceInstrutor);

                        System.out.println("Monitor registrado com sucesso.");
                        System.out.println("Instrutor registrado com sucesso.");

                        for (Turma t : turmas) {
                            if (t.getMonitor().getCodMatricula().equals(aluno.getCodMatricula())) {
                                throw new Exception();
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Aluno ou instrutor inválido (s).");
                        continue;
                    }

                    do {
                        try {
                            System.out.print("Digite a quantidade máxima de alunos: ");

                            qtdeAluno = Integer.parseInt(leitor.readLine());

                            if (qtdeAluno < 1) throw new Exception();

                            turma.setQtdeAluno(qtdeAluno);

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite uma quantidade válida.");
                        }
                    } while (true);

                    do {
                        try {
                            System.out.print("Digite a hora da aula (HH:mm): ");

                            horaAula = new SimpleDateFormat("HH:mm").parse(leitor.readLine());

                            turma.setHoraAula(horaAula);

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite uma hora válida.");
                        }
                    } while (true);

                    do {
                        try {
                            System.out.print("Digite a duracao da aula (em minutos): ");

                            duracaoAula = Integer.parseInt(leitor.readLine());

                            if (duracaoAula < 5) throw new Exception();

                            turma.setDuracaoAula(duracaoAula);

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite uma duracao válida.");
                        }
                    } while (true);

                    do {
                        try {
                            System.out.print("Digite a data inicial (dd/mm/aaaa): ");

                            dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse(leitor.readLine());

                            turma.setDataInicial(dataInicial);

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite uma data válida.");
                        }
                    } while (true);

                    do {
                        try {
                            System.out.print("Digite a data final (dd/mm/aaaa): ");

                            dataFinal = new SimpleDateFormat("dd/MM/yyyy").parse(leitor.readLine());

                            turma.setDataFinal(dataFinal);

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite uma data válida.");
                        }
                    } while (true);

                    do {
                        try {
                            System.out.print("Digite o tipo da atividade: ");

                            tipoAtividade = leitor.readLine();

                            if (tipoAtividade.length() < 3) throw new Exception();

                            turma.setTipoAtividade(tipoAtividade);

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite um tipo válido.");
                        }
                    } while (true);

                    turma.setMonitor(aluno);
                    turma.setInstrutor(instrutor);

                    turmas.add(turma);
                    System.out.println("Turma cadastrada com sucesso.");
                    break;

                case 4:
                    try {
                        System.out.print("Digite o índice da turma: ");
                        indiceTurma = Integer.parseInt(leitor.readLine()) - 1;

                        System.out.print("Digite o índice do aluno: ");
                        indiceAluno = Integer.parseInt(leitor.readLine()) - 1;

                        aluno = alunos.get(indiceAluno);

                        if ((turmas.get(indiceTurma).getListaPresenca().size() + 1) > turmas.get(indiceTurma).getQtdeAluno())
                            throw new Exception();
                        turmas.get(indiceTurma).addAlunoTurma(aluno.getCodMatricula());

                    } catch (Exception e) {
                        System.out.println("Turma ou aluno não encontrado (s).");
                    }
                    break;
                case 5:
                    try {
                        System.out.print("Digite o índice da turma: ");
                        indiceTurma = Integer.parseInt(leitor.readLine()) - 1;

                        System.out.println(turmas.get(indiceTurma));
                    } catch (Exception e) {
                        System.out.println("Turma não encontrada.");
                    }

                    break;
                case 6:
                    for (Turma t : turmas) {
                        System.out.println(t);
                    }
                    break;
                case 7:
                    try {
                        System.out.print("Digite o índice da instrutor: ");
                        indiceInstrutor = Integer.parseInt(leitor.readLine()) - 1;

                        System.out.println(instrutores.get(indiceInstrutor));
                    } catch (Exception e) {
                        System.out.println("Instrutor não encontrado.");
                    }
                    break;
                case 8:
                    for (Instrutor i : instrutores) {
                        System.out.println(i);
                    }
                    break;
                case 9:
                    try {
                        System.out.print("Digite o índice do aluno: ");
                        indiceAluno = Integer.parseInt(leitor.readLine()) - 1;

                        System.out.println(alunos.get(indiceAluno));

                    } catch (Exception e) {
                        System.out.println("Aluno não encontrado.");
                    }
                case 10:
                    for (Aluno a : alunos) {
                        System.out.println(a);
                    }
                    break;
                case 11:
                    try {
                        System.out.print("Digite o índice da turma: ");
                        indiceTurma = Integer.parseInt(leitor.readLine()) - 1;

                        System.out.print("Digite o índice do aluno: ");
                        indiceAluno = Integer.parseInt(leitor.readLine()) - 1;

                        aluno = alunos.get(indiceAluno);

                        int presencaAtual = turmas.get(indiceTurma).getListaPresenca().get(aluno.getCodMatricula()) + 1;

                        turmas.get(indiceTurma).getListaPresenca().replace(aluno.getCodMatricula(), presencaAtual);
                    } catch (Exception e) {
                        System.out.println("Turma ou aluno não encontrado (s).");
                    }
                    break;
                case 0:
                    finalizar = true;
                    break;
            }
        } while (!finalizar);
    }

    public static void desenhaMenu(int qtdeAlunos, int qtdeTurmas, int qtdeInstrutores) {
        System.out.println("----------- Sistema Academia de Ginástica ----------");
        System.out.printf("Existem %d aluno(s) matriculado(s) em %d turma(s) com %d instrutor(es) ao todo.\n"
                , qtdeAlunos, qtdeTurmas, qtdeInstrutores);
        System.out.println("1. Cadastrar Instrutor\n2. Cadastrar Aluno\n3. Cadastrar Turma\n4. Registrar Aluno a Turma.\n5. Mostrar turma.\n6. Mostrar todas as turmas\n7. Mostrar instrutor\n8. Mostrar todos os instrutores.\n9. Mostrar aluno.\n10. Mostrar todos os alunos.\n11. Registrar presenca.\n0. Encerrar programa.");
        System.out.print("Selecione a opção: ");
    }

}
