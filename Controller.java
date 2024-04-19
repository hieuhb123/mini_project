import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Controller implements ActionListener{

    private Menuview menuview;
    public Controller(Menuview menuview) {
        this.menuview = menuview;
    }
    public void actionPerformed(ActionEvent e) {
        String choose = e.getActionCommand();
        switch (choose) {
            case "usage":
                try {
                    Runtime.getRuntime().exec(new String[] { "notepad.exe", "usage.txt" });
                } catch (Exception a) {
                    a.printStackTrace();
                }
                break;
            case "aim":
                try {
                    Runtime.getRuntime().exec(new String[] { "notepad.exe", "aims.txt" });
                } catch (Exception a) {
                    a.printStackTrace();
                }
                break;
            case "Quit":
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
                break;
            case "Merge Sort":

                break;
            case "Selection Sort":

                break;
            case "Shell Sort":

                break;
            default:
                break;
        }
    }
}