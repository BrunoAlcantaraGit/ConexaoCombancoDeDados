package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class CriarTabelaPessoa {

    public static void main(String[] args) throws SQLException {
        Connection conexao = Farmconection.getConnection();

        String sql = "CREATE TABLE pessoas2 ("
                + "Codigo SERIAL Primary Key,"
                + "nome varchar(60) not null"
                + ")";

        Statement stmt = conexao.createStatement();

        stmt.execute(sql);

        System.out.println("Tabela criada com sucesso!");

        JOptionPane.showMessageDialog(null, "Tabela criada com sucesso");

        conexao.close();
    }

}
