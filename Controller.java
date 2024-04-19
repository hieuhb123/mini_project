import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;
public class Controller implements ActionListener{

    private Menuview menuview;
    private Quit quit;

    public Controller(Menuview menuview) {
        this.menuview = menuview;
    }
    public Controller(Quit quit) {
        this.quit = quit;
    }
    public void actionPerformed(ActionEvent e) {
        String choose = e.getActionCommand();
        if(choose.equals("usage"))
            this.menuview.setJLable("usage");
        else if(choose.equals("aim"))
            this.menuview.setJLable("aim");
        else if(choose.equals("Quit")){
            try{
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                new Quit();
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
        else if(choose.equals("YES")){
            this.menuview.setVisible(false);
            this.quit.setVisible(false);
        }
        else if(choose.equals("NO"))
            this.quit.setVisible(false);
    }
}