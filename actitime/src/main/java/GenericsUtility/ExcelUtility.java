package GenericsUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String TtoFetchDataFromExcelUtility(String sheetname,int row,int colon) throws EncryptedDocumentException, IOException
	{
		FileInputStream fUtils2 = new FileInputStream("./src/test/resources/ExcelSep.xlsx");
		Workbook workbook = WorkbookFactory.create(fUtils2);
		return workbook.getSheet(sheetname).getRow(row).getCell(colon).toString();
		
	}
	

}
