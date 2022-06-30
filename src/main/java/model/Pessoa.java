package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pessoa {
    
    protected int id;
    protected String nome;
    protected Date nascimento;
    protected String sexo;
    protected String login;
    protected String senha;

    public Pessoa(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }
    
        public Pessoa(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    
    public Pessoa(int id, String nome, String nascimento, String sexo) {
        this.id = id;
        this.nome = nome;
        
        try {
            this.nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(nascimento);
        } catch (ParseException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.sexo = sexo;
    }

    public Pessoa(String nome, String sexo, String login, String senha) {
        this.nome = nome;
        this.sexo = sexo;
        this.login = login;
        this.senha = senha;
    }

    public Pessoa(String nome, String nascimento, String sexo, String login, String senha) {
        this.nome = nome;
        try {
            this.nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(nascimento);
        } catch (ParseException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.sexo = sexo;
        this.login = login;
        this.senha = senha;
    }
        
}
