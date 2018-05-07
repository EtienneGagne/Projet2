package Vue;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * AEC
 */
public class Bobine extends ImageIcon {
//cherche fichier photo 

    static Image imageBobine = Toolkit.getDefaultToolkit().getImage("composantes/bobineps.png");

    /**
     * constructeur Bobine
     */
    public Bobine() {
        super(imageBobine);
    }

}
