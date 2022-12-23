package Day16FileOperations;

import java.io.File;
import java.io.IOException;

public class Files {

	public static void main(String[] args) {
		
		// File Operations 	
		// Handling Files PDF, WORD , EXCEL, TXT 
		
		File n = new File("C:\\Users\\DELL\\Documents\\Day3\\Day16");
		File n1 = new File("C:\\Users\\DELL\\Documents\\Day3\\Day16\\navin.txt");
		
		// System.out.println(n.exists());
	
		
		if(n.exists())
		{
			System.out.println("Folder is not there");
		}
		else
		{
			n.mkdir();
			try {
				n1.createNewFile();
				n1.delete();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		

	}

}
