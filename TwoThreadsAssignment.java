/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadindDEMO;

/**
 *
 * @author jorda
 */
public class TwoThreadsAssignment {
    public static void main(String[] args) {
        // Create two objects of the thread class with constructors
        EvenNumberPrinter EvenNumber = new EvenNumberPrinter();
        OddNumberPrinter  OddNumber = new OddNumberPrinter();

        // Start the even thread
        EvenNumber.start();

        try {
            // Sleep for 10 seconds
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start the odd thread
        OddNumber.start();
    }
}

 class EvenNumberPrinter extends Thread {
    public EvenNumberPrinter() {
        // Constructor for EvenNumberPrinter
    }

    @Override
    public void run() {
        for (int i = 0; i <= 50; i += 2) {
            System.out.println("Even Number: " + i);
        }
    }
}

class OddNumberPrinter extends Thread {
    public OddNumberPrinter() {
        // Constructor for OddNumberPrinter
    }

    @Override
    public void run() {
        for (int i = 1; i <= 50; i += 2) {
            System.out.println("Odd Number: " + i);
        }
    }
}
