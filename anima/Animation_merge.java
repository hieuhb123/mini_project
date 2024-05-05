package anima;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation_merge extends JPanel implements ActionListener{
    private Timer timer;
    private int n;
    private String a[];
    private int x = 0;
    private int y = 0;
    private int dx = 2;
    private int dy = 2;
    public Animation_merge(int n, String src[]) {
        a = new String[n];
        this.n = n;
        for(int i = 0; i < n ; i++)
            this.a[i] = src[i];
        this.timer = new Timer(30, this);
        this.timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw your animation frames here
        g.setColor(Color.RED);
        g.fillRect(x, y, 50, 50); // Example: Draw a red rectangle
    }

    public void actionPerformed(ActionEvent e) {
        x += dx;
        if (x > getWidth() - 50 || x < 0) {
            dx *= -1;
        }
        y += dy;
        if (y > getHeight() - 50 || y < 0) {
            dy *= -1;
        }
        repaint();
    }


    private void merge(int arr[], int l, int m, int r)
    {
        int tempL[] = new int[m-l+1], tempR[] = new int[r-m];
        for(int i = 0; i < m-l+1; i++){
                tempL[i] = arr[l + i];
        }
        for(int i = 0; i < r-m; i++){
            tempR[i] = arr[m + 1 + i];
        }
        int i = 0,j = 0, d = l;
        boolean check = false;
        while (true)
        {
            if(i == m-l+1) break;
            else if(j == r-m){
                check = true;
                break;
            }
            if(tempL[i] > tempR[j]){
                arr[d] = tempR[j];
                j++;
                d++;
            }
            else{
                arr[d] = tempL[i];
                i++;
                d++;
            }
        }
        if(check){
            while(i <= m-l){
                arr[d] = tempL[i];
                d++;
                i++;
            }
        }
        else{
            while(j < r - m){
                arr[d] = tempR[j];
                d++;
                j++;
            }
        }
    }
    private void mergeSort(int arr[], int l, int r)
    {
        int n = l - r + 1;
        int m = (l+r)/2;
        if(n == 1) return;
        mergeSort(arr, l, m);
        mergeSort(arr, m+1, r);
        merge(arr, l, m, r);
    }
}