package parameterization;

	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	
	public class Excel3 {
	
	
		public static void main(String[]args) throws IOException
		{
			//data
			//create workbook and spreadsheet
			//logic 
			//write
		
			//For serial number
			int[] serial = new int[10];
			for(int i=0; i<10 ;i++)
			{
				serial[i]=i+1;
			}
			
			//for column
			String[] name = new String[10];
			
			name[0]="Student A";
			name[1]="Student B";
			name[2]="Student C";
			name[3]="Student D";
			name[4]="Student E";
			name[5]="Student F";
			name[6]="Student G";
			name[7]="Student H";
			name[8]="Student H";
			name[9]="Student I";
			
			//for result column
			String[] result = new String[10];
			result[0] ="pass";
			result[1] ="pass";
			result[2] ="pass";
			result[3] ="fail";
			result[4] ="pass";
			result[5] ="pass";
			result[6] ="pass";
			result[7] ="fail";
			result[8] ="pass";
			result[9] ="fail";
			
			
			//create workbook
			XSSFWorkbook wb= new XSSFWorkbook();
			
			//create Spreadsheet
			XSSFSheet sheet= wb.createSheet("sheet1");
			
			//craete rows
			XSSFRow row;
			row=sheet.createRow(0);
			
			XSSFCell cell0 =row.createCell(0); //column
			XSSFCell cell1 =row.createCell(1);
			XSSFCell cell2 =row.createCell(2);
			
			//logic
			for(int a=0; a<10 ;a++)//for row
			{
			   row=sheet.createRow(a+1); //0+1=1
			   for(int j=0;j<3;j++)//for column
			   {
				XSSFCell cell = row.createCell(j);
				
				if(cell.getColumnIndex()==0)
				{
					cell.setCellValue(serial[a]);
				}
				if(cell.getColumnIndex()==1);
				{
					cell.setCellValue(name[a]);
				}
				if(cell.getColumnIndex()==2)
				{
					cell.setCellValue(result[a]);
				}
			}
			   
			   String path = "D:\\Apacheexcellsheet\\excle.xlsx\\";
				FileOutputStream out = new 	FileOutputStream(path);
				wb.write(out);
				System.out.println(" File is generated---------");
				out.close();
				

}
}
		
	}