public class ReversedArgs {
    public static void main(int args[])
    {
        for (int digit : args) {
            for(int i = args.length - 1; i >= 0; i--){
                System.out.println(args[i] + " ");
            }

        }
    }
}
