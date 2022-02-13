import java.io.*;

// Write a Java program that read from a file and write to file by handling all file related exceptions.

public class FileCopyDemo {
    public static void main(String args[]) throws IOException {
        try {
            FileInputStream fr = new FileInputStream("inp.txt");
            FileOutputStream fw = new FileOutputStream("out.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char)i);
                fw.write(i);
            }
            System.out.println("\nFile copied successfully");
            fr.close();
            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}

