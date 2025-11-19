package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class _04_ApachePOIGetAllData {
    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachePOI/Resource/ApacheExcel2.xlsx";
        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet= workbook.getSheetAt(0); // 0.sheet i ver

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {  // zoo.length : satır sayısı

            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells() ; j++) // zoo[i].length bu satırdaki hucre sayısı
                System.out.print(sheet.getRow(i).getCell(j)+"\t");  // soo[i][j] , list.get(i).get(j)

            System.out.println();
        }

    }
}
