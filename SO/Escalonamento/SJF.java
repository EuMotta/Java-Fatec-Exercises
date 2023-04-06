import java.util.Scanner;

public class SJF {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite o número de processos: ");
        int n = num.nextInt();

        // declaração das variaveis
        int[] pid = new int[n], at = new int[n], bt = new int[n], ct = new int[n], ta = new int[n], wt = new int[n];

        // Informar valores
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o tempo de chegada do processo " + (i + 1) + ": ");
            at[i] = num.nextInt();
            System.out.print("Digite o tempo de execução do processo " + (i + 1) + ": ");
            bt[i] = num.nextInt();
            pid[i] = i + 1;
        }

        // executa o escalonamento
        int completed = 0, current_time = 0;
        while (completed < n) {
            int shortest_index = -1, shortest_bt = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (at[i] <= current_time && ct[i] == 0 && bt[i] < shortest_bt) {
                    shortest_bt = bt[i];
                    shortest_index = i;
                }
            }
            if (shortest_index == -1) {
                current_time++;
            } else {
                ct[shortest_index] = current_time + bt[shortest_index];
                ta[shortest_index] = ct[shortest_index] - at[shortest_index];
                wt[shortest_index] = ta[shortest_index] - bt[shortest_index];
                completed++;
                current_time = ct[shortest_index];
            }
        }
        // Exibir TME E TMP
        float avgwt = 0, avgta = 0;
        System.out.println("\nPID  Chegada  Execução  Conclusão  Turnaround  Espera");
        for (int i = 0; i < n; i++) {
            avgwt += wt[i];
            avgta += ta[i];
            System.out.println(
                    String.format("%-4s %-8s %-9s %-10s %-11s %s",
                            " " + pid[i], "   " + at[i], "   " + bt[i], "    " + ct[i],"    " +  ta[i],"  " +  wt[i]));
        }
        System.out.println("\nTempo médio de turnaround: " + (float) (avgta / n));
        System.out.println("Tempo médio de espera: " + (float) (avgwt / n));
        num.close();
    }

}
