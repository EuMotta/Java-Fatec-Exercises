public class ex28 {
    public static void main(String[] args) throws Exception {

        int aux = 2;

        for(int i = 1; i <= 10; i++){

            System.out.print(i + ", ");

            for(int j = aux; j <= 10; j++){
                System.out.print(j + " ");
            }

            aux++;

            System.out.print("\n");

        }

    }
}
