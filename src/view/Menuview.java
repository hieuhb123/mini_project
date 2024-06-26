package view;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import controll.*;

public class Menuview extends JFrame{
    private JLabel jLabel;
    private JLabel test;
    public JTextField boxn;
    private JPanel jPanel_2;
    private JPanel jPanel_1;
    public Menuview (){
        this.setTitle("Demonstration of sorting algorithms on array");
        this.setSize(1000, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Controller controll = new Controller(this); 
        JMenuBar jMenuBar = new JMenuBar();
//start_set_icon
        ImageIcon webIcon = new ImageIcon("image/my_wife.jpg");

        ImageIcon usageIcon = new ImageIcon("image/usage.png");
        ImageIcon aimsIcon = new ImageIcon("image/aims.png");
        ImageIcon quitIcon = new ImageIcon("image/quit.png");
        
        ImageIcon TurtleIcon = new ImageIcon("image/Turtle.png");
        ImageIcon RabbitIcon = new ImageIcon("image/Rabbit.png");
//end_set_icon

//start_sort type
        JMenu jMenu_type = new JMenu("Sort Type");
        JMenuItem jMenuItemHelp_merge = new JMenuItem("Merge Sort", RabbitIcon);
        JMenuItem jMenuItemHelp_selec = new JMenuItem("Selection Sort", TurtleIcon);
        JMenuItem jMenuItemHelp_shell = new JMenuItem("Shell Sort", TurtleIcon);
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

//start_set_panel1
        jPanel_1 = new JPanel();
        boxn = new JTextField();
        jLabel = new JLabel();
        jLabel.setFont(new Font("Arial", Font.BOLD, 20));
        jPanel_1.add(jLabel);
        jPanel_1.add(boxn);
//end_set_panel1

//start_set_panel2
jPanel_2 = new JPanel();
test = new JLabel();
test.setFont(new Font("Arial", Font.PLAIN, 15));
jPanel_2.add(test);
//end_set_panel2

//start_set_panel3
JPanel jPanel_3 = new JPanel();
jPanel_3.setLayout(new FlowLayout());
JButton startButton = new JButton("start");
startButton.addActionListener(controll);
JButton continueButton = new JButton("continue");
continueButton.addActionListener(controll);
JButton stopButton = new JButton("stop");
stopButton.addActionListener(controll);
jPanel_3.add(startButton);
jPanel_3.add(continueButton);
jPanel_3.add(stopButton);
//end_set_panel3

        jMenuBar.add(jMenu_type);
        jMenuBar.add(jMenu_help);
        jMenuBar.add(jMenu_quit);

        this.setLayout(new BorderLayout());
        this.add(jPanel_1, BorderLayout.NORTH);
        this.add(jPanel_2, BorderLayout.CENTER);
        this.add(jPanel_3, BorderLayout.SOUTH);
        this.setIconImage(webIcon.getImage());
        this.setJMenuBar(jMenuBar);
        this.setVisible(true);
    }
    public void setJLable(String src){
        this.jLabel.setText(src);
        boxn.setColumns(4);
        boxn.setHorizontalAlignment(JTextField.LEFT);
        boxn.setFont(new Font("Arial", Font.PLAIN, 15));
    }
    public void setTEST(String src){
        this.test.setText(src);
    }
}
