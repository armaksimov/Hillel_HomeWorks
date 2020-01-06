package MultiThreadPrimeNumsFinder;

import java.util.Scanner;

public class MultiThreadPrimeNumFinder {


    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of threads");
        int nThreads = scanner.nextInt();
        int t;
        int total = 0;
        PrimeThread[] pThreads = new PrimeThread[nThreads];
        long a = 0;
        for(int i = 0; i < 10000000; i++)
            a += i;
        for (t = 0; t < nThreads; t++)
        {
            pThreads[t] = new PrimeThread();
            pThreads[t].start();
        }

        for (t = 0; t < nThreads; t++)
        {
            pThreads[t].join();
            System.out.println("Thread " + t + "  Prime count: " + pThreads[t].count);
        }
        total = PrimeThread.count;
        System.out.println("Total prime count: " + total);
        for (int i = 0; i < PrimeThread.counter; i++)
            System.out.println("" + i + ": " + PrimeThread.primes[i]);
    }
}
