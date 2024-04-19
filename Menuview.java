import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Menuview extends JFrame{
    private JLabel jLabel;
    JFrame frame = new JFrame("Menu Example");
    public Menuview (){
        this.setTitle("Demonstration of sorting algorithms on array");
        this.setSize(1000, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Controller controll = new Controller(this); 
        JMenuBar jMenuBar = new JMenuBar();
//start_set_icon
        ImageIcon webIcon = new ImageIcon("my_wife.jpg");
        ImageIcon usageIcon = new ImageIcon("usage.png");
        ImageIcon aimsIcon = new ImageIcon("aims.png");
        ImageIcon quitIcon = new ImageIcon("quit.png");
//end_set_icon

//start_sort type
        JMenu jMenu_type = new JMenu("Sort Type");
        JMenuItem jMenuItemHelp_merge = new JMenuItem("Merge Sort", usageIcon);
        JMenuItem jMenuItemHelp_selec = new JMenuItem("Selection Sort", aimsIcon);
        JMenuItem jMenuItemHelp_shell = new JMenuItem("Shell Sort", aimsIcon);
        jMenu_type.add(jMenuItemHelp_merge);
        jMenuItemHelp_merge.addActionListener(controll);
        jMenu_type.addSeparator();
        jMenu_type.add(jMenuItemHelp_selec);
        jMenuItemHelp_selec.addActionListener(controll);
        jMenu_type.addSeparator();
        jMenu_type.add(jMenuItemHelp_shell);
        jMenuItemHelp_shell.addActionListener(controll);
//end_sort type

//start_help
        JMenu jMenu_help = new JMenu("Help");
        JMenuItem jMenuItemHelp_usage = new JMenuItem("usage", usageIcon);
        JMenuItem jMenuItemHelp_aim = new JMenuItem("aim", aimsIcon);
        jMenu_help.add(jMenuItemHelp_usage);
        jMenuItemHelp_usage.addActionListener(controll);
        jMenu_help.addSeparator();
        jMenu_help.add(jMenuItemHelp_aim);
        jMenuItemHelp_aim.addActionListener(controll);
//end_help

//start_quit
        JMenu jMenu_quit = new JMenu("Quit");
        JMenuItem jMenuItemQuit_quit = new JMenuItem("Quit", quitIcon);
        jMenu_quit.add(jMenuItemQuit_quit);
        jMenuItemQuit_quit.addActionListener(controll);
//end_quit

//start_set_lable
        jLabel = new JLabel();
        jLabel.setFont(new Font("Arial", Font.BOLD, 50));
        jLabel.setLocation(1, 1);
//end_set_lable

        jMenuBar.add(jMenu_type);
        jMenuBar.add(jMenu_help);
        jMenuBar.add(jMenu_quit);

        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.GRAY);
        jPanel.setLayout(new GridLayout(2, 3));
        JLabel jLabel_1 = new JLabel("1", JLabel.CENTER);
        JLabel jLabel_2 = new JLabel("2", JLabel.RIGHT);
        JLabel jLabel_3 = new JLabel();
        JLabel jLabel_4 = new JLabel();
        JLabel jLabel_5 = new JLabel("5");
//        jLabel_1.setText("1");
        jLabel_1.setFont(new Font("Arial", Font.BOLD, 50));
//        jLabel_2.setText("2");
        jLabel_2.setFont(new Font("Arial", Font.BOLD, 50));
        jLabel_3.setText("3");
        jLabel_3.setFont(new Font("Arial", Font.BOLD, 50));
        jLabel_4.setText("4");
        jLabel_4.setFont(new Font("Arial", Font.BOLD, 50));
        jLabel_5.setFont(new Font("Arial", Font.BOLD, 50));
        jPanel.add(jLabel);
        jPanel.add(jLabel_1);
        jPanel.add(jLabel_2);
        jPanel.add(jLabel_3);
        jPanel.add(jLabel_4);
        jPanel.add(jLabel_5);
        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.CENTER);
        this.setIconImage(webIcon.getImage());
        this.setJMenuBar(jMenuBar);
        this.setVisible(true);
    }

    public void setJLable(String src){
        this.jLabel.setText(src);
    }
}
