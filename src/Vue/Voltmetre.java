package Vue;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * AEC
 */
public class Voltmetre extends ImageIcon {
    //valeur de la composante

    String valeur;

    /**
     * constructeur Voltmetre
     *
     * @param valeur
     */
    public Voltmetre(String valeur) {
        //la valeur est la valeur du voltmetre
        this.valeur = valeur;

        String nomFichier;
        //cherche le fichier photo
        nomFichier = "composantes/voltmetreps" + valeur + ".png";
        //prend la photo du fichier
        setImage(Toolkit.getDefaultToolkit().getImage(nomFichier));

    }
    //redéfinition de la méthode equals (déjà existante)	

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Voltmetre other = (Voltmetre) obj;
        if (valeur == null) {
            if (other.valeur != null) {
                return false;
            }
        } else if (!valeur.equals(other.valeur)) {
            return false;
        }
        return true;
    }
}
