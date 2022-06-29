package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;
import view.Frm_cad_user;

/**
 *
 * @author nunes
 */
public class Frm_cad_user_controller {
    
    private Frm_cad_user view;

    public Frm_cad_user_controller(Frm_cad_user view) {
        this.view = view;
    }
    
    public void cad_user(){
        
        String usuario = view.getTxt_nome().getText();
        String login = view.getTxt_login().getText();
        String senha = view.getTxt_senha().getText();
        
        Usuario user = new Usuario(usuario, login, senha);
                      
            try {

                Connection conexao = new Conexao().getConnection();
                UsuarioDAO userDAO = new UsuarioDAO(conexao);
                userDAO.insert(user);
                    
                JOptionPane.showMessageDialog(null, "Usuário criado com sucesso!");

            } catch (SQLException ex) {
                Logger.getLogger(Frm_cad_user.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
