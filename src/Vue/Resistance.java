package Vue;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author 1637157
 */
public class Resistance extends ImageIcon {
	
	String valeur;
	boolean couleur;



    /**
     *
     */
    public Resistance(String resistance) {
        this(resistance, false);
	}

	/**
	*
	*/
	public Resistance(String valeur, boolean couleur) {
		this.valeur = valeur;
		this.couleur = couleur;
		String nomFichier;
		if (couleur) {
			nomFichier = "ResistancesCouleurs/Resistance" + valeur + ".png";
		} else {
			nomFichier = "composantes/resistanceps" + valeur + ".png";
		}
		setImage(Toolkit.getDefaultToolkit().getImage(nomFichier));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resistance other = (Resistance) obj;
		if (valeur == null) {
			if (other.valeur != null)
				return false;
		} else if (!valeur.equals(other.valeur) || couleur != other.couleur) {
			return false;			
		}
		return true;
	}
}
