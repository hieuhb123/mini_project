package anima;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation_shell extends JPanel implements ActionListener{
    private Timer timer;
    private int n;
    private String a[];
    private int gap;
    private int i;
    private int j;
    private String temp;

    private Boolean xuong = true;
    private Boolean len = false;
    private Boolean swapBoolean = false;
    private Boolean g__ = false;
    public Animation_shell(int n, String src[]) {
        a = new String[n];
        for(int ii = 0; ii < n ; ii++)
            this.a[ii] = src[ii];
        this.n = n;
        this.gap = n/2;
        this.i = gap;
        this.temp = a[this.i];
        this.j = i;
        this.timer = new Timer(100, this);
        this.timer.start();
    }

    public void settimeanima(int n){
        this.timer.setDelay(n);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(int ii = 0; ii < n ; ii++){
            if(ii == this.i) continue;
            g.setColor(Color.WHITE);
            g.fillRect(getWidth()/2 - n*30 + ii*60, 35, 50, 50);

            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 15));
            g.drawString(this.a[ii], getWidth()/2 - n*30 + 17 + ii*60, 67);
        }
        //2 o duoi
        g.setColor(Color.GRAY);
        g.fillRect(10, getHeight() - 60, 25, 25);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 12));
        g.drawString("comparison", 40, getHeight() - 60 + 17);
        g.setColor(Color.YELLOW);
        g.fillRect(10, getHeight() - 30, 25, 25);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 12));
        g.drawString("item to insert", 40, getHeight() - 30 + 17);
        //2 o duoi

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("gap = " + this.gap, 10, getHeight() - 80);

        if(this.xuong){
            g.setColor(Color.WHITE);
            g.fillRect(getWidth()/2 - n*30 + this.i*60, 205, 50, 50);

            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 15));
            g.drawString(this.a[this.i], getWidth()/2 - n*30 + 17 + this.i*60, 237);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if(this.j >= gap && Integer.parseInt(this.temp) < Integer.parseInt(this.a[j-gap])){
            this.a[j] = a[j-gap];
            this.j -= gap;
        }
        else if(this.j < gap || Integer.parseInt(this.temp) >= Integer.parseInt(this.a[j-gap])){
            this.a[j] = temp;
            this.i++;
            if(this.i == n){
                this.gap/=2;
                this.i = gap;
                this.temp = a[i];
                this.j = i;
            }else {
                this.temp = a[i];
                this.j = i;
            }
        }
        else this.j -= gap;

        if(this.gap == 0) this.timer.stop();
        repaint();
    }
}