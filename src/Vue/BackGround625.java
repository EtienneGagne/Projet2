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
public class BackGround625 extends Background {

    //création des éléments qui vont dans les backgrounds
    private Resistance resistance6 = new Resistance("6");
    private Pile pile6 = new Pile("6");
    private Resistance resistance10 = new Resistance("10");
    private Resistance resistance5 = new Resistance("5");
    private Pile pile45 = new Pile("4.5");

    private Amperemetre reponseA = new Amperemetre("0.4");
    private Voltmetre reponseB = new Voltmetre("1.5");
    //création des JComponents qui contiennent les composants à changer
    JButton btnUn = new JButton();
    JButton btnDeux = new JButton(resistance6);
    JButton btnTrois = new JButton(pile6);
    JButton btnQuatre = new JButton();
    JButton btnCinq = new JButton(resistance10);
    JButton btnSix = new JButton(resistance5);
    JButton btnSept = new JButton(pile45);
    JButton btnHuit = new JButton(resistance6);
    //cherche image dans fichier
    Image image625 = Toolkit.getDefaultToolkit().getImage("ImagesNiveaux/6.25.png");

    /**
     * constructeur de BackGround
     */
    public BackGround625() {
        super();
        //méthode de la classe mere
        init();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image625, 0, 0, this);
        btnUn.setBackground(Color.WHITE);
        btnQuatre.setBackground(Color.WHITE);
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

        btnUn.setBounds(150, 50, 100, 75);
        btnUn.setTransferHandler(new TransferHandler("icon"));
        btnDeux.setBounds(350, 50, 100, 75);
        btnTrois.setBounds(415, 230, 100, 75);
        btnQuatre.setBounds(268, 310, 100, 75);
        btnQuatre.setTransferHandler(new TransferHandler("icon"));
        btnCinq.setBounds(125, 230, 100, 75);
        btnSix.setBounds(115, 425, 100, 75);
        btnSept.setBounds(350, 425, 100, 75);
        btnHuit.setBounds(250, 595, 100, 75);
    }

    //énoncé du problème
    @Override
    public String toString() {
        return "A) Place l'ampèremètre au bonne endroit avec la bonne valeur affichée sur l'ampèremètre." + "\n"
                + "B) Place le voltmètre au bonne endroit avec la bonne valeur affichée sur le voltmètre.";
    }

    //vérification de la réponse
    @Override
    boolean verifier() {
        return btnUn.getIcon().equals(reponseA) && btnSix.getIcon().equals(reponseB);
    }
}
