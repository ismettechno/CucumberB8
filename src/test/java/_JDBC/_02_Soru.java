package _JDBC;

import org.testng.annotations.Test;

import java.sql.*;

// city tablosundaki tüm satırlardaki şehir isimlerini next ile yazdırınız
public class _02_Soru {

    @Test
    public void Test1() throws SQLException {
        String serverUrl = "jdbc:mysql://35.224.183.228:3306/sakila";
        String username = "elamysqluser";
        String password = ")KH\\Z;,sPIJvG>1$";

        Connection baglanti = DriverManager.getConnection(serverUrl, username, password);
        Statement sorguEkrani = baglanti.createStatement();
        ResultSet sonucTablosuGostergesi = sorguEkrani.executeQuery("select * from city");

        while(sonucTablosuGostergesi.next())
           System.out.println(sonucTablosuGostergesi.getString("city"));

        baglanti.close();
    }

}
