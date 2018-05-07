
package Vue;


import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author AEC
 */
public class InterrupteurO extends ImageIcon {
    //cherche fichier photo 
static Image imageInterrupteurO = Toolkit.getDefaultToolkit().getImage("composantes/interrupteur-ouvertps.png");

    /**
     *constructeur Interrupteur ouvert
     */
    public InterrupteurO() {
        super(imageInterrupteurO);
        
    }
    
}
