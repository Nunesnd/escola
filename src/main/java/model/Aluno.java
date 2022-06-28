/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author nunes
 */
public class Aluno extends Pessoa{
    
    public int idade;
    public float nota;

    
    //construtor para momento de matrícula
    public Aluno(int cpf, String nome, String nascimento, int idade, char sexo) {
        super(cpf, nome, nascimento, sexo);
        this.idade = idade;
    }
    
    //construtor para alunos já matriculados anteriormente

    public Aluno(int cpf, String nome, String nascimento, int idade, char sexo, int turma, float nota) {
        super(cpf, nome, nascimento, turma, sexo);
        this.idade = idade;
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
    
    @Override
    public int getCpf() {
        return cpf;
    }
    
    @Override
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String getNome() {
        return nome;
    }
    
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public Date getNascimento() {
        return nascimento;
    }
    
    @Override
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    
    @Override
    public int getTurma() {
        return turma;
    }
    
    @Override
    public void setTurma(int turma) {
        this.turma = turma;
    }

    @Override
    public char getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    
    
}
