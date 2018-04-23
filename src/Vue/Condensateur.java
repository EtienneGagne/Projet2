package Vue;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Condensateur extends ImageIcon {

    protected static Image imageCondensateur2 = Toolkit.getDefaultToolkit().getImage("composantes/condensateurps2.png");
    protected static Image imageCondensateur3 = Toolkit.getDefaultToolkit().getImage("composantes/condensateurps3.png");
    protected static Image imageCondensateur4 = Toolkit.getDefaultToolkit().getImage("composantes/condensateurps4.png");
    protected static Image imageCondensateur6 = Toolkit.getDefaultToolkit().getImage("composantes/condensateurps6.png");
    protected static Image imageCondensateur10 = Toolkit.getDefaultToolkit().getImage("composantes/condensateurps10.png");

    public Condensateur() {
        super(imageCondensateur2);
    }

    public Condensateur(int a) {
        super(imageCondensateur3);
    }

    public Condensateur(int a, int b) {
        super(imageCondensateur4);
    }

    public Condensateur(int a, int b, int c) {
        super(imageCondensateur6);
    }

    public Condensateur(int a, int b, int c, int d) {
        super(imageCondensateur10);
    }

}
