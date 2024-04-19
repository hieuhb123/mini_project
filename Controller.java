import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{

    private Menuview menuview;

    public Controller(Menuview menuview) {
        this.menuview = menuview;
    }

    public void actionPerformed(ActionEvent e) {
        String choose = e.getActionCommand();
        if(choose.equals("usage"))
            this.menuview.setJLable("usage");
        else if(choose.equals("aim"))
            this.menuview.setJLable("aim");
        else if(choose.equals("Quit"))
            this.menuview.setJLable("quit");
    }

}