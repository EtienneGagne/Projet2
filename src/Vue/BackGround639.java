package Vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.TransferHandler;

/**
 *
 * @author AEC
 */
public class BackGround639 extends Background {

    //création des éléments qui vont dans les backgrounds
    private Pile pile10 = new Pile("10");
    private Resistance ResistanceCouleur50K = new Resistance("50K", true);
    private InterrupteurO interrupteurO = new InterrupteurO();
    private Resistance ResistanceCouleur100K = new Resistance("100K", true);

    private Resistance reponseA = new Resistance("50K");
    private Resistance reponseB = new Resistance("100K");
    private Condensateur reponseC = new Condensateur("10");
    //création des JComponents qui contiennent les composants à changer
    JButton btnUn = new JButton(pile10);
    JButton btnDeux = new JButton(ResistanceCouleur50K);
    JButton btnTrois = new JButton(interrupteurO);
    JButton btnQuatre = new JButton(ResistanceCouleur100K);
    JButton btnCinq = new JButton(new Condensateur("X"));
    //cherche image dans fichier
    Image image639 = Toolkit.getDefaultToolkit().getImage("ImagesNiveaux/6.39.png");

    /**
     * constructeur de BackGround
     */
    public BackGround639() {
        super();
        //méthode de la classe mere
        init();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image639, 0, 0, this);

    }

    /**
     * positionnement des boutons dans le backgrounds
     */
    public void init() {

        btnTrois.setBackground(Color.WHITE);
        add(btnUn);
        add(btnDeux);
        add(btnTrois);
        add(btnQuatre);
        add(btnCinq);

        btnUn.setBounds(125, 138, 100, 75);
        btnDeux.setBounds(375, 138, 100, 75);
        btnDeux.setTransferHandler(new TransferHandler("icon"));
        btnTrois.setBounds(250, 325, 100, 75);
        btnTrois.setTransferHandler(new TransferHandler("icon"));
        btnQuatre.setBounds(125, 510, 100, 75);
        btnQuatre.setTransferHandler(new TransferHandler("icon"));
        btnCinq.setBounds(375, 510, 100, 75);
        btnCinq.setTransferHandler(new TransferHandler("icon"));

    }
    //énoncé du problème

    @Override
    public String toString() {
        return "A)Trouvez les bonnes valeurs des résistances." + "\n"
                + "B) Si τ=0,9s , et que l'interrupteur est fermé," + "\n" + "trouvez la valeur du condensateur manquant.";
    }
    //vérification de la réponse

    @Override
    boolean verifier() {
        return btnDeux.getIcon().equals(reponseA) && btnQuatre.getIcon().equals(reponseB) && btnCinq.getIcon().equals(reponseC);
    }
}
