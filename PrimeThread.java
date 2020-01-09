package MultiThreadPrimeNumsFinder;

import java.util.Scanner;

public class PrimeThread extends Thread{
    static long nextNumber = 3;
    public static int count = 0;
    public static int counter;
    public static long[] primes = new long[100000];
    
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input max number please");
        long max = scanner.nextLong();
        long myNumber;
        while ((myNumber = getNextNumber()) <= max) {
            primes[0] = 2;
            if (primeCheck(myNumber)) {
                counter++;
                primes[count++] = myNumber;
            }
        }
    }
    
    public static synchronized long getNextNumber() {
        long n = nextNumber;
        nextNumber += 2;
        return n;
    }

    public boolean primeCheck(long n) {
        int i;
        for (i = 3; i * i <= n; i += 2)
            if (n % i == 0) return false;
        return true;
    }
}
