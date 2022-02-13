import java.io.*;

public class DisplayFileWithLineDemo {
    public static void main(String[] args) throws IOException {
        try{
            FileInputStream fis = new FileInputStream("inp.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            int i = 1;
            while((line = br.readLine()) != null){
                System.out.print(i + ". ");
                System.out.println(line);
                i++;
            }
            br.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("IO Exception");
        }
    }
}
