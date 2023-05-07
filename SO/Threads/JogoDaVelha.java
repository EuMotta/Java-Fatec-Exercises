
public class JogoDaVelha {
    private int[][] jogo;
    private int jogadorAtual;
    private boolean ganhador;

    public JogoDaVelha() {
        jogo = new int[3][3];
        jogadorAtual = 1;
        ganhador = false;
    }

    public synchronized void fazerJogada(int x, int y) {
        if (!ganhador && jogo[x][y] == 0) {
            jogo[x][y] = jogadorAtual;
            imprimirJogo();
            verificarGanhador();
            jogadorAtual = (jogadorAtual == 1) ? 2 : 1;
            notifyAll();
            
        } else {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void verificarGanhador() {
        for (int i = 0; i < 3; i++) {
            
            if (jogo[i][0] != 0 && jogo[i][0] == jogo[i][1] && jogo[i][1] == jogo[i][2]) {
                ganhador = true;
                System.out.println("Jogador " + jogadorAtual + " vencedor!");
                break;
            }
            if (jogo[0][i] != 0 && jogo[0][i] == jogo[1][i] && jogo[1][i] == jogo[2][i]) {
                ganhador = true;
                System.out.println("Jogador " + jogadorAtual + " vencedor!");
                break;
            }
        }
        if (!ganhador) {
            if (jogo[0][0] != 0 && jogo[0][0] == jogo[1][1] && jogo[1][1] == jogo[2][2]) {
                ganhador = true;
                System.out.println("Jogador " + jogadorAtual + " vencedor!");
            } else if (jogo[0][2] != 0 && jogo[0][2] == jogo[1][1] && jogo[1][1] == jogo[2][0]) {
                ganhador = true;
                System.out.println("Jogador " + jogadorAtual + " vencedor!");
            }
            
        }
        
    }
    

    private void imprimirJogo() {
        for (int i = 0; i < 3; i++) {
            System.out.println(jogo[i][0] + " | " + jogo[i][1] + " | " + jogo[i][2]);
            if (i != 2) {
                System.out.println("_________");
            }
        }
        System.out.println();
    }
}
