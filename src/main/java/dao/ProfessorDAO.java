/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Professor;

/**
 *
 * @author nunes
 */
public class ProfessorDAO {
    
    private final Connection connection;

    public ProfessorDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void inserir (Professor professor) throws SQLException{
        
        String sql = "INSERT INTO professor (prof_nome, prof_materia, prof_login, prof_senha) "
                + "VALUES('"+professor.getNome()+"', '"+professor.getMateria()+"', '"+professor.getLogin()+"', '"+professor.getSenha()+"')";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        connection.close();
        
    }

    public boolean autLoginPasswd(Professor profLog) throws SQLException {
           
        String sql = "SELECT * FROM professor WHERE prof_login = '"+profLog.getLogin()+"' AND prof_senha = '"+profLog.getSenha()+"';";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        boolean cond = statement.execute();

        return cond;
    
    }
    
    
    
}
