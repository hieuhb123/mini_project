import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class BuzzFrame extends JFrame {
    private JButton buzz = new JButton("BUZZ ME!!");

    public BuzzFrame() {
        super("BUZZ Frame");
    }

    public void prepareGUI() {
        buzz.addActionListener(new BuzzActionListenerrrrr(this));
        setSize(300, 200);
        getContentPane().add(buzz, BorderLayout.NORTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BuzzFrame bFrame = new BuzzFrame();
            bFrame.prepareGUI();
            bFrame.setVisible(true);
        });
    }
}

class BuzzActionListenerrrrr implements ActionListener {
    private JFrame frame;
    private Point currLocation;
    private int iDisplaceXBy = 5;
    private int iDisplaceYBy = -10;

    public BuzzActionListenerrrrr(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        currLocation = frame.getLocationOnScreen();
        fireBuzzAction();
    }

    private void fireBuzzAction() {
        SwingUtilities.invokeLater(() -> {
            Point position1 = new Point(currLocation.x + iDisplaceXBy, currLocation.y + iDisplaceYBy);
            Point position2 = new Point(currLocation.x - iDisplaceXBy, currLocation.y - iDisplaceYBy);

            for (int i = 0; i < 20; i++) {
                frame.setLocation(position1);
                frame.setLocation(position2);
            }

            frame.setLocation(currLocation);
        });
    }
}