/* Anthony Ouyang
 * Period 3
 * March 6, 2020
 * TextExcel.Java Project: Cell
 */
package textExcel;

//*******************************************************
// DO NOT MODIFY THIS FILE!!!
//*******************************************************

public interface Cell
{
	public String abbreviatedCellText(); // text for spreadsheet cell display, must be exactly length 10
	public String fullCellText(); // text for individual cell inspection, not truncated or padded
}
