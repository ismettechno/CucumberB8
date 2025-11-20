package Utilities;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
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

}
