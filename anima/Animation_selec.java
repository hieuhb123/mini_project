package anima;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Animation_selec extends JPanel implements ActionListener{
    private Timer timer;
    private int n;
    private String a[];
    private Boolean visible_selection = true;
    private Boolean visible_swapping = false;
    private Boolean visible_shift = false;
    private int counter_shift = 0;
    private int i = -1;
    private int mini = counter_shift;
    private int x = -2;
    private int y = 0;
    private int dx = 2;
    private int dy = 2;
    public Animation_selec(int n, String src[]) {
        a = new String[n];
        this.n = n;
        for(int i = 0; i < n ; i++)
            this.a[i] = src[i];
        this.timer = new Timer(50, this);
        this.timer.start();
    }
    public void settimeanima(int n){
        this.timer.setDelay(n);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(int ii = 0; ii < n ; ii++){
            g.setColor(Color.RED);
            g.fillRect(150 + ii*60, 5, 50, 50);

            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 15));
            g.drawString(this.a[ii], 167 + ii*60, 37);
        }

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.drawString("LOGIC:", 5, 40);
    
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 15));
        g.drawString("SELECTION", 5, 100);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 15));
        g.drawString("SWAPPING", 5, 150);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 15));
        g.drawString("COUNTER SHIFT", 5, 200);
        
        if(this.visible_selection){
            g.setColor(Color.RED);
            g.fillRect(150 + counter_shift*60 + x, 70, 50, 50);

            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 15));
            g.drawString(this.a[this.mini], 167 + x + counter_shift*60, 102);
            if(this.i == n-1) {
                visible_selection = false; 
                visible_swapping = true;
            }
        }
        else if(this.visible_swapping){

        }
    }

    public void actionPerformed(ActionEvent e) {
        x += dx;
        if(this.visible_selection && x == (this.i+1)*60){
            this.i++;
            if(Integer.parseInt(this.a[mini]) > Integer.parseInt(this.a[i])){
                this.mini = i; 
            }
        }
        else if(this.visible_swapping){
            
        }
        repaint();
    }
}