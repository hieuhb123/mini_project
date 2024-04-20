import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleAnimation extends JPanel implements ActionListener {
    private Timer timer;
    private int x = 0;
    private int y = 0;
    private int dx = 2;
    private int dy = 2;

    public SimpleAnimation() {
        timer = new Timer(1, this);
        timer.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, y, 50, 50);
    }

    public void actionPerformed(ActionEvent e) {
        x += dx;
        if (x > getWidth() - 50 || x < 0) {
            dx *= -1;
        }
        y += dy;
        if (y > getHeight() - 50 || y < 0) {
            dy *= -1;
        }
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new SimpleAnimation());
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
