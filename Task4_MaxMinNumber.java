public class MinMaxNums
{
    public static void main(String args[])
    {
        int nums[] = new int[]{3, 2, 4, 7, 8, 6, 5, 11, 15, 18};

        int min = 2147483647;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        System.out.println("Minimal number in array: " + min);
        System.out.println("Maximal number in array: " + max);
    }
}
