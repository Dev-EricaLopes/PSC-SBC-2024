
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private String usuario = "root";
    private String senha = "root";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "db_pe";
    
    public Connection obtemConexao (){
    
        try{
            Connection c = DriverManager.getConnection(
            "jdbc:mysql://" + host + ":" + porta + "/" + bd
            + "?serverTimezone=UTC",          
            usuario,
            senha);
            System.out.println("Conexão Efetuada!!");
            return c;
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("ERRO. NÃO CONECTOU!!!");
            return null;
        }
    }
}    