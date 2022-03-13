import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilehandelingAppend {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter a = new FileWriter("E:\\WritingFile.txt",true);
		BufferedWriter b= new BufferedWriter(a);
		b.write("I am soumyakant rout");
		b.newLine();
		b.close();
	    a.close();
	    System.out.println("File appended");
	}

}
