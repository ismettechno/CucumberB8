package Utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtility {

    public static List<List<String>> getData(String path, String sheetName, int sutunSayisi) {
        List<List<String>> tablo=new ArrayList<>();
        Sheet sheet=null;

        try {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheet(sheetName);
        }
        catch (Exception ex)
        {
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            List<String> satir=new ArrayList<>();
            for (int j = 0; j < sutunSayisi ; j++)
                satir.add(sheet.getRow(i).getCell(j).toString());

            tablo.add(satir);
        }

        return tablo;
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
