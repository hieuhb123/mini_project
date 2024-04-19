import javax.swing.UIManager;
public class aims{
    public static void main(String[] args){
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new Menuview();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
