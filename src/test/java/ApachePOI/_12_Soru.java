package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
   Main den bir metod çağırmak suretiyle, henüz oluşturulmamış
   path i verilen excel için, program her çalıştıkça içine "test passed"
   yazısını ekleyen metodu yazınız.
   Yani dosya yoksa oluştur ilk satıra yaz, sonra dosya oluşacağı için
   dosya varsa en son satırın altına yaz.

   File dosya= new File(path); //dosya kontrolü

if (!file.exists()) //dosya yok ise
{
  oluşturup
  merhaba düznya yazsın
}
else
{
   var olan dosyaya eklesin
  }

 */
public class _12_Soru {
    public static void main(String[] args) {
        String path="src/test/java/ApachePOI/Resource/TestSonuclari.xlsx";
        String senaryoAdi="Edit Account";
        String testSonuc="Test Passed";

        writeToExcel(path, senaryoAdi, testSonuc); //excel create
        writeToExcel(path, senaryoAdi, testSonuc); //dosya artık var ekleyecek
        writeToExcel(path, senaryoAdi, testSonuc); //dosya artık var ekleyecek
        writeToExcel(path, senaryoAdi, testSonuc); //dosya artık var ekleyecek
        writeToExcel(path, senaryoAdi, testSonuc); //dosya artık var ekleyecek
    }

    public static void writeToExcel(String path, String senaryoAdi, String testSonuc)
    {
        try {
            File dosya = new File(path);
            if (!dosya.exists())  // dosya yok ise
            {
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Sheet1");

                Row yeniSatir = sheet.createRow(0);
                Cell hucre1 = yeniSatir.createCell(0); hucre1.setCellValue(senaryoAdi);
                Cell hucre2 = yeniSatir.createCell(1); hucre2.setCellValue(testSonuc);

                // Kaydet
                FileOutputStream outputStream = new FileOutputStream(path); // yazma yönünde
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();

                System.out.println("Yeni dosya oluşturuldu ve ilk satıra yazıldı");
            } else {
                // var olan dosyaya ekle
                FileInputStream inputStream = new FileInputStream(path);
                Workbook workbook = WorkbookFactory.create(inputStream);
                Sheet sheet = workbook.getSheetAt(0);

                int varOlanSatirSayisi = sheet.getPhysicalNumberOfRows(); // var satır sayısı
                Row yeniSatir = sheet.createRow(varOlanSatirSayisi); // yeni en sona satır açtım
                Cell hucre1 = yeniSatir.createCell(0); hucre1.setCellValue(senaryoAdi);
                Cell hucre2 = yeniSatir.createCell(1); hucre2.setCellValue(testSonuc);

                inputStream.close();// okuma modunu kapat

                // Kaydet
                FileOutputStream outputStream = new FileOutputStream(path); // yazma yönünde
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();

                System.out.println("Var olan dosyaya eklendi");
            }
        }
        catch (Exception ex)
        {
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }

    }



}
