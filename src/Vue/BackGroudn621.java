package Vue;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.TransferHandler;


public class BackGroudn621 extends JPanel  { 
    JButton btnUn=new JButton();
    JButton btnDeux=new JButton();
    JButton btnTrois=new JButton();
    JButton btnQuatre=new JButton();
    JButton btnCinq=new JButton();
    JButton btnSix=new JButton();
    JButton btnSept=new JButton();
    
    
    Image image621 = Toolkit.getDefaultToolkit().getImage("ImagesNiveaux/6.21.png");
    JButton button[] = new JButton[7];   
    

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image621, 0, 0,this);

    }

    public BackGroudn621(int hauteur, int largeur) {
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
        button[5]=btnSix;
        button[6]=btnSept;
        
    add(button[0]);
    add(button[1]);
    add(button[2]);
    add(button[3]);
    add(button[4]);
    add(button[5]);
    add(button[6]);
                      //x    y   L  H
    button[0].setBounds(260,50,100,75);
    button[0].setTransferHandler(new TransferHandler("icon"));
    button[1].setBounds(120,230,100,75);
    button[1].setTransferHandler(new TransferHandler("icon"));
    button[2].setBounds(260,230,100,75);
    button[2].setTransferHandler(new TransferHandler("icon"));
    button[3].setBounds(400,230,100,75);
    button[3].setTransferHandler(new TransferHandler("icon"));
    button[4].setBounds(120,600,100,75);
    button[4].setTransferHandler(new TransferHandler("icon"));
    button[5].setBounds(260,600,100,75);
    button[5].setTransferHandler(new TransferHandler("icon"));
    button[6].setBounds(400,600,100,75);
    button[6].setTransferHandler(new TransferHandler("icon"));
}
    
}
