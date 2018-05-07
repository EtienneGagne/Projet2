package Vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.TransferHandler;

/**
 *@author AEC
 */
public class BackGround667 extends Background {

    //création des éléments qui vont dans les backgrounds
    private InterrupteurF interrupteurF = new InterrupteurF();
    private Condensateur condensateur6 = new Condensateur("6");
    private Resistance resistance4k = new Resistance("4K");
   
    private Resistance reponseA=new Resistance("7K");
    private Condensateur reponseB=new Condensateur("3");
    private Pile reponseC=new Pile("204");

    //création des JComponents qui contiennent les composants à changer
    JButton btnUn = new JButton(new Pile("X"));
    JButton btnDeux = new JButton(new Resistance("X"));
    JButton btnTrois = new JButton(new Condensateur("X"));
    JButton btnQuatre = new JButton(interrupteurF);
    JButton btnCinq = new JButton(condensateur6);
    JButton btnSix = new JButton(resistance4k);

    String nL1 = System.getProperty("line.separator"); // pour 1 interligne
    //cherche image dans fichier
    Image image667 = Toolkit.getDefaultToolkit().getImage("ImagesNiveaux/6.67.png");
  
    /**
     *constructeur de BackGround
     */
    public BackGround667() {
        super();
        //méthode de la classe mere
        init();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image667, 0, 0, this);
        btnQuatre.setBackground(Color.WHITE);
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
        

        btnUn.setBounds(245, 65, 100, 75);
        btnUn.setTransferHandler(new TransferHandler("icon"));
        btnDeux.setBounds(85, 250, 100, 75);
        btnDeux.setTransferHandler(new TransferHandler("icon"));
        btnTrois.setBounds(300, 250, 100, 75);
        btnTrois.setTransferHandler(new TransferHandler("icon"));
        btnQuatre.setBounds(220, 385, 100, 75);
        btnCinq.setBounds(150, 545, 100, 75);
        btnSix.setBounds(380, 545, 100, 75);

    }
    //énoncé du problème
    @Override
    public String toString() {
        return "Soit la puissance de R2,P2=2,40 W, et I=18.5 mA"
                + "A)Déterminez la résistance R2." + "\n"
                + "B)Déterminez C1, sachant que P1=222 µC." + "\n"
                + "C)Trouvez la f.é.m.";
    }
        //vérification de la réponse
	@Override
	boolean verifier() {
		return btnDeux.getIcon().equals(reponseA) && btnTrois.getIcon().equals(reponseB) && btnUn.getIcon().equals(reponseC);
	}

}
