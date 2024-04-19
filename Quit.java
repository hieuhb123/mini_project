import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class Quit extends JFrame{
    private JLabel quitLabel = new JLabel();
    private Menuview menuview;
    public void linkwithmenuview(Menuview menuview){
        this.menuview = menuview;
    }
    public Quit(){
        this.setTitle("Demonstration of sorting algorithms on array");
        this.setSize (600, 300);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);

        Controller controll = new Controller(this); 
        this.quitLabel.setText("Are you sure you want to quit?");
        this.quitLabel.setFont(new Font("Arial", Font.BOLD, 15));
        JToolBar jToolBar = new JToolBar();
        JButton jButton_yes = new JButton("YES");
        jButton_yes.addActionListener(controll);
        JButton jButton_no = new JButton("NO");
        jButton_no.addActionListener(controll);
        jToolBar.add(jButton_yes);
        jToolBar.add(jButton_no);
        this.add(jToolBar,BorderLayout.SOUTH);
        this.add(quitLabel, BorderLayout.CENTER);
        this.setVisible(true);
    }
    public void closed(){
        menuview.setVisible(false);
        this.setVisible(false);
    }
}