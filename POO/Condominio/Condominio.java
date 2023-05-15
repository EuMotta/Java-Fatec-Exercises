public class Condominio {
    private boolean[][][][] casa;
    private String[] cor;

    public Condominio(int numCasas, int[] numPortas, String[] cor) {
        this.casa = new boolean[numCasas][][][];
        this.cor = cor;
        for (int i = 0; i < numCasas; i++) {
            this.casa[i] = new boolean[numPortas[i]][2][2];
        }
    }

    public boolean[][][][] getCasa() {
        return this.casa;
    }

    public void setCasa(boolean[][][][] casa) {
        this.casa = casa;
    }

    public String[] getCor() {
        return this.cor;
    }

    public void setCor(String[] cor) {
        this.cor = cor;
    }

    public void setCorCasa(int numCasa, String cor) {
        this.cor[numCasa - 1] = cor;
    }

    public void setEstadoPorta(int numCasa, int numPorta, boolean estado) {
        if (!this.casa[numCasa - 1][numPorta - 1][0][1]) {

            this.casa[numCasa - 1][numPorta - 1][0][0] = estado;
        }else{
            System.out.println("A casa " + numCasa + ", Porta " + numPorta + "está trancada.");
        }
    }

    public void setTrancarPorta(int numCasa, int numPorta, boolean trancar) {
        this.casa[numCasa - 1][numPorta - 1][0][1] = trancar;
    }
}
