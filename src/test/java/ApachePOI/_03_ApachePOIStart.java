package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {
       String path="src/test/java/ApachePOI/Resource/ApacheExcel2.xlsx";

        //Java dosya okuma nesnesine bu yolu vererek bağlantı kuruyorum
        FileInputStream dosyaOkumaBaglantisi=new FileInputStream(path);

        //Dosya okuma işlemcisi üzerinden Çalışma Kitabını alıyorum
        // hafızada workbook u alıp oluşturdu
        Workbook calismaKitabi= WorkbookFactory.create(dosyaOkumaBaglantisi);

        //istediğim isimdeki çalışma sayfasını alıyorum
        Sheet calisamaSayfasi= calismaKitabi.getSheet("Sheet1");

        //istenen satırı alıyorum
        Row satir= calisamaSayfasi.getRow(0);  // 0.Satır a ulaştım

        //istenen hücreyi alıyorum.
        Cell hucre= satir.getCell(0);  // ilgili satırın 0.ücresindeki bilgiyi aldım  // Lion

        System.out.println("hucre = " + hucre);
    }
}
