package Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Create_data_generic
{
public static void create(String S, int R, int C, String data) throws EncryptedDocumentException, IOException
{
	FileInputStream fis= new FileInputStream("./excel/Book1.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet(S);
	//Sheet sh = book.createSheet("Sheet2");
	Row r = sh.createRow(R);
	Cell c = r.createCell(C);
	c.setCellValue(data);
	FileOutputStream fio= new FileOutputStream("./excel/Book1.xlsx");
	book.write(fio);
}
}
