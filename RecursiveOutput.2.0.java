public class RecursiveOutput {
    int sum = 0;
    public int recursiveSum(int n) {
        if (n==1)
            return 1;
        else
            return recursiveSum(n-1)+n;
    }
    public int recursiveNumDigitsSum(int k){
        if(k <= 10 && k >= 0)
            return k;
        else
            return (k % 10 + recursiveNumDigitsSum(k / 10));
    }
}
