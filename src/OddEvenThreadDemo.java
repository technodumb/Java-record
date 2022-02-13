// 2. Write a Java program to create two threads: One for displaying all odd number between 1 and 100 and second thread for displaying all even numbers between 1 and 100.
//
class Display {
    synchronized void display(int n) {
        System.out.println("Number is " + n);
    }
}

class Odd implements Runnable {
    int odd=1;
    Display d;
    Thread t;
    Odd(Display d) {
        this.d = d;
        t = new Thread(this);
        t.start();
    }
    public void run() {
        while (odd <= 100) {
            d.display(odd);
            odd += 2;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Even implements Runnable {
    int even=0;
    Display d;
    Thread t;
    Even(Display d) {
        this.d = d;
        t = new Thread(this);
        t.start();
    }
    public void run() {
        while (even <= 100) {
            d.display(even);
            even += 2;
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}

public class OddEvenThreadDemo {
    public static void main(String args[]) {
        Display d = new Display();
        Even e = new Even(d);
        Odd o = new Odd(d);
        try {
            e.t.join();
            o.t.join();
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }
}