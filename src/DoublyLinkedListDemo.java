// 1) Write a Java program for the following menu options: 
// a) Create a doubly linked list of elements.
// b) Delete a given element from the above list.
// c) Display the contents of the list after deletion. 


// use collections to implement doubly linked list
import java.util.*;

public class DoublyLinkedListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // create a doubly linked list
        LinkedList<Integer> list = new LinkedList<Integer>();
        // add elements to the list
        int choice=0;
        do {
            System.out.println("MENU");
            System.out.println("1. Add an element to the linked list");
            System.out.println("2. Delete an element from the list");
            System.out.println("3. Display the list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1: 
                    System.out.print("Enter the element to be added: ");
                    int element = sc.nextInt();
                    list.add(element);
                    break;
                case 2:
                    System.out.print("Enter the element to be deleted: ");
                    int elementToBeDeleted = sc.nextInt();
                    list.remove(list.indexOf(elementToBeDeleted));
                case 3:
                    Iterator<Integer> itr = list.iterator();
                    System.out.println("The list is: ");
                    while(itr.hasNext()) {
                        System.out.println(itr.next());
                    }
                    break;
                    
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while(choice != 4);
        sc.close();
    }
    
}