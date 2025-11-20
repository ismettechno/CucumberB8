package ApachePOI;

// TODO :
// YeniExcel2.xlsx adında bir yeni excele merhaba Dünya 0 şeklinde yazı yazınız.
// Daha sonra program her yeniden çalıştırıldığında altına Merhaba Dünya 1.2.3
// şeklinde eklesin. Yani dosya yok ise oluşturup yazsın, daha sonra hep altına eklesin.

// File dosya=new File(path)
// if ( dosya.exists() )    dosya var ise

// Merhaba Dünya 1
// Merhaba Dünya 2
// Merhaba Dünya 3
// ...

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _10_Soru {

    public static void main(String[] args) throws IOException {

        String path= "src/test/java/ApachePOI/Resource/YeniExcel2.xlsx";

        File dosya=new File(path);
        if (!dosya.exists())  // dosya yok ise
        {
            XSSFWorkbook workbook=new XSSFWorkbook();
            XSSFSheet sheet= workbook.createSheet("Sheet1");

            Row yeniSatir= sheet.createRow(0);
            Cell yeniHucre= yeniSatir.createCell(0);
            yeniHucre.setCellValue("Merhaba Dünya 0");

            // Kaydet
            FileOutputStream outputStream=new FileOutputStream(path); // yazma yönünde
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();

            System.out.println("Yeni dosya oluşturuldu ve ilk satıra yazıldı");
        }
        else
        {
            // var olan dosyaya ekle
            FileInputStream inputStream=new FileInputStream(path);
            Workbook workbook= WorkbookFactory.create(inputStream);
            Sheet sheet= workbook.getSheetAt(0);

            int varOlanSatirSayisi= sheet.getPhysicalNumberOfRows(); // var satır sayısı
            Row yeniSatir= sheet.createRow(varOlanSatirSayisi); // yeni en sona satır açtım
            Cell yeniHucre=yeniSatir.createCell(0);
            yeniHucre.setCellValue("Merhaba Dünya "+varOlanSatirSayisi);

            inputStream.close();// okuma modunu kapat

            // Kaydet
            FileOutputStream outputStream=new FileOutputStream(path); // yazma yönünde
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();

            System.out.println("Var olan dosyaya eklendi");
        }

    }
}
