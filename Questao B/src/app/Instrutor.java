package app;

import java.text.SimpleDateFormat;

public class Instrutor extends Pessoa {
    private String rg;
    private String titulacao;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public void addTelefone(String telefone) {
        this.getTelefone().add(telefone);
    }

    @Override
    public String toString() {
        return "Instrutor{" +
                "rg='" + rg + '\'' +
                ", titulacao='" + titulacao + '\'' +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + new SimpleDateFormat("dd/MM/yyyy").format(dataNascimento) +
                ", telefone=" + telefone +
                '}';
    }
}
