package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection conectar(){
        try{
            String url = "jdbc:mysql://localhost:3306/controle_fornecedor";
            String user = "root";
            String password = "Senac1234";
            return DriverManager.getConnection(url, user, password);
        }catch (SQLException e){
            throw new RuntimeException("Erro de conexão com banco de dados!!!");
        }
    }
}
