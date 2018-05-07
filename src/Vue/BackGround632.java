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
public class BackGround632 extends Background {
    //création des éléments qui vont dans les backgrounds

    private Resistance resistance8 = new Resistance("8");
    private Resistance resistance5 = new Resistance("5");
    private Resistance resistance11 = new Resistance("11");
    private Pile pile12 = new Pile("12");
    private Resistance resistance7 = new Resistance("7");

    private Resistance ResistanceCouleur11 = new Resistance("11", true);

    private Resistance reponseA = new Resistance("11");
    private Pile reponseB = new Pile("18");
    private Pile reponseC = new Pile("36");
    //création des JComponents qui contiennent les composants à changer
    JButton btnUn = new JButton(resistance8);
    JButton btnDeux = new JButton(new Pile("X"));
    JButton btnTrois = new JButton(resistance5);
    JButton btnQuatre = new JButton(ResistanceCouleur11);
    JButton btnCinq = new JButton(pile12);
    JButton btnSix = new JButton(resistance7);
    JButton btnSept = new JButton(resistance5);
    JButton btnHuit = new JButton(new Pile("X"));

    //cherche image dans fichier
    Image image632 = Toolkit.getDefaultToolkit().getImage("ImagesNiveaux/6.32.png");

    /**
     * constructeur de BackGround
     */
    public BackGround632() {
        super();
        //méthode de la classe mere
        init();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image632, 0, 0, this);

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
        add(btnSix);
        add(btnSept);
        add(btnHuit);

        btnUn.setBounds(120, 50, 100, 75);
        btnDeux.setBounds(260, 50, 100, 75);
        btnDeux.setTransferHandler(new TransferHandler("icon"));
        btnTrois.setBounds(400, 50, 100, 75);
        btnQuatre.setBounds(120, 230, 100, 75);
        btnQuatre.setTransferHandler(new TransferHandler("icon"));
        btnCinq.setBounds(260, 230, 100, 75);
        btnSix.setBounds(400, 230, 100, 75);
        btnSept.setBounds(160, 600, 100, 75);
        btnHuit.setBounds(360, 600, 100, 75);
        btnHuit.setTransferHandler(new TransferHandler("icon"));
    }
    //énoncé du problème

    @Override
    public String toString() {
        return "L'intensité de la branche du haut I1=2,88A, l'intensité I2=-0,416A et I3=3,30 A." + "\n"
                + "A)Trouvez la valeur de la résistance inconnu à l'aide des bandes de couleurs." + "\n"
                + "B) trouvez les deux valeurs de piles manquantes.";
    }
    //vérification de la réponse

    @Override
    boolean verifier() {
        return btnQuatre.getIcon().equals(reponseA) && btnDeux.getIcon().equals(reponseB) && btnHuit.getIcon().equals(reponseC);
    }
}
