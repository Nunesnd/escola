/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.Frm_login_usr_view;
import view.Frm_menu_principal;

/**
 *
 * @author nunes
 */
public class Frm_login_controller {
    
    private Frm_login_usr_view view;

    public Frm_login_controller(Frm_login_usr_view view) {
        this.view = view;
    }

    public void autenticar() throws SQLException {
        
        String user = view.getTxt_login().getText();
        String passwd = view.getTxt_senha().getText();
        
        Usuario usrLog = new Usuario(user, passwd); 
        
        Connection conecta = new Conexao().getConnection();
        UsuarioDAO userDAO = new UsuarioDAO(conecta);
        
        boolean existe = userDAO.autLoginPasswd(usrLog);
        
        Frm_menu_principal telaPrincipal = new Frm_menu_principal();
        telaPrincipal.setVisible(existe);

        
    }
    
    
}
