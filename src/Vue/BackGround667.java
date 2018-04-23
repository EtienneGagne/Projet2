package Vue;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.TransferHandler;


public class BackGround667 extends Background  {
     
JButton btnUn=new JButton();
    JButton btnDeux=new JButton();
    JButton btnTrois=new JButton();
    JButton btnQuatre=new JButton();
    JButton btnCinq=new JButton();
    JButton btnSix=new JButton();
   String nL1 = System.getProperty("line.separator"); // pour 1 interligne
    
    Image image667 = Toolkit.getDefaultToolkit().getImage("ImagesNiveaux/6.67.png");
    JButton button[] = new JButton[6];   
    
    public BackGround667() {
        super();
        init();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image667, 0, 0,this);

    }

    
    public void init() {
        button[0]=btnUn;
        button[1]=btnDeux;
        button[2]=btnTrois;
        button[3]=btnQuatre;
        button[4]=btnCinq;
        button[5]=btnSix;
      
        
    add(button[0]);
    add(button[1]);
    add(button[2]);
    add(button[3]);
    add(button[4]);
    add(button[5]);
 
                      //x    y   L  H
    button[0].setBounds(245,65,100,75);
    button[0].setTransferHandler(new TransferHandler("icon"));
    button[1].setBounds(85,250,100,75);
    button[1].setTransferHandler(new TransferHandler("icon"));
    button[2].setBounds(300,250,100,75);
    button[2].setTransferHandler(new TransferHandler("icon"));
    
    button[3].setBounds(220,385,100,75);
    button[3].setTransferHandler(new TransferHandler("icon"));
    
    button[4].setBounds(150,545,100,75);
    button[4].setTransferHandler(new TransferHandler("icon"));
    button[5].setBounds(380,545,100,75);
    button[5].setTransferHandler(new TransferHandler("icon"));
  
  
}
    @Override
    public String toString() {
        return "Soit la puissance de R2,P2=2,40 W, et I=18.5 mA"
                + "A)Déterminez la résistance R2."
                + "B)Déterminez C1, sachant que P1=222 µC."
                + "C)Trouvez la f.é.m.";
    }
    
    
}
