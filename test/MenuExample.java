
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create the first menu
        JMenu menu1 = new JMenu("Menu 1");
        JMenuItem menuItem1 = new JMenuItem("Item 1");
        menu1.add(menuItem1);

        // Create the second menu
        JMenu menu2 = new JMenu("Menu 2");
        JMenuItem menuItem2 = new JMenuItem("Item 2");
        menu2.add(menuItem2);

        // Add menus to the menu bar
        menuBar.add(menu1);
        menuBar.add(menu2);

        // Set the menu bar on the frame
        frame.setJMenuBar(menuBar);

        // Create panels for each menu
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Content of Menu 1"));

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Content of Menu 2"));

        // Add action listeners to menu items
        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Replace the frame's content with panel1
                frame.setContentPane(panel1);
                frame.revalidate();
            }
        });

        menuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Replace the frame's content with panel2
                frame.setContentPane(panel2);
                frame.revalidate();
            }
        });

        // Display the frame
        frame.setVisible(true);
    }
}
