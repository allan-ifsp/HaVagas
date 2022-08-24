package br.edu.ifsp.scl.ads.pdm.allan.havagas;

public class Formacao {
    private String anoDeConclusao;
    private String instituicao;
    private String tituloMonografia;
    private String nomeOrientador;

    public String getAnoDeConclusao() {
        return anoDeConclusao;
    }

    public void setAnoDeConclusao(String anoDeConclusao) {
        this.anoDeConclusao = anoDeConclusao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getTituloMonografia() {
        return tituloMonografia;
    }

    public void setTituloMonografia(String tituloMonografia) {
        this.tituloMonografia = tituloMonografia;
    }

    public String getNomeOrientador() {
        return nomeOrientador;
    }

    public void setNomeOrientador(String nomeOrientador) {
        this.nomeOrientador = nomeOrientador;
    }



    @Override
    public String toString() {
        return "Formacao{" +
                "anoDeConclusao='" + anoDeConclusao + '\'' +
                ", instituicao='" + instituicao + '\'' +
                ", tituloMonografia='" + tituloMonografia + '\'' +
                ", nomeOrientador='" + nomeOrientador + '\'' +
                '}';
    }
}
