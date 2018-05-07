package Vue;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * AEC
 */
public class Ampoule extends ImageIcon {
    //cherche fichier photo 

    static Image imageAmpoule = Toolkit.getDefaultToolkit().getImage("composantes/ampouleps.png");

    /**
     * constructeur Ampoule
     */
    public Ampoule() {
        super(imageAmpoule);
    }

}
