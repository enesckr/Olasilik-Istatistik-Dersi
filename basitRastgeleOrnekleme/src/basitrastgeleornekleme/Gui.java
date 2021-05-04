package basitrastgeleornekleme;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Gui {
    
    JFrame jf=null;
    JPanel jp=null;
    JButton button;
    JLabel xMin;
    JLabel xMax;
    JLabel sayiAdedi;
    JTextField minText;
    
    public Gui(){
        getJf().add(getJp());       
    }

    public JFrame getJf() {
        if(jf==null){
            jf=new JFrame("Basit Rastgele Örnekleme");
            jf.setSize(500, 300);
            jf.setResizable(false);
            jf.setLocationRelativeTo(null);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jf.setVisible(true);
        }
        return jf;
    }

    public void setJf(JFrame jf) {
        this.jf = jf;
    }

    public JPanel getJp() {
        if(jp==null){
            jp=new JPanel();
            jp.setLayout(null);
            button=new JButton("Üret");    
            xMin=new JLabel("X-min         :");
            xMax=new JLabel("X-max        :");
            sayiAdedi=new JLabel("Sayı Adedi :"); 
            button.setBounds(350, 30, 120, 85); 
            xMin.setBounds(30, 30, 140, 20);
            xMax.setBounds(30, 60, 140, 20);
            sayiAdedi.setBounds(30, 85, 140, 30);
            xMin.setFont(xMin.getFont().deriveFont(20f));
            xMax.setFont(xMax.getFont().deriveFont(20f));
            sayiAdedi.setFont(sayiAdedi.getFont().deriveFont(20f));
            jp.add(xMin);
            jp.add(xMax);
            jp.add(sayiAdedi);
            jp.add(button);
            jp.setBackground(Color.LIGHT_GRAY);
            jp.setVisible(true);
            
        }
        return jp;
    }

    public void setJp(JPanel jp) {
        this.jp = jp;
    }
    
    
}
