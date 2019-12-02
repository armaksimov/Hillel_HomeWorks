public class SubArrayCheck {
    public static void main(String[] args) {
        int motherArr[] = new int[]{0, 1, 3, 4, 7, 9, 8, 0, 2, 4};
        int subArray[] = new int[]{1, 3, 5, 7, 9};
        int similarityCounter = 0;
        for (int i = 0; i < subArray.length; i++) {
            for (int j = 0; j < motherArr.length; j++) {
                if(subArray[i] == motherArr[j]){
                    similarityCounter++;
                }
            }
        }
        if(similarityCounter == subArray.length)
            System.out.println("Sequence subArray is a subsequence of motherArray");
        else
            System.out.println("Sequence subArray isn't a subsequence of motherArray");

    }
}
