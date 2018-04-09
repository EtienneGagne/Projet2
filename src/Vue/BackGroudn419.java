package Vue;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.TransferHandler;

public class BackGroudn419 extends JPanel{
    JButton btnUn=new JButton();
    JButton btnDeux=new JButton();
    JButton btnTrois=new JButton();
    JButton btnQuatre=new JButton();
    JButton btnCinq=new JButton();
    
    Image image419 = Toolkit.getDefaultToolkit().getImage("ImagesNiveaux/4.19.png");
    JButton button[] = new JButton[5];   
    

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image419, 0, 0,this);

    }

    public BackGroudn419(int hauteur, int largeur) {
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
    button[0].setBounds(200,130,100,75);
    button[0].setTransferHandler(new TransferHandler("icon"));
    button[1].setBounds(370,130,100,75);
    button[1].setTransferHandler(new TransferHandler("icon"));
    button[2].setBounds(200,340,100,75);
    button[2].setTransferHandler(new TransferHandler("icon"));
    button[3].setBounds(370,340,100,75);
    button[3].setTransferHandler(new TransferHandler("icon"));
    button[4].setBounds(280,610,100,75);
    button[4].setTransferHandler(new TransferHandler("icon"));
}

}
