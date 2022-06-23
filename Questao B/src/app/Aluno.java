package app;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno extends Pessoa {
    private String codMatricula;
    private Date dataMatricula;
    private String endereco;
    private float altura;
    private float peso;

    public Aluno () {
        this.dataMatricula = new Date();
    }

    public String getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(String codMatricula) {
        this.codMatricula = codMatricula;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public void addTelefone(String telefone) {
        if (this.getTelefone().size() < 2) {
            this.getTelefone().add(telefone);
        } else {
            System.out.println("Lista de telefone está cheia.");
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "codMatricula='" + codMatricula + '\'' +
                ", dataMatricula=" + dataMatricula +
                ", endereco='" + endereco + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + new SimpleDateFormat("dd/MM/yyyy").format(dataNascimento) +
                ", telefone=" + telefone +
                '}';
    }
}

