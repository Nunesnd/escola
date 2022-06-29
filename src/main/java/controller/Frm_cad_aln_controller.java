/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import dao.AlunoDAO;
import dao.Conexao;
import java.sql.Connection;
import javax.swing.JOptionPane;
import view.Frm_cad_aln;
import model.Aluno;
/**
 *
 * @author nunes
 */
public class Frm_cad_aln_controller {
    
    private Frm_cad_aln view;

    public Frm_cad_aln_controller(Frm_cad_aln view) {
        this.view = view;
    }
    
    public void cad_aln(){
        
        //JOptionPane.showMessageDialog(null,"Olapaá");
        String nome = view.get
        //String login = view.getTxt_login().getText();
                
        Aluno aln = new Aluno (nome, sexo, login, senha);  
        
        Connection conexao = new Conexao().getConnection();
        AlunoDAO alnDAO = new AlunoDAO(conexao);
        AlunoDAO 
        
    }
    
}
