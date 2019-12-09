public class Recursion {
    public static void main(String[] args) {
        RecursiveOutput rec = new RecursiveOutput();
        System.out.println("Sum is: " + rec.recursiveSum(10));
        System.out.println("Sum of nums digit is: " + rec.recursiveNumDigitsSum(123456));
    }
}
