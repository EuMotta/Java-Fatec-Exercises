/* Escalonamento FIFO */
import java.util.Scanner;

public class FIFO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de processos: ");
        int n = sc.nextInt();

        int[] temposUCP = new int[n];
        int[] temposCriacao = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o tempo UCP do processo %d: ", i + 1);
            int tempoUCP = sc.nextInt();
            temposUCP[i] = tempoUCP;

            System.out.printf("Digite o tempo de criação do processo %d: ", i + 1);
            int tempoCriacao = sc.nextInt();
            temposCriacao[i] = tempoCriacao;
        }

        int tempoEsperaTotal = 0;
        int tempoProcessamentoTotal = 0;
        int tempoFimAnterior = 0;

        for (int i = 0; i < n; i++) {
            int tempoInicio = Math.max(tempoFimAnterior, temposCriacao[i]);
            int tempoFim = tempoInicio + temposUCP[i];
            int tempoEspera = tempoInicio - temposCriacao[i];
            int tempoProcessamento = tempoFim - temposCriacao[i];

            tempoEsperaTotal += tempoEspera;
            tempoProcessamentoTotal += tempoProcessamento;
            tempoFimAnterior = tempoFim;
            System.out.println("TME do processo " + i + " é:  "  + tempoEspera);
            System.out.println("TMP do processo " + i + " é:  "  + tempoProcessamento);
            System.out.println();
        }

        double tme = (double) tempoEsperaTotal / n;
        double tmp = (double) tempoProcessamentoTotal / n;

        System.out.println("O TME por escalonamento FIFO é: " + tme);
        System.out.println("O TMP por escalonamento FIFO é: " + tmp);

        sc.close();
    }
}