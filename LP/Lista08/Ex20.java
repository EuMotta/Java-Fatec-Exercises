public class ex20 {

    public static void main(String[] args) {
        int n = 10;
        int[] z;
        z = Vetor.lerVetor(n);
        System.out.print("Vetor desordenado: ");
        Vetor.imprimirVetor(z);
        z = Vetor.ordenarDecrescentemente(z);
        System.out.print("Vetor ordenado: ");
        Vetor.imprimirVetor(z);
    }

}
