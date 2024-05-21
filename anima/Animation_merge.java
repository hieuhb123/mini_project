package anima;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation_merge extends JPanel implements ActionListener{
    private Timer timer;
    private int n;
    private String a[];
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
        split(g, a, 0, n-1, 0, 3, 0, 0);
    }

    public void actionPerformed(ActionEvent e) {
        repaint();
    }


    private void merge(String arr[], int l, int m, int r)
    {
        String tempL[] = new String[m-l+1], tempR[] = new String[r-m];
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
            if(Integer.parseInt(tempL[i]) > Integer.parseInt(tempR[j])){
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
    private void split(Graphics g, String arr[], int l, int r, int s, int e, int stepL, int stepR)
    {
        if(l - r == 0) return;
        int m = (l+r)/2;
        int kco = 60;
        int kc = 10;
        int kcstepL = 20;
        int kcstepR = 40;  
        for(int ii = l; ii <= m ; ii++){
            g.setColor(Color.WHITE);
            g.fillRect(getWidth()/2 - n*30 + ii*kco + stepL*kcstepL + stepR*kcstepR, 35 + s*80, 45, 45);

            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 15));
            g.drawString(arr[ii], getWidth()/2 - n*30 + 17 + ii*kco + stepL*kcstepL + stepR*kcstepR, 67 + s*80);
        }

        g.setColor(Color.GRAY);
        g.fillRect(getWidth()/2 - n*30 + (m+1)*kco  + stepL*kcstepL + stepR*kcstepR - 5 , s*80 + 27, 5, 60);

        for(int ii = m + 1; ii <= r ; ii++){
            g.setColor(Color.WHITE);
            g.fillRect(getWidth()/2 - n*30 + ii*kco + kc + stepL*kcstepL + stepR*kcstepR, 35 + s*80, 45, 45);

            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 15));
            g.drawString(arr[ii], getWidth()/2 - n*30 + 17 + ii*kco + kc + stepL*kcstepL + stepR*kcstepR, 67 + s*80);
        }
        stepL = stepL - 1;
        split(g, arr, l, m, s+1, e, stepL, stepR);
        stepR = stepR + 1;
        split(g, arr, m+1, r, s+1, e, stepL,stepR);
    }
}