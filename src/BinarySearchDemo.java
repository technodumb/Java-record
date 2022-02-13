import java.util.*;

public class BinarySearchDemo {

    public static void main(String args[]) {
        int num, i = 0;
        System.out.println("Enter the number of Integers: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Enter the integers : ");
        List<Integer> list = new ArrayList<Integer>();
        while (i < num) {
            list.add(sc.nextInt());
            i++;
        }
        list.sort(null);
        System.out.println("The sorted array is: " + list);

        System.out.println("\n\nEnter the digit to be searched: ");
        int sr = sc.nextInt();
        int result = Collections.binarySearch(list, sr);
        if (result<0) {
            System.out.println("Elements Not Found ! ");
        } else {
            System.out.println(sr + " Found At Position " + result);
        }
        sc.close();
    }

}