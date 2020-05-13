import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFDataFormat;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelsample1 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		System.out.println("creating the excel sheet");
		XSSFSheet sheet = workbook.createSheet("First excel sheet");
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		
		
		
		//Set the sell value
		System.out.println("setting cell value");
		cell.setCellValue("1. aniket cell");
		
		System.out.println("create cell 1");
		
		cell = row.createCell(1);
		
		XSSFDataFormat format =  workbook.createDataFormat();
		CellStyle datestyle =  workbook.createCellStyle();
		datestyle.setDataFormat(format.getFormat("dd.mm.yy"));
		cell.setCellStyle(datestyle);
		cell.setCellValue(new Date());
		
		
		row.createCell(2).setCellValue("aniket");
		
		//write in file
		System.out.println("Writing into the workbook");
		workbook.write(new FileOutputStream("Testdata.xlsx"));
		
		System.out.println("closing the workbook");
		workbook.close();
		
		
		
		
		
		
	}

}
