public class Longest_Shortest {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 222, 4444, 333, 575999, 584};
        int max = 0;
        int min = 2147483647;
        int counter = 0;
        int maxCopy = max;
        int minCopy = min;
        int counterMin = 0;
        int length = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        
        do {
             maxCopy = maxCopy / 10;
             counter++;

        }while(maxCopy >= 1);
        
        do {
            minCopy = minCopy /10;
            counterMin++;
        }while (minCopy >= 1);
        
        System.out.println("The longest number of your sequence is: " + max + ", length: " + counter);
        System.out.println("The shortest number of your sequence is: " + min + ", length: " + counterMin);
    }
}
