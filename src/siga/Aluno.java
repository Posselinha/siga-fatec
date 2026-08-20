package siga;

/**
 * Sistema de Gestão Acadêmica Simplificado (SIGA) Técnicas de Programação II -
 * Fatec de Porto Ferreira
 *
 * ATENÇÃO: código INICIAL da disciplina. Esta classe apresenta,
 * propositalmente, problemas de orientação a objetos que serão corrigidos na
 * atividade prática da Aula 1.
 *
 * Problema principal: os atributos são PÚBLICOS, expondo o estado interno do
 * objeto e permitindo que qualquer código o coloque em um estado inválido (por
 * exemplo, uma média negativa ou maior que 10).
 */
public class Aluno extends Pessoa {

    // Realizado alteração dos atributos de public para private
    private String matricula;
    private double media;

    // Getters
    public String getNome() {
        return this.nome; // Acessa a super classe
    }

    public String getMatricula() {
        return this.matricula;
    }

    public double getMedia() {
        return this.media;
    }

    public boolean getAtivo() {
        return this.ativo; // Acessa a super classe
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMedia(double media) {
        if (media < 0 || media > 10) {
            throw new IllegalArgumentException("Média só pode ficar entre 0 e 10");
        }
        this.media = media;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    // Sem construtor: o objeto pode ser criado em estado incompleto/inconsistente.
}
