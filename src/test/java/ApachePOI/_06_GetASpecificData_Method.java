package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class _06_GetASpecificData_Method {
    public static void main(String[] args) throws IOException {

        String aranan="address";
        String bulunan=getSpecificDataFromExcel(aranan);
        System.out.println("bulunan = " + bulunan);
    }

    public static String getSpecificDataFromExcel(String aranan) throws IOException {
        String bulunan="";

        String path="src/test/java/ApachePOI/Resource/LoginData.xlsx";
        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet= workbook.getSheetAt(0); // 0.sheet i ver

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(aranan))
                for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells() ; j++)
                    bulunan +=sheet.getRow(i).getCell(j)+"\t";

            System.out.println();
        }

        inputStream.close();

        return bulunan;
    }


}
