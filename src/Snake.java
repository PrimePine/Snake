import javax.swing.*;

public class Snake {
    public static class App {
        public static void main(String[] args) throws Exception {
            int boardWidth = 600;
            int boardHeight = boardWidth;

            JFrame frame = new JFrame("Snake");
            frame.setVisible(true);
            frame.setSize(boardWidth, boardHeight);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Main.SnakeGame snakeGame = new Main.SnakeGame(boardWidth, boardHeight);
            frame.add(snakeGame);
            frame.pack();
            snakeGame.requestFocus();
        }
    }
}
