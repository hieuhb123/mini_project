import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Controller implements ActionListener{

    private Menuview menuview;
    public Controller(Menuview menuview) {
        this.menuview = menuview;
    }
    public void actionPerformed(ActionEvent e) {
        String choose = e.getActionCommand();
        if(choose.equals("usage")){
            try {
                Runtime.getRuntime().exec(new String[] { "notepad.exe", "usage.txt" });
            } catch (Exception a) {
                a.printStackTrace();
            }
        }
        else if(choose.equals("aim")){
            try {
                Runtime.getRuntime().exec(new String[] { "notepad.exe", "aims.txt" });
            } catch (Exception a) {
                a.printStackTrace();
            }
        }
        else if(choose.equals("Quit")){
            int response = JOptionPane.showConfirmDialog(
                    this.menuview,
                    "Are you sure you want to quit?",
                    "Quit Confirmation",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    new ImageIcon("warning.png")
            );
            if (response == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }
}