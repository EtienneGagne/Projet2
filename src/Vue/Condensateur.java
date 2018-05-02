package Vue;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author 1637157
 */
public class Condensateur extends ImageIcon {
	
	String valeur;

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
	public Condensateur(String valeur) {
		this.valeur = valeur;
		String nomFichier = "composantes/condensateurps" + valeur + ".png";
		setImage(Toolkit.getDefaultToolkit().getImage(nomFichier));
	}
	
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Condensateur other = (Condensateur) obj;
		if (valeur == null) {
			if (other.valeur != null)
				return false;
		} else if (!valeur.equals(other.valeur))
			return false;
		return true;
	}

    
}
