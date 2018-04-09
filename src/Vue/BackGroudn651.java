package Vue;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.TransferHandler;


public class BackGroudn651 extends JPanel  {
     JButton btnUn=new JButton();
    JButton btnDeux=new JButton();
    JButton btnTrois=new JButton();
    JButton btnQuatre=new JButton();
    JButton btnCinq=new JButton();
 
    
    Image image651 = Toolkit.getDefaultToolkit().getImage("ImagesNiveaux/6.51.png");
    JButton button[] = new JButton[5];   
    

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image651, 0, 0,this);

    }

    public BackGroudn651(int hauteur, int largeur) {
        setLayout(null);
        setSize(largeur, hauteur);
        init();
        
    }
    
    public void init() {
        button[0]=btnUn;
        button[1]=btnDeux;
        button[2]=btnTrois;
        button[3]=btnQuatre;
        button[4]=btnCinq;
    
        
        
    add(button[0]);
    add(button[1]);
    add(button[2]);
    add(button[3]);
    add(button[4]);
  
    
                      //x    y   L  H
    button[0].setBounds(120,120,100,75);
    button[0].setTransferHandler(new TransferHandler("icon"));
    button[1].setBounds(120,310,100,75);
    button[1].setTransferHandler(new TransferHandler("icon"));
    button[2].setBounds(360,310,100,75);
    button[2].setTransferHandler(new TransferHandler("icon"));
    
    button[3].setBounds(160,600,100,75);
    button[3].setTransferHandler(new TransferHandler("icon"));
    button[4].setBounds(360,600,100,75);
    button[4].setTransferHandler(new TransferHandler("icon"));
 
  
 
}
    
}
