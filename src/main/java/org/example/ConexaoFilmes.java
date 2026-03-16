package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFilmes {
    public static ConexaoFilmes ConexaoFilmes;

    public static Connection conectar(){
            try {
                final String url = "jdbc:sqlite:identifier.sqlite";
                Connection conn = DriverManager
                        .getConnection(url);
                return conn;
            } catch (SQLException e){
                System.out.println("Erro conexão"+ e.getMessage());
                return null;
            }
        }
    }
