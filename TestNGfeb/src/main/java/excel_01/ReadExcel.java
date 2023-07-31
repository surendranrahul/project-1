package excel_01;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static String[][] readData(String filename) throws IOException{
		XSSFWorkbook wb=new XSSFWorkbook("./data/"+filename+".xlsx");
		XSSFSheet ws=wb.getSheetAt(0);
		int rowcount = ws.getLastRowNum();
		int cellCount = ws.getRow(0).getLastCellNum();
		String[][] data=new String[rowcount][cellCount];
		
		for (int i = 1; i <=rowcount; i++) {
			for (int j = 0; j < cellCount; j++) {
			String cellValues=ws.getRow(i).getCell(j).getStringCellValue();
			data [i-1][j]=cellValues;
			 System.out.println(cellValues+" ");
			}
			System.out.println("");
		}
		
		return data;
	
	}
	public static void main(String[] args) throws IOException {
		readData("Book1");
	}
	
}
