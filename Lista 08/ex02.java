public class ex02 {
    public static void main(String[] args) {
        int[] vetor = new int[15];
        int num = 1;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = num++;
            System.out.print(" " +vetor[i]);
        }
            System.out.println();
        for (int i = vetor.length-1; i >= 0 ; i--) {
            System.out.print(" " +vetor[i]);
        }
    }
}
