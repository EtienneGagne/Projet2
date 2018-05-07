package Vue;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.TransferHandler;

/**
 *
 * @author AEC
 */
public class BackGround651 extends Background {

    //création des éléments qui vont dans les backgrounds
    private Voltmetre voltmetre6 = new Voltmetre("6");
    private Amperemetre amperemetre3m = new Amperemetre("3");
    private Resistance resistance3k = new Resistance("3K");

    private Resistance reponseA = new Resistance("2K");
    private Pile reponseB = new Pile("15");

    //création des JComponents qui contiennent les composants à changer
    JButton btnUn = new JButton(voltmetre6);
    JButton btnDeux = new JButton(new Resistance("X"));
    JButton btnTrois = new JButton(amperemetre3m);
    JButton btnQuatre = new JButton(new Pile("X"));
    JButton btnCinq = new JButton(resistance3k);

    //cherche image dans fichier
    Image image651 = Toolkit.getDefaultToolkit().getImage("ImagesNiveaux/6.51.png");

    /**
     * constructeur de BackGround
     */
    public BackGround651() {
        super();
        //méthode de la classe mere
        init();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image651, 0, 0, this);

    }

    /**
     * positionnement des boutons dans le backgrounds
     */
    public void init() {

        add(btnUn);
        add(btnDeux);
        add(btnTrois);
        add(btnQuatre);
        add(btnCinq);

        btnUn.setBounds(120, 120, 100, 75);
        btnDeux.setBounds(120, 310, 100, 75);
        btnDeux.setTransferHandler(new TransferHandler("icon"));
        btnTrois.setBounds(360, 310, 100, 75);
        btnQuatre.setBounds(160, 600, 100, 75);
        btnQuatre.setTransferHandler(new TransferHandler("icon"));
        btnCinq.setBounds(360, 600, 100, 75);

    }
    //énoncé du problème

    @Override
    public String toString() {
        return "Le voltmètre idéal indique 6,00 V et l'ampèremètre idéal, 3,00 mA." + "\n"
                + "A)Trouvez la valeur de la résistance manquante." + "\n"
                + "B)Trouvez la f.é.m. de la pile.";
    }
    //vérification de la réponse

    @Override
    boolean verifier() {
        return btnDeux.getIcon().equals(reponseA) && btnQuatre.getIcon().equals(reponseB);
    }

}
