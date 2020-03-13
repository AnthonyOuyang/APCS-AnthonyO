/* Anthony Ouyang
 * Period 3
 * March 6, 2020
 * TextExcel.Java Project: TextExcel
 */
package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel{

	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		
		Spreadsheet S = new Spreadsheet();
		System.out.println("Enter command: ");
		String command = userInput.nextLine();
		
		while (!command.equalsIgnoreCase("quit")) {
			System.out.println(S.processCommand(command));
			System.out.println("Enter command: ");
			command = userInput.nextLine();
		}
		userInput.close();
	}
}
