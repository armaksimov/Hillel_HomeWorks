public class RecursiveOutput {
    public static int recursiveSum(int n) {
        int sum = 0;
        if(n == 1)
            return 1;
        do {
            sum = sum + n;
            n--;
        }while (n > 0);
        return sum;
    }
    public static int recursiveNumDigitsSum(int k){
        int sum = 0;
        if(k < 10){
            sum = k;
        }
        else{
            do {
                sum = sum + k%10;
                k /= 10;
            }while(k >= 1);
        }
        return sum;
    }
}
