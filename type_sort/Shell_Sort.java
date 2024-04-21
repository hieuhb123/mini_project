package type_sort;
import view.Menuview;
import anima.Animation_shell;
public class Shell_Sort {
    public Shell_Sort(Menuview menuview){
        menuview.setJLable("Shell");
    }
    public Shell_Sort(Menuview menuview, String src){
        int n = Integer.parseInt(src);
        menuview.setJPanel2_shell(new Animation_shell(n));
        System.err.println("Shell");
    }
}
