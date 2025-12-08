package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _04_GetMetaData extends JDBCParent{

    @Test
    public void Test1() throws SQLException {
        DBConnectionOpen();

        //MetaFizik -> Fizik ötesi, fiziğin dışındakiler
        //MetaData -> Data nın dışındaki gelen veriler
        ResultSet rs=sorguEkrani.executeQuery("select * from film");
        ResultSetMetaData rsmd=rs.getMetaData(); // kolon sayısı, isimleri, tipler

        int kolonSayisi= rsmd.getColumnCount();
        System.out.println("kolonSayisi = " + kolonSayisi);

        while(rs.next()) { //her bir satırı
            for (int i = 1; i <= kolonSayisi; i++) //kaç kolon var ise
                System.out.print(rs.getString(i) + "\t");  //rs.getString("city")  yazdır

            System.out.println();
        }






        DBConnectionClose();
    }


}
