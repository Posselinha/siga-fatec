package siga;

public class Pessoa {

    private String nome;
    private boolean ativo;

    // Getters
    public String getNome() {
        return this.nome;
    }

    public boolean getAtivo() {
        return this.ativo;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
