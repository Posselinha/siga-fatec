package siga;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private List<Aluno> alunos = new ArrayList<>();

    public void adicionar(Aluno aluno) {
        this.alunos.add(aluno);
    }
}
