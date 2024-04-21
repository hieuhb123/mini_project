import java.awt.BorderLayout;
import javax.swing.*;

import anima.*;
public class MenuApp {
    public static void main(String[] args) {
        int n = 5;
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Menu App");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel jLabel = new JLabel("HIEIE", JLabel.CENTER);
            JLabel jLabel2 = new JLabel("BOT");
            Animation_selec animation = new Animation_selec(n);
            frame.setLayout(new BorderLayout());
            frame.add(jLabel, BorderLayout.NORTH);
            frame.add(animation, BorderLayout.CENTER);
            frame.add(jLabel2, BorderLayout.SOUTH);
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}