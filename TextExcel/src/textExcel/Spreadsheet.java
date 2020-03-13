/* Anthony Ouyang
 * Period 3
 * March 6, 2020
 * TextExcel.Java Project: Spreadsheet
 */
package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid {
	private int rows;
	private int cols;
	private Cell[][] SprSheet;
	
	public Spreadsheet() {
		rows = 20;
		cols = 12;
		SprSheet = new Cell[rows][cols];
		
		for(int i = 0; i < 20; i++) {
			for(int j = 0; j < 12; j++) {
				SprSheet[i][j] = new EmptyCell();
			}
		}
	}

	@Override
	// processes a user command, returns string to display, must be called in loop from main
	public String processCommand(String command)
	{

		return "";
	}

	@Override
	public int getRows()
	{
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int getCols()
	{
		// TODO Auto-generated method stub
		return 12;
	}

	@Override
	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		
		return SprSheet[loc.getRow()][loc.getCol()];
	}
	@Override
	public String getGridText() 
	{
		// TODO Auto-generated method stub
		String gridText = "   |";
		for(int i=65; i<getCols() + 65; i++) {
			gridText += ((char)i + "         |");
		for(int a=1; a<=rows; a++) {
			gridText += "\n" + a;
		}
			if(i < 10) {
				gridText += "  |";
			} else{
				gridText += " |";
			}
			for(int j=0; j < cols; j++) {
				gridText += SprSheet[i - 1][j].abbreviatedCellText() + "|";
			}
			gridText += "\n";
		}
		return gridText; 

	}
}
		
		
		
		
		
		