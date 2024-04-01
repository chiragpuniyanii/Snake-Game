
package snake_game;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SnakeGameBatch extends JFrame {

    
            
            public SnakeGameBatch() {
        this.setBounds(10, 20, 905, 700);
        GamePanel panel=new GamePanel();
        panel.setBackground(Color.gray);
        this.add(panel);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }
    
    public static void main(String[] args) {
        SnakeGameBatch n=new SnakeGameBatch();
    }
    
    
}
