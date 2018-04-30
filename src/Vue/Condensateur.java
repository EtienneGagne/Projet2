package Vue;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author 1637157
 */
public class Condensateur extends ImageIcon {

    /**
     *
     */
    protected static Image imageCondensateur2 = Toolkit.getDefaultToolkit().getImage("composantes/condensateurps2.png");

    /**
     *
     */
    protected static Image imageCondensateur3 = Toolkit.getDefaultToolkit().getImage("composantes/condensateurps3.png");

    /**
     *
     */
    protected static Image imageCondensateur4 = Toolkit.getDefaultToolkit().getImage("composantes/condensateurps4.png");

    /**
     *
     */
    protected static Image imageCondensateur6 = Toolkit.getDefaultToolkit().getImage("composantes/condensateurps6.png");

    /**
     *
     */
    protected static Image imageCondensateur10 = Toolkit.getDefaultToolkit().getImage("composantes/condensateurps10.png");

    /**
     *
     */
    public Condensateur() {
        super(imageCondensateur2);
    }

    /**
     *
     * @param a
     */
    public Condensateur(int a) {
        super(imageCondensateur3);
    }

    /**
     *
     * @param a
     * @param b
     */
    public Condensateur(int a, int b) {
        super(imageCondensateur4);
    }

    /**
     *
     * @param a
     * @param b
     * @param c
     */
    public Condensateur(int a, int b, int c) {
        super(imageCondensateur6);
    }

    /**
     *
     * @param a
     * @param b
     * @param c
     * @param d
     */
    public Condensateur(int a, int b, int c, int d) {
        super(imageCondensateur10);
    }

}
