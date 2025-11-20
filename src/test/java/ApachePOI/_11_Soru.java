package ApachePOI;

/*
   Main den bir metod çağırmak suretiyle, path i ve sheetName i verilen excelden
   istenilen sütun kadar veriyi okuyup bir List e atınız.
   Bu soruda kaynak Excel için : EditAccount.xlsx  in 2.sheet ini kullanabilirsiniz.
 */

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class _11_Soru {
    public static void main(String[] args) {
        String path = "src/test/java/ApachePOI/Resource/EditAccount.xlsx";
        String sheetName = "editAccount";
        int sutunSayisi = 1;

        List<List<String>> gelenData = getData(path, sheetName, sutunSayisi); // list olarak geri alıcam

        System.out.println("gelenData = " + gelenData);
    }

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

