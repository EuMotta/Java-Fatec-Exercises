import java.util.Scanner;

public class Elevador {
  private int andar_atual;
  private int n_pessoas_movim;
  private int n_pessoas_momento;
  private int manha;
  private int tarde;
  private int noite;
  private int n_viagens;
  private int limite_pessoas;
  private int n_andares;
  private int n_subsolo;

  public Elevador(int limite_pessoas, int n_andares, int n_subsolo) {
    andar_atual = 0;
    n_pessoas_movim = 0;
    n_pessoas_momento = 0;
    manha = 0;
    tarde = 0;
    noite = 0;
    n_viagens = 0;
    this.limite_pessoas = limite_pessoas;
    this.n_andares = n_andares;
    this.n_subsolo = n_subsolo;
  }

  public void movimentarElevador() {
    Scanner num = new Scanner(System.in);
    System.out.print("Digite o andar que deseja ir: ");
    int destino = num.nextInt();
  
    if (destino <= -n_subsolo || destino >= n_andares) {
      System.out.println("Andar inválido");
    } else if (destino > andar_atual) {
      System.out.println("Elevador subindo.");
    } else if (destino < andar_atual) {
      System.out.println("Descendo");
    } else if (n_pessoas_momento <= 0) {
      System.out.println("O elevador não se movimenta sozinho.");
    } else {
      System.out.println("Você já está no andar.");
    }
    n_viagens++;
  }
  
  

  public void subirPessoas() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o número de pessoas que estão entrando: ");
    int pessoasEntrando = scanner.nextInt();

    if (pessoasEntrando < 0) {
      System.out.println("Número inválido de pessoas!");
      return;
    }

    System.out.print("Digite o período de funcionamento (1-Manhã, 2-Tarde, 3-Noite): ");
    int periodo = scanner.nextInt();

    while (n_pessoas_momento + pessoasEntrando > limite_pessoas) {
      System.out.println("O elevador não suporta tantas pessoas!");
      System.out.print("Digite um número válido de pessoas que estão entrando: ");
      pessoasEntrando = scanner.nextInt();
    }

    n_pessoas_momento += pessoasEntrando;
    n_pessoas_movim += pessoasEntrando;

    if (periodo == 1) {
      manha += pessoasEntrando;
    } else if (periodo == 2) {
      tarde += pessoasEntrando;
    } else if (periodo == 3) {
      noite += pessoasEntrando;
    } else {
      System.out.println("Período inválido!");
    }

    System.out.println("Pessoas entraram no elevador.");
  }

  public void descerPessoas() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o número de pessoas que estão saindo: ");
    int pessoasSaindo = scanner.nextInt();

    if (pessoasSaindo < 0) {
      System.out.println("Número inválido de pessoas!");
      return;
    }

    if (pessoasSaindo <= n_pessoas_momento) {
      n_pessoas_momento -= pessoasSaindo;
      n_pessoas_movim -= pessoasSaindo;
      System.out.println("Pessoas saíram do elevador.");
    } else {
      System.out.println("Não há pessoas suficientes no elevador!");
    }
  }

  public void estatisticas() {
    System.out.println("Estatísticas:");
    System.out.println("Andar atual: " + andar_atual);
    System.out.println("Número de pessoas na última movimentação: " + n_pessoas_movim);
    System.out.println("Número de pessoas no elevador no momento: " + n_pessoas_momento);
    System.out.println("Número de viagens realizadas: " + n_viagens);
    System.out.println("Número de pessoas que entraram no período da manhã: " + manha);
    System.out.println("Número de pessoas que entraram no período da tarde: " + tarde);
    System.out.println("Número de pessoas que entraram no período da noite: " + noite);
  }
}
