import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A6_1{
    public static void readFile(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new IOException("File not found: " + fileName, e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Error closing the file reader");
                }
            }
        }
    }
    public static void main(String args[]){
        String fileName = "example.txt";
        try {
            readFile(fileName);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}