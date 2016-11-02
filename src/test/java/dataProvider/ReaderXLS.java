package dataProvider;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;

/**
 * Created by 12vm2 on 29.10.2016.
 */
public class ReaderXLS {
    private InputStream input;
    private HSSFWorkbook workBook;

    public ReaderXLS() {
        try {
            input = new FileInputStream("src\\test\\resources\\Data.xls");
            workBook = new HSSFWorkbook(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object[][] parse(String nameSheet) {
        Sheet sheet = workBook.getSheet(nameSheet);
        int rows = sheet.getPhysicalNumberOfRows();
        int column = sheet.getRow(0).getPhysicalNumberOfCells();
        Object[][] result = new Object[rows][column];

        for (int i = 0; i < rows; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < column; j++ ) {
                Cell cell = row.getCell(j);
                switch (cell.getCellType()) {
                    case 0:
                    case 2: if (nameSheet.contains("Long")) {
                                result[i][j] = (long) cell.getNumericCellValue();
                            } else if (nameSheet.contains("Double")) {
                                result[i][j] = (double) cell.getNumericCellValue();
                            }
                            break;
                    case 1: if (cell.getStringCellValue().equals("Infinity")) {
                                result[i][j] = POSITIVE_INFINITY;
                            } else if(cell.getStringCellValue().equals("NaN")) {
                                result[i][j] = NaN;
                            }
                            break;
                    case 4: result[i][j] = (boolean)cell.getBooleanCellValue();
                            break;
                }
            }
        }

        return result;
    }
}
