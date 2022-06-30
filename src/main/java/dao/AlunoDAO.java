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

    public boolean autLoginPasswd(Aluno alnLog) throws SQLException {
        
        String sql = "select * from aluno where aln_login = '"+alnLog.getLogin()+"' and aln_senha = '"+alnLog.getSenha()+"';";        
       
        PreparedStatement statement = connection.prepareStatement(sql);
        boolean cond = statement.execute();

        return cond;
    }
    
    
}
