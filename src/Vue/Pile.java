package Vue;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author 1637157
 */
public class Pile extends ImageIcon {
    
    String valeur;

    protected static Image imagePile;
     
    public Pile(String pile) {
        this(pile, false);
	}
   public Pile(String valeur, boolean couleur) {
		this.valeur = valeur;
		String nomFichier;
		nomFichier = "composantes/batterieps" + valeur + ".png";
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
		Pile other = (Pile) obj;
		if (valeur == null) {
			if (other.valeur != null)
				return false;
		} else if (!valeur.equals(other.valeur)) {
			return false;			
		}
		return true;
	}
   
  }