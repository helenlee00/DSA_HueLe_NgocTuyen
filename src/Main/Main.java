public class Main {
  
  public static JFrame window;
    public static void main(String[] args) {
        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D Adventure");
        //window.setUndecorated(true);

        GamePanel gamePanel = new GamePanel(); // Corrected "GamePanel" to lowercase "gamePanel" as it's a variable
        window.add(gamePanel); // Fixed the reference to the `GamePanel` instance

        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        gamePanel.setupGame();
        gamePanel.startGameThread();
    }
}
