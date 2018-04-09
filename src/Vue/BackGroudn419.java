package Vue;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.TransferHandler;

public class BackGroudn419 extends JPanel{

    Image image419 = Toolkit.getDefaultToolkit().getImage("ImagesNiveaux/4.19.png");
    BackGroudn419 button[] = new BackGroudn419[3];   

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image419, 0, 0,this);

    }

    public BackGroudn419(int hauteur, int largeur) {
        setSize(largeur, hauteur);
    }
    
    public void init() {
    add(button[0]);
    add(button[1]);
    add(button[2]);
    button[0].setBounds(280,125,100,75);
    button[0].setTransferHandler(new TransferHandler("icon"));
    button[1].setBounds(280,125,100,75);
    button[1].setTransferHandler(new TransferHandler("icon"));
    button[2].setBounds(280,125,100,75);
    button[3].setTransferHandler(new TransferHandler("icon"));
}

}
