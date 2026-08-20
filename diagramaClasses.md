```mermaid
classDiagram
    class Aluno {
        -String matricula
        -double media
        +getMatricula()
        +getMedia()
        +setMatricula(String matricula)
        +setMedia(double media)
    }
    class Matricula {
        +dobule valorBase
        +String tipoDesconto
        +calcularMensalidade()
    }
    class Pessoa {
        -String nome
        -boolean ativo
        +getNome()
        +getAtivo()
        +setNome(String nome)
        +setAtivo(boolean ativo)
    }
    class Professor {
        -String siape
        +getSiape()
        +setSiape(String siape)

    }
    class Turma {
        -List~Aluno~ alunos
        +adicionar(Aluno aluno)
    }

    Pessoa <|-- Aluno
    Pessoa <|-- Professor
    Turma o-- Aluno : tem


```
