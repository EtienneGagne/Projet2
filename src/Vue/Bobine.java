
package Vue;


import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Bobine extends ImageIcon {
static Image imageBobine = Toolkit.getDefaultToolkit().getImage("composantes/bobineps.png");
    public Bobine() {
        super(imageBobine);
    }
    
}
