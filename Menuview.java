import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Menuview extends JFrame{
    private JLabel jLabel;
    public Menuview (){
        this.setTitle("Demonstration of sorting algorithms on array");
        this.setSize(1000, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);

        Controller controll = new Controller(this); 
        JMenuBar jMenuBar = new JMenuBar();
//start_set_icon
    ImageIcon webIcon = new ImageIcon("my_wife.jpg");
    ImageIcon usageIcon = new ImageIcon("usage.png");
    ImageIcon aimsIcon = new ImageIcon("aims.png");
    ImageIcon quitIcon = new ImageIcon("quit.png");
//end_set_icon

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
//end_set_lable

        jMenuBar.add(jMenu_help);
        jMenuBar.add(jMenu_quit);
        
        this.setIconImage(webIcon.getImage());
        this.setJMenuBar(jMenuBar);
        this.add(jLabel, BorderLayout.NORTH);
        this.setVisible(true);
    }

    public void setJLable(String src){
        this.jLabel.setText(src);
    }
}
