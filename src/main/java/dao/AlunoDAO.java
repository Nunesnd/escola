package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Aluno;

public class AlunoDAO {
    
    private final Connection connection;

    public AlunoDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert (Aluno aluno) throws SQLException{
        
        String sql = "INSERT INTO aluno (aln_nome, aln_sexo, aln_login, aln_senha) VALUES ('"+aluno.getNome()+"', '"+aluno.getSexo()+"', '"+aluno.getLogin()+"', '"+aluno.getSenha()+"');";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        connection.close();
        
    }
}
