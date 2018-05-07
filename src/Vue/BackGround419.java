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
public class BackGround419 extends Background {

    //création des éléments qui vont dans les backgrounds
    private Condensateur condensateur3 = new Condensateur("3");
    private Condensateur condensateur2 = new Condensateur("2");
    private Condensateur condensateur4 = new Condensateur("4");
    private Pile pile90 = new Pile("90");

    private Condensateur reponse = new Condensateur("6");
    //création des JComponents qui contiennent les composants à changer
    JButton btnUn = new JButton(condensateur3);
    JButton btnDeux = new JButton(new Condensateur("X"));
    JButton btnTrois = new JButton(condensateur2);
    JButton btnQuatre = new JButton(condensateur4);
    JButton btnCinq = new JButton(pile90);

    //cherche image dans fichier
    Image image419 = Toolkit.getDefaultToolkit().getImage("ImagesNiveaux/4.19.png");

    /**
     * constructeur de BackGround
     */
    public BackGround419() {
        super();
        //méthode de la classe mere
        init();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image419, 0, 0, this);

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

        btnUn.setBounds(200, 130, 100, 75);
        btnDeux.setBounds(370, 130, 100, 75);
        btnDeux.setTransferHandler(new TransferHandler("icon"));
        btnTrois.setBounds(200, 340, 100, 75);
        btnQuatre.setBounds(370, 340, 100, 75);
        btnCinq.setBounds(280, 610, 100, 75);
    }

    //énoncé du problème
    @Override
    public String toString() {
        return "Calculez la capacité du condensateur manquant pour que la capacité équivalente soit 1,25 µF.";
    }
    //vérification de la réponse

    @Override
    boolean verifier() {

        return btnDeux.getIcon().equals(reponse);
    }

}
