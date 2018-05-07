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
public class BackGround619 extends Background {

    //création des éléments qui vont dans les backgrounds
    private Resistance resistance2 = new Resistance("2");
    private Resistance resistance10 = new Resistance("10");
    private Resistance resistance5 = new Resistance("5");
    private Resistance resistance4 = new Resistance("4");

    private Resistance reponseA = new Resistance("3");
    private Pile reponseB = new Pile("8");
    //création des JComponents qui contiennent les composants à changer
    JButton btnUn = new JButton(resistance10);
    JButton btnDeux = new JButton(resistance5);
    JButton btnTrois = new JButton(resistance4);
    JButton btnQuatre = new JButton(new Resistance("X"));
    JButton btnCinq = new JButton(resistance2);
    JButton btnSix = new JButton(new Pile("X"));

    //cherche image dans fichier
    Image image619 = Toolkit.getDefaultToolkit().getImage("ImagesNiveaux/6.19.png");

    /**
     * constructeur de BackGround
     */
    public BackGround619() {
        super();
        //méthode de la classe mere
        init();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image619, 0, 0, this);

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

        btnUn.setBounds(222, 115, 100, 75);
        btnDeux.setBounds(222, 235, 100, 75);
        btnTrois.setBounds(365, 175, 100, 75);
        btnQuatre.setBounds(280, 345, 100, 75);
        btnQuatre.setTransferHandler(new TransferHandler("icon"));
        btnCinq.setTransferHandler(new TransferHandler("icon"));
        btnSix.setBounds(250, 590, 100, 75);
        btnSix.setTransferHandler(new TransferHandler("icon"));
    }
    //énoncé du problème

    @Override
    public String toString() {
        return "A) Dans le circuit suivant, la résistance équivalente est 4,13 Ω. Trouvez la valeur de R." + "\n"
                + "B) L'intensité de la résistance de 2Ω est de 1,94 A. Trouvez le potentiel de la pile.";
    }
    //vérification de la réponse

    @Override
    boolean verifier() {

        return btnQuatre.getIcon().equals(reponseA) && btnSix.getIcon().equals(reponseB);
    }

}
