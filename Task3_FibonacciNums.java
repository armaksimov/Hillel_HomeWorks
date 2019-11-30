public class Fibonacci_Nums
{
    public static void main(String args[])
    {
        int num1 = 1;
        int Fibonacci[] = new int[20];
        Fibonacci[0] = 1;
        Fibonacci[1] = 1;
        System.out.print("Fibonacci numbers are: " + Fibonacci[0] + " " + Fibonacci[1]);
        for(int i = 2; i<Fibonacci.length; i++)
        {
            Fibonacci[i] = Fibonacci[i-2] + Fibonacci[i-1];
            System.out.print(" " + Fibonacci[i]);
        }

    }
}