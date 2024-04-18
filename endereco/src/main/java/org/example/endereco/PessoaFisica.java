package org.example.endereco;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PessoaFisica {
    private String nome;
    private String sexo;
    private Date dataNascimento;
    private List<Endereco> endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = new ArrayList<>();
    }
}
