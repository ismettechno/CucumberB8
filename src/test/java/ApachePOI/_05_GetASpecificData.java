package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Kullanıcı aşağıdaki excelde, 1.sutundaki bilgilerden istediğini girecek
 * karşılığında bu bilginin satırındaki karşılık gelen bilgilerin tamamı yazdırılacak.
 * src/test/java/ApachePOI/Resource/LoginData.xlsx
 */
public class _05_GetASpecificData {
    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachePOI/Resource/LoginData.xlsx";
        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet= workbook.getSheetAt(0); // 0.sheet i ver

        String aranan="username";
        String bulunan="";

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(aranan))
               for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells() ; j++)
                   System.out.print(sheet.getRow(i).getCell(j)+"\t");

            System.out.println();
        }


        inputStream.close();
    }
}
