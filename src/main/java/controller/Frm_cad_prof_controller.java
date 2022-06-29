/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Conexao;
import dao.ProfessorDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Professor;
import view.Frm_cad_prof;

/**
 *
 * @author nunes
 */
public class Frm_cad_prof_controller{
    
    private Frm_cad_prof view;

    public Frm_cad_prof_controller(Frm_cad_prof view) {
        this.view = view;
    }
    
    public void cad_prof(){
        String nome = view.getTxt_nome().getText();
        String materia = view.getTxt_materia().getText();
        String login = view.getTxt_login().getText();
        String senha = view.getTxt_senha().getText();
        
        Professor prof = new Professor(nome, materia, login, senha);
        
        try {
            Connection conexao = new Conexao().getConnection();
            ProfessorDAO profDao = new ProfessorDAO(conexao);
            profDao.inserir(prof);
            JOptionPane.showMessageDialog(null, "Professor contratado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(Frm_cad_prof.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
