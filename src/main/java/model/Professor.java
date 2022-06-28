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
public class Professor extends Pessoa{
    
    public String materia;

    public Professor(int cpf, String nome, String nascimento, char sexo, String materia, int turma) {
        super(cpf, nome, nascimento, turma, sexo);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
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
