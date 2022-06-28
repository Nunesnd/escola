/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nunes
 */
public class Pessoa {
    
    protected int cpf;
    protected String nome;
    protected Date nascimento;
    protected int turma;
    protected char sexo;

    public Pessoa(int cpf, String nome, String nascimento, int turma, char sexo) {
        this.cpf = cpf;
        this.nome = nome;
        
        try {
            this.nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(nascimento);
        } catch (ParseException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.turma = turma;
        this.sexo = sexo;
    }

    public Pessoa(int cpf, String nome, String nascimento, char sexo) {
        this.cpf = cpf;
        this.nome = nome;
        try {
            this.nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(nascimento);
        } catch (ParseException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.sexo = sexo;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
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

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
        
    
}
