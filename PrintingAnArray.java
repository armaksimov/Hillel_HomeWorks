public class PrintingAnArray {
    public static void main(String args[])
    {
        int arr[] = new int[]{2, 4, 5, 6, 7, 8, 9, 12};
        //in a column
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        //in a row
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
