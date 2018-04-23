package Vue;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Pile extends ImageIcon {

    protected static Image imagePile45 = Toolkit.getDefaultToolkit().getImage("composantes/batterieps4.5.png");
    protected static Image imagePile4 = Toolkit.getDefaultToolkit().getImage("composantes/batterieps4.png");
    protected static Image imagePile6 = Toolkit.getDefaultToolkit().getImage("composantes/batterieps6.png");
    protected static Image imagePile8 = Toolkit.getDefaultToolkit().getImage("composantes/batterieps8.png");
    protected static Image imagePile12 = Toolkit.getDefaultToolkit().getImage("composantes/batterieps12.png");
    protected static Image imagePile18 = Toolkit.getDefaultToolkit().getImage("composantes/batterieps18.png");
    protected static Image imagePile36 = Toolkit.getDefaultToolkit().getImage("composantes/batterieps36.png");
    protected static Image imagePile90 = Toolkit.getDefaultToolkit().getImage("composantes/batterieps90.png");
    protected static Image imagePile120 = Toolkit.getDefaultToolkit().getImage("composantes/batterieps120.png");

    public Pile() {
        super(imagePile45);
    }

    public Pile(int a) {
        super(imagePile4);
    }

    public Pile(int a, int b) {
        super(imagePile6);
    }

    public Pile(int a, int b, int c) {
        super(imagePile8);
    }

    public Pile(int a, int b, int c, int d) {
        super(imagePile12);
    }

    public Pile(int a, int b, int c, int d, int e) {
        super(imagePile18);
    }

    public Pile(int a, int b, int c, int d, int e, int f) {
        super(imagePile36);
    }

    public Pile(int a, int b, int c, int d, int e, int f, int g) {
        super(imagePile90);
    }

    public Pile(int a, int b, int c, int d, int e, int f, int g, int h) {
        super(imagePile120);
    }

}
