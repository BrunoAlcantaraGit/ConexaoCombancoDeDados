package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class TesteConexao {

    public static void main(String[] args) throws SQLException {


        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String usuario = "postgres";
        final String senha = "root";

        // O método getConnection lança uma exceção que precisa ser tratada pelo Throws
        // ou try catch
        // Neste caso implementado se acontecer uma exceção. A aplicação simplesmente
        // saí do método Main
        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        // Caso ele passe do metodo acima esta mensagem será exibida no console
        System.out.println("Conexao Efetuada com sucesso!");

        // Caso ele passe do metodo acima esta mensagem será exibida no panel do Java
        JOptionPane.showMessageDialog(null, "Conexao realizada com sucesso!");

        // Finalizar a conexão
        conexao.close();

    }

}
