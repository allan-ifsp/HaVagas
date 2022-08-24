package br.edu.ifsp.scl.ads.pdm.allan.havagas;

import java.util.ArrayList;

public class Usuario {
    private Pessoa pessoa;
    private Formacao fundamental, medio, graduacao, especializacao, mestrado, doutorado;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Formacao getFundamental() {
        return fundamental;
    }

    public void setFundamental(Formacao fundamental) {
        this.fundamental = fundamental;
    }

    public Formacao getMedio() {
        return medio;
    }

    public void setMedio(Formacao medio) {
        this.medio = medio;
    }

    public Formacao getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(Formacao graduacao) {
        this.graduacao = graduacao;
    }

    public Formacao getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(Formacao especializacao) {
        this.especializacao = especializacao;
    }

    public Formacao getMestrado() {
        return mestrado;
    }

    public void setMestrado(Formacao mestrado) {
        this.mestrado = mestrado;
    }

    public Formacao getDoutorado() {
        return doutorado;
    }

    public void setDoutorado(Formacao doutorado) {
        this.doutorado = doutorado;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "pessoa=" + pessoa +
                ", fundamental=" + fundamental +
                ", medio=" + medio +
                ", graduacao=" + graduacao +
                ", especializacao=" + especializacao +
                ", mestrado=" + mestrado +
                ", doutorado=" + doutorado +
                '}';
    }
}
//    private String nome, email, telefone, celular, sexo, dataNascimento;
//    private String conclusaoFundamental, conclusaoMedio;
//    private String conclusaoGraduacao, conclusaoEspecializacao;
//    private String instituicaoGraduacao, instituicaoEspecializacao;
//    private String conclusaoMestrado, conclusaoDoutorado;
//    private String instituicaoMestrado, intituicaoDoutorado;
//    private String monografiaMestrado, monografiaDoutorado;
//    private String orientadorMestrado, orientadorDoutorado;
//    private ArrayList<String> fomracao;
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getTelefone() {
//        return telefone;
//    }
//
//    public void setTelefone(String telefone) {
//        this.telefone = telefone;
//    }
//
//    public String getCelular() {
//        return celular;
//    }
//
//    public void setCelular(String celular) {
//        this.celular = celular;
//    }
//
//    public String getSexo() {
//        return sexo;
//    }
//
//    public void setSexo(String sexo) {
//        this.sexo = sexo;
//    }
//
//    public String getDataNascimento() {
//        return dataNascimento;
//    }
//
//    public void setDataNascimento(String dataNascimento) {
//        this.dataNascimento = dataNascimento;
//    }