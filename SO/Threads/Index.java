

public class Index {
    public static void main(String[] args) {
        JogoDaVelha jogo = new JogoDaVelha();
        Thread jogador1 = new Thread(new Jogador(jogo, 1));
        Thread jogador2 = new Thread(new Jogador(jogo, 2));
        jogador1.start();
        jogador2.start();
    }
}