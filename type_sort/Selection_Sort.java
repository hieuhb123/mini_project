package type_sort;
import view.Menuview;
public class Selection_Sort {
    public Selection_Sort(Menuview menuview){
        menuview.setJLable("Selection Sort: n = ");
    }
    public Selection_Sort(Menuview menuview, String src){
        menuview.setTEST("SELEC" + src);
        int n = Integer.parseInt(src);
        
    }
}
