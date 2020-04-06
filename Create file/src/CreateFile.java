import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[]args) {
		File myobj= new File("OurFile.txt");
		try {
			if(myobj.createNewFile()) {
				System.out.println("File Created Successfully"+myobj.getName());
			}else {
				System.out.println("File Already Exists.");
				System.out.println("The file located at"+myobj.toURI());
			}
		}catch(IOException e) {
			System.out.println("An error happend");
			e.printStackTrace();
			}
		}
		
	}
