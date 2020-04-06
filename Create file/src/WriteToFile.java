import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String[]args) {
		try { 
			FileWriter myWriter= new FileWriter("OurFile.txt");
			myWriter.write("The Students in this File"+ " 1-Abdulrahman naqqan Al-Bahri."+ " 2- Nawaf saad Al-Wadii. "+ "3- Al-Hussain ali Al-Sharman."+ " 4-Alawi abdullah Al-Musabi."+ " 5-Riyad saad Al-aamri."+ " 6-Mohammed fahad Al-Qahtani");
			myWriter.close();
			System.out.println("Successfully write to the file");
			
		}catch(IOException e) {
			System.out.println("An error happend");
			e.printStackTrace();
			
		}
	}
	

}
