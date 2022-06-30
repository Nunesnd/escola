package controller;

import dao.AlunoDAO;
import dao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Aluno;
import view.Frm_cad_aln_view;
/**
 *
 * @author nunes
 */
public class Frm_cad_aln_controller {
    
    private Frm_cad_aln_view view;

    public Frm_cad_aln_controller(Frm_cad_aln_view view) {
        this.view = view;
    }
    
    public void matricula_aluno(){
        
        String nome = view.getTxt_aln_nome().getText();
        String sexo = view.getTxt_sexo().getText();
        String login = view.getTxt_login().getText();
        String senha = view.getTxt_senha().getText();
        
        Aluno aln = new Aluno(nome, sexo, login, senha);
       
        try {
            Connection conexao = new Conexao().getConnection();
            AlunoDAO alnDAO = new AlunoDAO(conexao);
            alnDAO.insert(aln);
            
            JOptionPane.showMessageDialog(null, "Aluno matriculado com sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(Frm_cad_aln_view.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
