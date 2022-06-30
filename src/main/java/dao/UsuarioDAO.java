//USUÁRIO DAO

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;

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

    public boolean autLoginPasswd(Usuario usrLog) throws SQLException {
        
        String sql = "select * from usuario where usr_nome = '"+usrLog.getLogin()+"' and usr_senha = '"+usrLog.getSenha()+"';";
                        
        JOptionPane.showMessageDialog(null,"String sql é: "+sql);
        
        PreparedStatement statement = connection.prepareStatement(sql);
        boolean cond = statement.execute();

        return cond;
    }

}
