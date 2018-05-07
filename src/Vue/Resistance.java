package Vue;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 * AEC
 */
public class Resistance extends ImageIcon {
    //valeur de la composante

    String valeur;
    //savoir s'il s'agit d'une résistance couleur ou normale 
    boolean couleur;

    /**
     * Constructeur Resistance normale
     *
     * @param resistance
     */
    public Resistance(String resistance) {
        this(resistance, false);
    }

    /**
     * constructeur Resistance couleur et normale
     *
     * @param valeur
     * @param couleur
     */
    public Resistance(String valeur, boolean couleur) {
        //la valeur est la valeur de la résitance
        this.valeur = valeur;
        //savoir si la résitance est couleur ou normale
        this.couleur = couleur;
        String nomFichier;
        //s'il s'agit d'une résitance couleur
        if (couleur) {
            //cherche le nom du fichier image
            nomFichier = "ResistancesCouleurs/Resistance" + valeur + ".png";
        } //s'il s'agit d'une résitance normale
        else {
            //cherche le nom du fichier image
            nomFichier = "composantes/resistanceps" + valeur + ".png";
        }
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
        Resistance other = (Resistance) obj;
        if (valeur == null) {
            if (other.valeur != null) {
                return false;
            }
        } else if (!valeur.equals(other.valeur) || couleur != other.couleur) {
            return false;
        }
        return true;
    }
}
