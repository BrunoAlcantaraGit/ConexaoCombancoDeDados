package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Farmconection {
    public static Connection getConnection (){
        try{
            final String url = "jdbc:postgresql://localhost:5432/postgres";
            final String usuario = "postgres";
            final String senha = "root";

            return DriverManager.getConnection(url,usuario,senha );

        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }
}
