import java.util.*;
import java.io.*;

public class StringTokenizerDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String fileName = sc.nextLine();
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            String numbers = br.readLine();
            StringTokenizer st = new StringTokenizer(numbers, " ");
            System.out.println("The number of integers that were inputted are: " + st.countTokens());
            System.out.println("The integers are: ");
            int sum = 0;
            int tk;
            while (st.hasMoreTokens()) {
                tk = Integer.parseInt(st.nextToken());
                System.out.println("\t" + tk);
                sum += tk;
            }
            System.out.println("The sum of the integers is: " + sum);
            br.close();
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        } catch(IOException e) {
            System.out.println("IO Exception");
        }
        finally {
            sc.close();
        }
    }
}
