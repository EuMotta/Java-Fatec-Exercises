import java.util.Scanner;

public class usa_elevador {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o limite de pessoas no elevador: ");
    int limitePessoas = scanner.nextInt();

    System.out.print("Digite o número de andares do prédio: ");
    int numAndares = scanner.nextInt();
    
    System.out.print("Digite o número de subsolos do prédio: ");
    int numSubsolo = scanner.nextInt();

    Elevador elevador = new Elevador(limitePessoas, numAndares, numSubsolo);

    int opcao;
    do {
      System.out.println("\n----- MENU -----");
      System.out.println("1. Movimentar Elevador");
      System.out.println("2. Subir Pessoas");
      System.out.println("3. Descer Pessoas");
      System.out.println("4. Estatísticas");
      System.out.println("5. Sair");
      System.out.print("Escolha uma opção: ");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          elevador.movimentarElevador();
          break;
        case 2:
          elevador.subirPessoas();
          break;
        case 3:
          elevador.descerPessoas();
          break;
        case 4:
          elevador.estatisticas();
          break;
        case 5:
          System.out.println("Encerrando...");
          break;
        default:
          System.out.println("Opção inválida!");
      }
    } while (opcao != 5);
  }
}
