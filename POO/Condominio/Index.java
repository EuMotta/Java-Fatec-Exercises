import java.util.Scanner;

public class Index {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.println("+--------------------------+");
    System.out.println("|                          |");
    System.out.println("|    CRIE SEU CONDOMINIO   |");
    System.out.println("|                          |");
    System.out.println("+--------------------------+");

    System.out.print("INSIRA O NUMERO DE CASAS: ");
    int numCasas = num.nextInt();

    int[] numPortas = new int[numCasas];
    String[] cor = new String[numCasas];
    for (int i = 0; i < numCasas; i++) {
      System.out.print("INSIRA O NUMERO DE PORTAS PARA A CASA " + (i + 1) + ": ");
      numPortas[i] = num.nextInt();
      System.out.print("INSIRA A COR DA CASA " + (i + 1) + ": ");
      cor[i] = num.next();
    }

    Condominio condominio = new Condominio(numCasas, numPortas, cor);
    int opcao;

    do {
      System.out.println("ESCOLHA UMA OPÇÃO:");
      System.out.printf("%2d - ALTERAR ESTADO DE UMA PORTA%n", 1);
      System.out.printf("%2d - VISUALIZAR PORTAS%n", 2);
      System.out.printf("%2d - ALTERAR ESTADO DE TODAS AS PORTAS%n", 3);
      System.out.printf("%2d - VISUALIZAR CORES%n", 4);
      System.out.printf("%2d - EDITAR CORES%n", 5);
      System.out.printf("%2d - TRANCAR PORTA%n", 6);
      System.out.printf("%2d - ALTERAR TRANCA DE TODAS AS PORTAS%n", 7);
      System.out.printf("%2d - VISUALIZAR ESTADO DA TRANCA DE TODAS AS PORTAS%n", 8);
      System.out.printf("%2d - SAIR%n", 9);

      opcao = num.nextInt();
      switch (opcao) {
        /* Alterar estado da porta Start */
        case 1:
          System.out.print("INSIRA O NUMERO DA CASA: ");
          int numCasa = num.nextInt();
          System.out.print("INSIRA O NUMERO DA PORTA: ");
          int numPorta = num.nextInt();
          System.out.print("INSIRA O ESTADO DA PORTA (0 - FECHADA, 1 - ABERTA): ");
          int estado = num.nextInt();
          System.out.println("|--------------------------|");
          condominio.setEstadoPorta(numCasa, numPorta, estado == 1);
          for (int i = 0; i < condominio.getCasa().length; i++) {
            for (int j = 0; j < condominio.getCasa()[i].length; j++) {
              System.out.println(
                  "| Casa " + (i + 1) + ", Porta " + (j + 1) + ": "
                      + (condominio.getCasa()[i][j][0][0] ? "Aberta  |" : "Fechada |"));
            }
          }
          System.out.println("|--------------------------|");
          System.out.print("DESEJA MODIFICAR OUTRA PORTA? (0 - NAO, 1 - SIM): ");
          opcao = num.nextInt();
          break;
        /* Alterar estado da porta End */

        /* Visualizar portas Start */
        case 2:
          System.out.println("|--------------------------|");
          for (int i = 0; i < condominio.getCasa().length; i++) {
            for (int j = 0; j < condominio.getCasa()[i].length; j++) {
              System.out.println(
                  "| Casa " + (i + 1) + ", Porta " + (j + 1) + ": "
                      + (condominio.getCasa()[i][j][0][0] ? "Aberta  |" : "Fechada |"));
            }
          }
          System.out.println("|--------------------------|");
          break;
        /* Visualizar portas End */

        /* Abrir todas as portas Start */
        case 3:
          System.out.println("DESEJA ABRIR OU FECHAR TODAS AS PORTAS? (0 - ABRIR, 1 - FECHAR, 2 - ESCOLHER CASA)");
          int abrirFechar = num.nextInt();

          switch (abrirFechar) {
            /* Abrir */
            case 0:
              for (int i = 0; i < condominio.getCasa().length; i++) {
                for (int j = 0; j < condominio.getCasa()[i].length; j++) {
                  condominio.setEstadoPorta(i + 1, j + 1, true);
                }
              }
              break;
            /* Fechar */
            case 1:
              for (int i = 0; i < condominio.getCasa().length; i++) {
                for (int j = 0; j < condominio.getCasa()[i].length; j++) {
                  condominio.setEstadoPorta(i + 1, j + 1, false);
                }
              }
              break;
            /* Escolher */
            case 2:
              System.out.print("INSIRA O NÚMERO DA CASA: ");
              int numeroCasa = num.nextInt();
              System.out.println("DESEJA ABRIR OU FECHAR? ( 0 - ABRIR, 1 - FECHAR )");
              int abrirFecharCasa = num.nextInt();
              switch (abrirFecharCasa) {
                case 0:
                  for (int j = 0; j < condominio.getCasa()[numeroCasa - 1].length; j++) {
                    condominio.setEstadoPorta(numeroCasa, j + 1, true);
                  }
                  break;
                case 1:
                  for (int j = 0; j < condominio.getCasa()[numeroCasa - 1].length; j++) {
                    condominio.setEstadoPorta(numeroCasa, j + 1, false);
                  }
                  break;

                default:
                  break;
              }

              break;
            default:
              break;
          }
          /* Abrir todas as portas End */

          /* Visualizar cores Start */
        case 4:
          System.out.println("|--------------|");
          for (int i = 0; i < condominio.getCasa().length; i++) {
            System.out.println(
                "| Casa " + (i + 1) + ", Cor: " + (condominio.getCor()[i]) + " |");
          }
          System.out.println("|--------------|");
          System.out.println();
          break;
        /* Visualizar cores End */

        /* Editar cores Start */
        case 5:
          System.out.print("INSIRA O NUMERO DA CASA: ");
          numCasa = num.nextInt();
          System.out.print("INSIRA A COR DA CASA " + numCasa + ": ");
          String novaCor = num.next();
          condominio.setCorCasa(numCasa, novaCor);
          break;
        /* Editar cores End */

        /* Trancar porta Start */
        case 6:
          System.out.print("INSIRA O NUMERO DA CASA: ");
          numCasa = num.nextInt();
          System.out.print("INSIRA O NUMERO DA PORTA: ");
          numPorta = num.nextInt();
          System.out.print("INSIRA O ESTADO DA PORTA (0 - DESTRANCADA, 1 - TRANCADA): ");
          estado = num.nextInt();

          condominio.setTrancarPorta(numCasa, numPorta, estado == 1);
          System.out.println("|--------------------------|");
          for (int i = 0; i < condominio.getCasa().length; i++) {
            for (int j = 0; j < condominio.getCasa()[i].length; j++) {
              System.out.println(
                  "| Casa " + (i + 1) + ", Porta " + (j + 1) + ": "
                      + (condominio.getCasa()[i][j][0][1] ? "Trancada |" : "Destrancada |"));
            }
          }
          System.out.println("|--------------------------|");
          break;
        /* Trancar porta End */

        /* Trancar Todas as portas Start */
        case 7:
          System.out.println("DESEJA TRANCAR OU DESTRANCAR TODAS AS PORTAS? (0 - TRANCAR, 1 - DESTRANCAR)");
          int trancarDestrancar = num.nextInt();
          switch (trancarDestrancar) {
            case 0:
              for (int i = 0; i < condominio.getCasa().length; i++) {
                for (int j = 0; j < condominio.getCasa()[i].length; j++) {
                  condominio.setTrancarPorta(i + 1, j + 1, true);
                }
              }
              break;
            case 1:
              for (int i = 0; i < condominio.getCasa().length; i++) {
                for (int j = 0; j < condominio.getCasa()[i].length; j++) {
                  condominio.setTrancarPorta(i + 1, j + 1, false);
                }
              }
              break;
            default:
              break;
          }
          /* Trancar Todas as portas End */

          /* Visualizar tranca de Todas as portas Start */
        case 8:
          System.out.println("|--------------------------|");
          for (int i = 0; i < condominio.getCasa().length; i++) {
            for (int j = 0; j < condominio.getCasa()[i].length; j++) {
              System.out.println(
                  "| Casa " + (i + 1) + ", Porta " + (j + 1) + ": "
                      + (condominio.getCasa()[i][j][0][1] ? "Trancada |" : "Destrancada |"));
            }
          }
          System.out.println("|--------------------------|");
        default:
          break;
        /* Visualizar tranca de Todas as portas End */

        case 9:
          System.out.println("|--------------------------|");
          System.out.println("|  SISTEMA DE EMERGENCIA!  |");
          System.out.println("|  0 - ACIONAR   1 - SAIR  |");
          int emergencia = num.nextInt();
          switch (emergencia) {
            case 0:
            System.out.println("|----------------------------------------|");
            System.out.println("|     SISTEMA DE EMERGENCIA ACIONADO!    |");
            System.out.println("|  TODAS AS PORTAS FECHADAS E TRANCADAS  |");
            System.out.println("|----------------------------------------|");
              for (int i = 0; i < condominio.getCasa().length; i++) {
                for (int j = 0; j < condominio.getCasa()[i].length; j++) {
                  condominio.setEstadoPorta(i + 1, j + 1, false);
                }
              }
              for (int i = 0; i < condominio.getCasa().length; i++) {
                for (int j = 0; j < condominio.getCasa()[i].length; j++) {
                  condominio.setTrancarPorta(i + 1, j + 1, true);
                }
              }

              break;

            default:
              break;
          }
          break;
      }
    } while (opcao != 10);
  }
}
