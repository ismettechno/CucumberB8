package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_NextPrevAbsRel extends JDBCParent{
    @Test
    public void Test1() throws SQLException {
        DBConnectionOpen();
        ResultSet rs= sorguEkrani.executeQuery("select * from language"); //lang id, name, date

        rs.next();  // 1 adım ileri, sonraki
        System.out.println("1.Satır = " + rs.getString("name")); // English

        rs.next();  // 1 adım ileri, sonraki
        System.out.println("1.Satır = " + rs.getString("name")); // Italian

        rs.previous();  // 1 adım geri, onceki
        System.out.println("1.Satır = " + rs.getString("name")); // English
        DBConnectionClose();
    }


}
