/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.AlunoDAO;
import dao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import model.Aluno;
import view.Frm_login_aluno_view;
import view.Frm_menu_aluno;

/**
 *
 * @author nunes
 */
public class Frm_login_aln_controller {
    
    private Frm_login_aluno_view view;

    public Frm_login_aln_controller(Frm_login_aluno_view view) {
        this.view = view;
    }

    public void autenticar() throws SQLException {
        
        String usr = view.getTxt_login().getText();
        String passwd = view.getTxt_senha().getText();
        
        Aluno alnLog = new Aluno(usr, passwd);
        
        Connection conecta = new Conexao().getConnection();
        AlunoDAO alnDAO = new AlunoDAO(conecta);
        
        boolean existe = alnDAO.autLoginPasswd(alnLog);
        
        Frm_menu_aluno telaPrincipal = new Frm_menu_aluno();
        telaPrincipal.setVisible(existe);

    }
    
}
