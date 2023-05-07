public class ex27 {
    public static void main(String[] args) throws Exception {
        
        int aux = 10;

        for(int i = 1; i <= 10; i++){

            System.out.print(i + ", ");

            for(int j = 1; j <= aux; j++){
                System.out.print(j + " ");
            }

            aux--;

            System.out.print("\n");

        }
    }
}
