class NumberPrinter extends Thread {
    
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("NumberPrinter interrupted.");
            }
        }
    }
}

class LetterPrinter implements Runnable {
    
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Letter: " + c);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("LetterPrinter interrupted.");
            }
        }
    }
}

public class Assignment4 {
    public static void main(String[] args) {
        NumberPrinter t1 = new NumberPrinter();
        Thread t2 = new Thread(new LetterPrinter());

        t1.start();
        t2.start();
    }
}