package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_Soru_2 extends JDBCParent{

    @Test
    public void Test1() throws SQLException {
        DBConnectionOpen();

        ResultSet sonucTG=sorguEkrani.executeQuery("select * from city");

        while(sonucTG.next())
            System.out.println(sonucTG.getString("city"));

        DBConnectionClose();
    }


}
