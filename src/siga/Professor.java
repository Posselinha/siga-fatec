package siga;

/**
 * Código INICIAL da disciplina.
 *
 * Observe que Aluno e Professor repetem os atributos "nome" e
 * "matricula"/"registro". Na atividade da Aula 1, essa duplicação será
 * eliminada com a criação de uma superclasse comum (Pessoa), aplicando herança.
 */
public class Professor extends Pessoa {

    // Adicionado encapsulamento
    private String siape;

    // Getters
    public String getSiape() {
        return this.siape;
    }

    // Setters
    public void setSiape(String siape) {
        this.siape = siape;
    }

}
