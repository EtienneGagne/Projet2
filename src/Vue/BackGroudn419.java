package Vue;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JComponent;

public class BackGroudn419 extends JComponent {

    Image image419 = Toolkit.getDefaultToolkit().getImage("ImagesNiveaux/4.19.png");

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image419, 0, 0, this);

    }

    public BackGroudn419(int hauteur, int largeur) {
        setSize(hauteur, largeur);
    }

}
