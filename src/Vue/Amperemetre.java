package Vue;

import java.awt.Image;

import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author AEC
 */
public class Amperemetre extends ImageIcon {

    //valeur de la composante
    String valeur;

    /**
     * Constructeur Amperemetre
     *
     * @param valeur
     */
    public Amperemetre(String valeur) {
        //la valeur est la valeur de l'amperemetre
        this.valeur = valeur;
        String nomFichier;
        //cherche le fichier photo
        nomFichier = "composantes/amperemetreps" + valeur + ".png";
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
        Amperemetre other = (Amperemetre) obj;
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
