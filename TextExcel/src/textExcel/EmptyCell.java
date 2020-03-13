/* Anthony Ouyang
 * Period 3
 * March 6, 2020
 * TextExcel.Java Project: EmptyCell
 */
package textExcel;

public class EmptyCell implements Cell{
	
	public EmptyCell() {
}
	
	public String fullCellText() {
		
		return "";
		
	}
	
	public String abbreviatedCellText() {
				
		return "          ";
			
	}
}
