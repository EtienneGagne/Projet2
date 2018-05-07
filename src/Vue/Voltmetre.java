
package Vue;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author 1637157
 */
public class Voltmetre extends ImageIcon {
 String valeur;

    protected static Image imageVoltmetre;
     
    public Voltmetre(String voltmetre) {
        this(voltmetre, false);
	}
   public Voltmetre(String valeur, boolean couleur) {
		this.valeur = valeur;
		String nomFichier;
		nomFichier = "composantes/voltmetreps" + valeur + ".png";
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
		Voltmetre other = (Voltmetre) obj;
		if (valeur == null) {
			if (other.valeur != null)
				return false;
		} else if (!valeur.equals(other.valeur)) {
			return false;			
		}
		return true;
	}}
        
    
    

