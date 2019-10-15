package Prmr;

import java.io.IOException;

public class PopulationEval {

public static void main(String[] args) throws IOException, InvalidFormatException
{
File excelFile = new File("C:\Users\gfggee\Documents\2017census.xlsx");
FileInputStream fis = new FileInputStream(excelFile);
  
XSSFWorkbook myWorkbook = new XSSFWorkbook(excelFile);
  
XSSFSheet mySheet = myWorkbook.getSheetAt(0);
  
Iterator<Row> rowIterator = mySheet.iterator();
  
double selectedRow = 1;
HashMap GeographicArea = new HashMap();
while (rowIterator.hasNext())
{
Row row = rowIterator.next();
Iterator<Cell> cellIterator = row.cellIterator();
double selectedColumn = 1;
  
ArrayList yearlyData = new ArrayList();
  
String geographicName = "";
while(cellIterator.hasNext())
{
Cell cell = cellIterator.next();
switch(cell.getCellType())
{
case Cell.CELL_TYPE_NUMERIC:
double num;
num = cell.getNumericCellValue();
if(selectedColumn !=1 && selectedRow >=3)
{
yearlyData.add(num);
}

break;
  
case Cell.CELL_TYPE_STRING:
String stringValue = cell.getStringCellValue();
//System.out.print(stringValue );
if(selectedRow >= 3 && selectedColumn == 1)
{
geographicName = stringValue;
}
if(selectedColumn != 1 && selectedRow >= 3)
{
yearlyData.add(stringValue);
}
break;   
}
selectedColumn++;
}
if(!geographicName.isEmpty())
{
GeographicArea.put(geographicName, yearlyData);
}
//System.out.println();
selectedRow++;
}

fis.close(); // end of reading in file

Scanner input = new Scanner(System.in);
Scanner in = new Scanner(System.in);
String yesorno = "Y";   
do
{
System.out.println("Which state would you like to view data for from 2010 to 2017? Use proper spelling.");
String user = input.nextLine();

if(GeographicArea.containsKey(user))
{
System.out.printf("The data from year 2010 to 2017 for " + user + " is: %f" , GeographicArea.get(user));
}
else
System.out.println("Not found");
  
System.out.print("Do you want to search for population data? Type 'Y' to search: ");
yesorno = in.nextLine();
  
}while(yesorno.equalsIgnoreCase("y"));
  
  
}

}
