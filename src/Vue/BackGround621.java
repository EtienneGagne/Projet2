package Vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.TransferHandler;

/**
 *
 * @author AEC
 */
public class BackGround621 extends Background {
    //création des éléments qui vont dans les backgrounds

    private Resistance resistance1 = new Resistance("1");
    private Resistance resistance5 = new Resistance("5");
    private Resistance resistance11 = new Resistance("11");
    private Resistance resistanceX = new Resistance("X");
    private Pile pile4 = new Pile("4");
    private Condensateur condensateur2 = new Condensateur("2");

    private Resistance reponseA = new Resistance("8");
    private Resistance reponseB = new Resistance("11");
    //entrer la réponse manuellement
    private String reponseC = new String("14");
    //création des JComponents qui contiennent les composants à changer
    JButton btnUn = new JButton(resistanceX);
    JButton btnDeux = new JButton(pile4);
    JButton btnTrois = new JButton(resistance1);
    JButton btnQuatre = new JButton(resistance5);
    JButton btnCinq = new JButton(resistanceX);
    JButton btnSix = new JButton(resistance1);
    JButton btnSept = new JButton(condensateur2);

    private JTextField reponse = new JTextField(40);
    //cherche image dans fichier
    Image image621 = Toolkit.getDefaultToolkit().getImage("ImagesNiveaux/6.21.png");

    /**
     * constructeur de BackGround
     */
    public BackGround621() {
        super();
        //méthode de la classe mere
        init();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image621, 0, 0, this);

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

        btnUn.setBounds(260, 50, 100, 75);
        btnUn.setTransferHandler(new TransferHandler("icon"));
        btnDeux.setBounds(120, 230, 100, 75);
        btnTrois.setBounds(260, 230, 100, 75);
        btnQuatre.setBounds(400, 230, 100, 75);
        btnCinq.setBounds(120, 600, 100, 75);
        btnCinq.setTransferHandler(new TransferHandler("icon"));
        btnSix.setBounds(260, 600, 100, 75);
        btnSept.setBounds(400, 600, 100, 75);

        add(reponse);
        reponse.setBounds(550, 20, 75, 30);
        reponse.setBackground(Color.CYAN);
    }
    //énoncé du problème

    @Override
    public String toString() {
        return "A) Au temps t=0, calculez les résistances manquantes si "
                + " la résistance équivalente de la branche du bas est " + "\n"
                + " de 12 Omh et que la résistance équivalente du circuit est de 0.375 ohm." + "\n"
                + "B) Une fois que le condensateur est plein, quelle est la résisante équivalente du circuit? " + "\n"
                + " (Entrez votre réponse dans l'encadré bleu";
    }

    //vérification de la réponse
    @Override
    boolean verifier() {
        return btnUn.getIcon().equals(reponseA) && btnCinq.getIcon().equals(reponseB) && reponse.getText().equals(reponseC);
    }

}
