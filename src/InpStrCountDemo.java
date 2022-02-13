import java.io.*;
import java.util.*;

public class InpStrCountDemo {
    public static void main(String[] args)
        throws IOException
    {
        System.out.println("Enter the file name: ");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        try {
            File file = new File(fileName);
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    
            String line;
            int wordCount = 0;
            int characterCount = 0;
            int sentenceCount = 0;
    
            while ((line = bufferedReader.readLine()) != null) {
            
                    characterCount += line.length();
                    String words[] = line.split("\s+");
                    wordCount += words.length;
                    sentenceCount++;             
        }
       
        System.out.println("Total word count = "+ wordCount);
        System.out.println("Total number of lines = "+ sentenceCount);
        System.out.println("Total number of characters = "+ characterCount);
        bufferedReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        catch (IOException e) {
            System.out.println("IO Exception");
        }
        scanner.close();
    }
}

