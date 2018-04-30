package Vue;

import java.awt.Image;

import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author 1637157
 */
public class Amperemetre extends ImageIcon {

    /**
     *
     */
    protected static Image imageAmperemetre04 = Toolkit.getDefaultToolkit().getImage("composantes/amperemetreps0.4.png");

    /**
     *
     */
    protected static Image imageAmperemetre3m = Toolkit.getDefaultToolkit().getImage("composantes/amperemetreps3m.png");

    /**
     *
     */
    public Amperemetre() {
        super(imageAmperemetre04);
    }

    /**
     *
     * @param a
     */
    public Amperemetre(int a) {
        super(imageAmperemetre3m);
    }

}
