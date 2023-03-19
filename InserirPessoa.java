package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InserirPessoa {

    public static void main(String[] args) throws SQLException {
        Scanner scn = new Scanner(System.in);
        Connection conexao = Farmconection.getConnection();
        System.out.println("Informe o nome");
        String nome = scn.nextLine();

        String sql = "Insert Into" +
                " pessoas (nome) " +
                "Values (?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);

        stmt.setString(1, nome);

        stmt.execute();

        System.out.println("Pessoa inserida com sucesso!");




    }

}
