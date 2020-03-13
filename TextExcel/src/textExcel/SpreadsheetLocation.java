/* Anthony Ouyang
 * Period 3
 * March 6, 2020
 * TextExcel.Java Project: Spreadsheet Location
 */
package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private String cellName;
	
    @Override
    public int getRow()
    {
    	int row = Integer.parseInt(cellName.substring(1))-1;
		return row;
        // TODO Auto-generated method stub
    }

    @Override
    public int getCol()
    {
    	int col = cellName.charAt(0)-'A';
        return col;
        // TODO Auto-generated method stub
    }
    
    public SpreadsheetLocation(String cellName) {
    	this.cellName = cellName.toUpperCase();
        // TODO: Fill this out with your own code
    }

}
