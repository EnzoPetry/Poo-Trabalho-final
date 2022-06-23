package app;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Turma {
    private Map<String, Integer> listaPresenca;
    private int qtdeAluno;
    private Date horaAula;
    private int duracaoAula;
    private Date dataInicial;
    private Date dataFinal;
    private String tipoAtividade;
    private Aluno monitor;
    private Instrutor instrutor;

    public Turma() {
        this.listaPresenca = new HashMap<>();
        this.horaAula = new Date();
        this.dataInicial = new Date();
        this.dataFinal = new Date();
    }

    public Aluno getMonitor() {
        return monitor;
    }

    public void setMonitor(Aluno monitor) {
        this.monitor = monitor;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public Map<String, Integer> getListaPresenca() {
        return listaPresenca;
    }

    public void setListaPresenca(Map<String, Integer> listaPresenca) {
        this.listaPresenca = listaPresenca;
    }

    public int getQtdeAluno() {
        return qtdeAluno;
    }

    public void setQtdeAluno(int qtdeAluno) {
        this.qtdeAluno = qtdeAluno;
    }

    public Date getHoraAula() {
        return horaAula;
    }

    public void setHoraAula(Date horaAula) {
        this.horaAula = horaAula;
    }

    public int getDuracaoAula() {
        return duracaoAula;
    }

    public void setDuracaoAula(int duracaoAula) {
        this.duracaoAula = duracaoAula;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getTipoAtividade() {
        return tipoAtividade;
    }

    public void setTipoAtividade(String tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }

    public void addAlunoTurma(String matriculaAluno) {
        if (this.getListaPresenca().containsKey(matriculaAluno)) {
            System.out.println("Aluno já está vinculado a turma.");
        } else {
            this.getListaPresenca().put(matriculaAluno, 0);

            System.out.println("Aluno adicionado à turma com sucesso");
        }
    }

    @Override
    public String toString() {
        return "Turma: " +
                "listaPresenca=" + listaPresenca +
                ", Quatidade de aluno=" + qtdeAluno +
                ", Hora da aula=" + new SimpleDateFormat("HH:mm").format(horaAula) +
                ", Duracao=" + duracaoAula +
                ", Data Inicio=" + new SimpleDateFormat("dd/MM/yyyy").format(dataInicial) +
                ", Data Fim=" + new SimpleDateFormat("dd/MM/yyyy").format(dataFinal) +
                ", Atividade='" + tipoAtividade + '\'' +
                ", Monitorado por=" + monitor +
                ", Instruido por=" + instrutor +
                '}';
    }
}
