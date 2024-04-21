package type_sort;
import view.Menuview;
import anima.Animation_selec;
public class Selection_Sort {
    public Selection_Sort(Menuview menuview){
        menuview.setJLable("Selection Sort: n = ");
    }
    public Selection_Sort(Menuview menuview, String src){
        int n = Integer.parseInt(src);
        menuview.setJPanel2_selec(new Animation_selec(n));
        System.err.println("Selec");
    }
}
