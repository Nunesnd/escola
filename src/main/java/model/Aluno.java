package model;

import java.util.Date;

public class Aluno extends Pessoa{
    
    public int idade;
    public int turma;
    public float nota;
    
    //construtor para momento de matrícula
    public Aluno(int id, String nome, String nascimento, int idade, String sexo) {
        super(id, nome, nascimento, sexo);
        this.idade = idade;
    }

    public Aluno(int idade, String nome, String sexo, String login, String senha) {
        super(nome, sexo, login, senha);
        this.idade = idade;
    }

    public Aluno(String nome, String login, String senha) {
        super(nome, login, senha);
    }

    public Aluno(int id, String nome, String nascimento, String sexo) {
        super(id, nome, nascimento, sexo);
    }

    public Aluno(String nome, String sexo, String login, String senha) {
        super(nome, sexo, login, senha);
    }

    public Aluno(String nome, String nascimento, String sexo, String login, String senha) {
        super(nome, nascimento, sexo, login, senha);
    }
    
    
    
    //construtor para alunos já matriculados anteriormente
    public Aluno(int id, String nome, String nascimento, int idade, String sexo, int turma, float nota) {
        super(id, nome, nascimento, sexo);
        this.idade = idade;
        this.turma = turma;
        this.nota = nota;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
   
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Date getNascimento() {
        return nascimento;
    }
    
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    
    public int getTurma() {
        return turma;
    }
    
    public void setTurma(int turma) {
        this.turma = turma;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    
    
}
