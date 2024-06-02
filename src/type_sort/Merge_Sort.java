package type_sort;
import view.Menuview;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.Random;

import anima.Animation_merge;
public class Merge_Sort {
    public Animation_merge animation_merge;
    private String a[];
    public Merge_Sort(Menuview menuview){
        menuview.setJLable("Merge");
    }
    public Merge_Sort(Menuview menuview, String src){
        int n = Integer.parseInt(src);
        Random rand = new Random();
        a = new String[n];
        for(int i = 0; i < n ; i++){
            int randInt = rand.nextInt(100);
            String in = Integer.toString(randInt);
            a[i] = in;
        }
        this.animation_merge = new Animation_merge(n, a);
        this.animation_merge.setBackground(Color.MAGENTA);

        BorderLayout layout = (BorderLayout) menuview.getLayout();
        Component comp = layout.getLayoutComponent(BorderLayout.CENTER);
        if (comp != null){
            menuview.getContentPane().remove(comp);
            menuview.revalidate();
            menuview.repaint();
        }
        menuview.add(this.animation_merge, BorderLayout.CENTER);
        menuview.revalidate();
        menuview.repaint();
        System.err.println("Merge");
    }
}
