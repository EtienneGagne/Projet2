
package Vue;


import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author 1637157
 */
public class Ampoule extends ImageIcon{
    static Image imageAmpoule = Toolkit.getDefaultToolkit().getImage("composantes/ampouleps.png");

    /**
     *
     */
    public Ampoule() {
        super(imageAmpoule);
    }
    
}
