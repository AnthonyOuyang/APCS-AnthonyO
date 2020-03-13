/* Anthony Ouyang
 * Period 3
 * March 10, 2020
 * TextExcel.Java Project: TextCell
 */
package textExcel;

public class TextCell implements Cell {
	private String contents;

	public String fullCellText() {
		return "\""+this.contents +"\"";
}
	public TextCell(String strInput) {
		this.contents=strInput;
	}
	
	public String abbreviatedCellText() {
		int num=10-this.contents.length();
		String str=contents;
		if(this.contents.length()<10) {
			for(int i=num; i>0; i--) {
				str+=" ";
			}
			return str;
			
		} else if(this.contents.length()==10){
			return this.contents;
			
		} else{
			str=this.contents.substring(0,10);
			return str;
		}
	}
}