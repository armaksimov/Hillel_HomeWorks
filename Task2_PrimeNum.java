public class PrimeNumbers
{
    public static void main(String args[])
    {
        int nums[] = new int[]{3, 2, 4, 7, 8, 6, 5, 11, 15, 18};
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0 || nums[i] == 1) System.out.println(nums[i] + " Not a prime number");
            else
            {
                for(int k = 2; k < nums[i]; k++) {
                    if (nums[i] == k) {
                        k++;
                    }
                    if (nums[i] % k > 0)  System.out.println(nums[i] + " Is a prime number");

                    else  System.out.println(nums[i] + " Not a prime number");
                    break;
                }
            }
        }
    }
}