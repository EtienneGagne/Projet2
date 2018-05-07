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
public class BackGround661 extends Background {
    //création des éléments qui vont dans les backgrounds
    private Resistance resistance3k = new Resistance("3K");
    private Condensateur condensateur3 = new Condensateur("3");
    private InterrupteurF interrupteurF = new InterrupteurF();

    private Condensateur reponseA = new Condensateur("2");
    private Pile reponseB = new Pile("120");
    private Resistance reponseC = new Resistance("2K");
     //création des JComponents qui contiennent les composants à changer
    JButton btnUn = new JButton(new Resistance("X"));
    JButton btnDeux = new JButton(new Condensateur("X"));
    JButton btnTrois = new JButton(resistance3k);
    JButton btnQuatre = new JButton(condensateur3);
    JButton btnCinq = new JButton(interrupteurF);
    JButton btnSix = new JButton(new Pile("X"));
    //cherche image dans fichier
    Image image661 = Toolkit.getDefaultToolkit().getImage("ImagesNiveaux/6.61.png");
    

    /**
     *constructeur de BackGround
     */
    public BackGround661() {
        super();
         //méthode de la classe mere
        init();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image661, 0, 0, this);
        btnCinq.setBackground(Color.WHITE);
    }

    /**
     *positionnement des boutons dans le backgrounds
     */
    public void init() {
        
        add(btnUn);
        add(btnDeux);
        add(btnTrois);
        add(btnQuatre);
        add(btnCinq);
        add(btnSix);

        btnUn.setBounds(160, 165, 100, 75);
        btnUn.setTransferHandler(new TransferHandler("icon"));
        btnDeux.setBounds(380, 165, 100, 75);
        btnDeux.setTransferHandler(new TransferHandler("icon"));
        btnTrois.setBounds(160, 310, 100, 75);
        btnQuatre.setBounds(380, 310, 100, 75);
        btnCinq.setBounds(160, 600, 100, 75);
        btnSix.setBounds(380, 600, 100, 75);
        btnSix.setTransferHandler(new TransferHandler("icon"));
    }
     //énoncé du problème
    @Override
    public String toString() {
        return "Une fois le condensateur q1 chargé (240µc) et le q2 (360µc): "
                + "A)Quel est la capacité du condensateur C1." + "\n"
                + "B)Trouvez la valeur du f.é.m." + "\n"
                + "C)Trouvez R1 sachant que le tau du circuit est 6 ms.";
    }
    //vérification de la réponse
    @Override
    boolean verifier() {
        return btnDeux.getIcon().equals(reponseA) && btnSix.getIcon().equals(reponseB) && btnUn.getIcon().equals(reponseC);
    }
}
