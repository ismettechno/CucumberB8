package _JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCParent {
    public static Connection baglanti;
    public static Statement sorguEkrani;

    public void DBConnectionOpen(){
        String serverUrl = "jdbc:mysql://35.224.183.228:3306/sakila";
        String username = "elamysqluser";
        String password = ")KH\\Z;,sPIJvG>1$";

        try {
            baglanti = DriverManager.getConnection(serverUrl, username, password);
            sorguEkrani = baglanti.createStatement();
        }
        catch (Exception ex)
        {
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }
    }

    public void DBConnectionClose()
    {
        try {
            baglanti.close();
        }
        catch (Exception ex)
        {
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }
    }


}
