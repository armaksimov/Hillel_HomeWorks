  public class PrintingMatrix {
    public static void main(String[] args) {
        int matrix[][] = new int[6][6];
        int lastDigit = matrix.length * matrix.length;
        int k = 1;
        //System.out.println(lastDigit);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = k;
                k++;
                if(k<10){
                    System.out.print(matrix[i][j] + "  ");
                }
                else
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
