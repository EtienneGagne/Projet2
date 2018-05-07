package Vue;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 *AEC
 */
public class Condensateur extends ImageIcon {
 //valeur de la composante	
String valeur;
 
    /**
     * Constructeur condensateur
     * @param valeur 
     */
   public Condensateur(String valeur) {
                //la valeur est la valeur du condensateur
		this.valeur = valeur;
		String nomFichier;
                //cherhce le fichier
		nomFichier = "composantes/condensateurps" + valeur + ".png";
                //prend la photo du fichier
		setImage(Toolkit.getDefaultToolkit().getImage(nomFichier));
		
		}
	 //redéfinition de la méthode equals (déjà existante)	
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