package Utilities;

import java.sql.*;
import java.util.ArrayList;

public class DBUtility {

    public static ArrayList<ArrayList<String>> getListData(String sorguSql)
    {
        ArrayList<ArrayList<String>> tablo=new ArrayList<>();
        DBConnectionOpen();

        try {
            ResultSet rs = sorguEkrani.executeQuery(sorguSql);
            ResultSetMetaData rsmd = rs.getMetaData(); //kolon sayısı

            while (rs.next()) {
                ArrayList<String> satir = new ArrayList<>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++)
                    satir.add(rs.getString(i));

                tablo.add(satir);
            }
        }
        catch (Exception ex)
        {
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }

        DBConnectionClose();
        return  tablo;
    }

    public static Connection baglanti;
    public static Statement sorguEkrani;

    public static void DBConnectionOpen(){
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

    public static void DBConnectionClose()
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
