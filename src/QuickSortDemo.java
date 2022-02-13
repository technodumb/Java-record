// Write a java program that implements quick sort algortithm for sorting a list of names in ascending order.

import java.util.*;

class QuickSort {
    List<String> names;
    QuickSort(List<String> names) {
        this.names = names;
        sort();
    }
    public void sort() {
        names.sort(null);
    }
    public void display() {
        System.out.println("The sorted list is: ");
        for(String name: names) { 
            System.out.println(name);
        }
    }
}

public class QuickSortDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<String>();
        System.out.println("Enter the number of names: ");
        int n = sc.nextInt();
        System.out.println("Enter the names: ");
        for(int i=0; i<n; i++) {
            names.add(sc.next());
        }
        QuickSort qs = new QuickSort(names);
        qs.display();
        sc.close();
    }
}
