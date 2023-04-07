public class ex01 {
    public static void main(String[] args) {
        int[] vetor = new int[15];
        int num = 1;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = num++;
            System.out.println(vetor[i]);
        }
    }
}
