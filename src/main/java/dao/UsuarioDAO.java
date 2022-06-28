/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;
import views.Frm_cad_user;

/**
 *
 * @author nunes
 */
public class UsuarioDAO {
    
    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Usuario usuario) throws SQLException{
       
            
        String sql = "INSERT INTO usuario (usr_nome, usr_login, usr_senha) VALUES ('"+usuario.getNome()+"', '"+usuario.getLogin()+"', '"+usuario.getSenha()+"');";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        connection.close();
        
    }
    
}
