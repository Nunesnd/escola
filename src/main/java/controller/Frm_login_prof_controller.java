/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Conexao;
import dao.ProfessorDAO;
import java.sql.Connection;
import java.sql.SQLException;
import model.Professor;
import view.Frm_login_prof_view;
import view.Frm_menu_prof_view;

/**
 *
 * @author nunes
 */
public class Frm_login_prof_controller {
    private Frm_login_prof_view view;

    public Frm_login_prof_controller(Frm_login_prof_view view) {
        this.view = view;
    }

    public void autentica() throws SQLException {
        
        String login = view.getTxt_login().getText();
        String passwd = view.getTxt_senha().getText();
        
        Professor profLog = new Professor(login, passwd);
        
        Connection conecta = new Conexao().getConnection();
        
        ProfessorDAO profDAO = new ProfessorDAO(conecta);
        
        boolean existe = profDAO.autLoginPasswd(profLog);
        
        Frm_menu_prof_view telaPrincipal = new Frm_menu_prof_view();
        telaPrincipal.setVisible(existe);
    }
    
    
}
