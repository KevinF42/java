import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Iwrite {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("inputfile.txt");
            outputStream = new FileWriter("output.txt.txt");

            int c;
		
            while ((c = inputStream.read()) != -1) {
				c = c +2;
                outputStream.write(c);
            }
        	} finally {
            		if (inputStream != null) {
                	inputStream.close();
            	}
            		if (outputStream != null) {
                	outputStream.close();
            }
        }
    }
}