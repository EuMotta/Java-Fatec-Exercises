import java.util.Scanner;

public class SJF {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite o número de processos: ");
        int n = num.nextInt();

        // declaração das variaveis
        int[] pid = new int[n], tempoChegada = new int[n], tempoExec = new int[n], tempoFinal = new int[n], ta = new int[n], tempoEspera = new int[n];

        // Informar valores
        //pid: processos
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o tempo de chegada do processo " + (i + 1) + ": ");
            tempoChegada[i] = num.nextInt();
            System.out.print("Digite o tempo de execução do processo " + (i + 1) + ": ");
            tempoExec[i] = num.nextInt();
            pid[i] = i + 1;
        }

        // executa o escalonamento
        int completo = 0, tempoAtual = 0;
        while (completo < n) {
            int menorTempo = -1, menorTE = Integer.MAX_VALUE;
            /*  a variável "menorTempo" guarda o índice do processo 
            com menor tempo de execução restante, a variável "menorTE" 
            guarda o valor do menor tempo de execução restante*/
            for (int i = 0; i < n; i++) {
                if (tempoChegada[i] <= tempoAtual && tempoFinal[i] == 0 && tempoExec[i] < menorTE) {
                    menorTE = tempoExec[i];
                    menorTempo = i;
                }
            }
            //Se não houver nenhum processo disponível para execução no momento, o tempo é incrementado
            /*Se houver um processo disponível, então o tempo final de execução desse processo é definido como 
            a soma do tempo atual e do tempo de execução desse processo*/
            if (menorTempo == -1) {
                tempoAtual++;
            } else {
                tempoFinal[menorTempo] = tempoAtual + tempoExec[menorTempo];
                ta[menorTempo] = tempoFinal[menorTempo] - tempoChegada[menorTempo];
                tempoEspera[menorTempo] = ta[menorTempo] - tempoExec[menorTempo];
                completo++;
                tempoAtual = tempoFinal[menorTempo];
            }
        }
        // Exibir TME E TMP
        float avgtempoEspera = 0, avgta = 0;
        System.out.println("\nPID  Chegada  Execução  Conclusão  Turnaround  Espera");
        for (int i = 0; i < n; i++) {
            avgtempoEspera += tempoEspera[i];
            avgta += ta[i];
            System.out.println(
                    String.format("%-4s %-8s %-9s %-10s %-11s %s",
                            " " + pid[i], "   " + tempoChegada[i], "   " + tempoExec[i], "    " + tempoFinal[i],"    " +  ta[i],"  " +  tempoEspera[i]));
        }
        System.out.println("\nTempo médio de turnaround: " + (float) (avgta / n));
        System.out.println("Tempo médio de espera: " + (float) (avgtempoEspera / n));
        num.close();
    }

}
