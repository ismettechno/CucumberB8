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

        rs.first(); // ilk satıra git
        System.out.println("İlk Satır = " + rs.getString("name")); // English

        rs.last(); // son satıra git
        System.out.println("Son Satır = " + rs.getString("name")); // German
        int sonSatirMik= rs.getRow();  // bulunduğun satırın kaçıncı
        System.out.println("sonSatirMik = " + sonSatirMik);

        rs.absolute(4);  // direk baştan sayarak 4.satıra gider
        System.out.println("4.Satır = " + rs.getString("name")); // Mandarin

        rs.relative(2);  // bulunduğun yerden sayarak 2.satıra gider
        System.out.println("6.Satır = " + rs.getString("name")); // German

        DBConnectionClose();
    }

// rs.next() : sonraki satır
// rs.previous : önceki satır
// rs.absolute(10) : baştan itibaren 10.satıra ileri gider.
// rs.relative(10) : bulunduğu yerden 10.satıra ileri gider.
// rs.absolute(-10) : - (eksi) sondan demektir, sondan 10.satır
// rs.relative(-5) :  - (eksi) bulunduğu yerden 5 satır geri
// ilk satırdan relative ile 5 geri gitmek istersek sınırı taştığı için hata verecektir
// rs.first() :  ilk satıra git
// rs.last() :  Son satıra git
// rs.getRow(); bulunduğu satırın kaçıncı satır bilgisini veririr
}
