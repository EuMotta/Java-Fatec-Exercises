import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JogoDaVelha extends JFrame {

    private JButton[][] buttons;
    private boolean isPlayer1Turn;
    private boolean gameOver;

    public JogoDaVelha() {
        super("Jogo da Velha");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));

        buttons = new JButton[3][3];
        isPlayer1Turn = true;
        gameOver = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 60));
                buttons[i][j].addActionListener(new ButtonClickListener(i, j));
                add(buttons[i][j]);
            }
        }

        pack();
        setVisible(true);

        // Inicia as threads para jogar automaticamente
        Thread player1Thread = new Thread(new AutomaticPlayer(true));
        Thread player2Thread = new Thread(new AutomaticPlayer(false));

        player1Thread.start();
        player2Thread.start();
    }

    private class ButtonClickListener implements ActionListener {
        private int row;
        private int col;

        public ButtonClickListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (!gameOver) {
                JButton buttonClicked = (JButton) e.getSource();

                if (buttonClicked.getText().isEmpty()) {
                    if (isPlayer1Turn) {
                        buttonClicked.setText("X");
                    } else {
                        buttonClicked.setText("O");
                    }

                    buttonClicked.setEnabled(false);

                    if (checkWin()) {
                        String winner = isPlayer1Turn ? "Jogador 1 (X)" : "Jogador 2 (O)";
                        JOptionPane.showMessageDialog(null, "Parabéns! " + winner + " venceu!");
                        gameOver = true;
                    } else if (checkDraw()) {
                        JOptionPane.showMessageDialog(null, "Empate!");
                        gameOver = true;
                    } else {
                        isPlayer1Turn = !isPlayer1Turn;
                    }
                }
            }
        }
    }

    private boolean checkWin() {
        String[][] board = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = buttons[i][j].getText();
            }
        }

        // Verificar linhas
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]) && !board[i][0].isEmpty()) {
                return true;
            }
        }

        // Verificar colunas
        for (int j = 0; j < 3; j++) {
            if (board[0][j].equals(board[1][j]) && board[1][j].equals(board[2][j]) && !board[0][j].isEmpty()) {
                return true;
            }
        }

        // Verificar diagonais
        if ((board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[0][0].isEmpty()) ||
                (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[0][2].isEmpty())) {
            return true;
        }

        return false;
    }

    private boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j].getText().isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    private class AutomaticPlayer implements Runnable {
        private boolean isPlayer1;

        public AutomaticPlayer(boolean isPlayer1) {
            this.isPlayer1 = isPlayer1;
        }

        @Override
        public void run() {
            while (!gameOver) {
                if (isPlayer1 == isPlayer1Turn) {
                    try {
                        Thread.sleep(1000); // Delay para melhor visualização
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    int row = (int) (Math.random() * 3);
                    int col = (int) (Math.random() * 3);

                    JButton button = buttons[row][col];

                    if (button.getText().isEmpty()) {
                        if (isPlayer1) {
                            button.setText("X");
                        } else {
                            button.setText("O");
                        }

                        button.setEnabled(false);

                        if (checkWin()) {
                            String winner = isPlayer1 ? "Jogador 1 (X)" : "Jogador 2 (O)";
                            JOptionPane.showMessageDialog(null, "Parabéns! " + winner + " venceu!");
                            gameOver = true;
                        } else if (checkDraw()) {
                            JOptionPane.showMessageDialog(null, "Empate!");
                            gameOver = true;
                        } else {
                            isPlayer1Turn = !isPlayer1Turn;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new JogoDaVelha();
        });
    }
}
