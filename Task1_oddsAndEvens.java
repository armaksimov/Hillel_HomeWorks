import java.util.*;
public class Main {
    public static void main(String args[])
    {
        int nums[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[]  evens = new int[nums.length];
        int[] odds = new int[nums.length];
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] % 2 == 0)
            {
                evens[i] = nums[i];
            }
            else
            {
                odds[i] = nums[i];
            }
        }
        System.out.print("Evens: ");
        for(int i = 0; i<nums.length; i++)
        {
            if(evens[i] == 0 && i<nums.length-1) i++;
            else if(evens[i] == 0 && i == nums.length - 1) break;
            System.out.print(evens[i] + " ");
        }
        System.out.println("");
        System.out.print("Odds: ");
        for(int i = 0; i<nums.length; i++)
        {
            if(odds[i] == 0 && i<nums.length-1) i++;
            else if(odds[i] == 0 && i == nums.length - 1) break;
            System.out.print(odds[i] + " ");
        }
    }
}