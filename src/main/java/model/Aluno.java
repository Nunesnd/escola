package model;

import java.util.Date;

public class Aluno extends Pessoa{
    
    public int idade;
    public int turma;
    public float nota;
    
    //construtor para momento de matrícula

    public Aluno(String nome, String sexo, String login, String senha) {
        super(nome, sexo, login, senha);
    }

    public Aluno(String login, String senha) {
        super(login, senha);
    }
   
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
