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

    protected static Image imageCondensateur;
     
    public Condensateur(String condensateur) {
        this(condensateur, false);
	}
   public Condensateur(String valeur, boolean couleur) {
		this.valeur = valeur;
		String nomFichier;
		nomFichier = "composantes/condensateurps" + valeur + ".png";
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
		Condensateur other = (Condensateur) obj;
		if (valeur == null) {
			if (other.valeur != null)
				return false;
		} else if (!valeur.equals(other.valeur)) {
			return false;			
		}
		return true;
	}}