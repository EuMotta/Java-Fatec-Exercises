public class Jogador implements Runnable {
  private JogoDaVelha jogar;
  private int numeroJogador;

  public Jogador(JogoDaVelha jogar, int numeroJogador) {
      this.jogar = jogar;
      this.numeroJogador = numeroJogador;
  }

  @Override
  public void run() {
      while (true) {
          int x = (int) (Math.random() * 3);
          int y = (int) (Math.random() * 3);
          jogar.fazerJogada(x, y);
      }
  }
}
