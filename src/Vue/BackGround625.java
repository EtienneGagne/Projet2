package Vue;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.TransferHandler;

/**
 *
 * @author 1637157
 */
public class BackGround625 extends Background {
    
    private Resistance resistance6 = new Resistance("6");
    private Pile pile6 = new Pile("6");
    private Resistance resistance10 = new Resistance("10");
    private Resistance resistance5 = new Resistance("5");
    private Pile pile45 = new Pile("4.5");
   
    private Amperemetre reponseA=new Amperemetre("0.4");
    private Voltmetre reponseB=new Voltmetre("1.5");
   
    JButton btnUn = new JButton();
    final JButton btnDeux = new JButton(resistance6);
    final JButton btnTrois = new JButton(pile6);
    JButton btnQuatre = new JButton();
    final JButton btnCinq = new JButton(resistance10);
    final JButton btnSix = new JButton(resistance5);
    final JButton btnSept = new JButton(pile45);
    final JButton btnHuit = new JButton(resistance6);


    Image image625 = Toolkit.getDefaultToolkit().getImage("ImagesNiveaux/6.25.png");
    JButton button[] = new JButton[8];
    
    /**
     *
     */
    public BackGround625() {
        super();
        init();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image625, 0, 0, this);

    }

    /**
     *
     */
    public void init() {
        button[0] = btnUn;
        button[1] = btnDeux;
        button[2] = btnTrois;
        button[3] = btnQuatre;
        button[4] = btnCinq;
        button[5] = btnSix;
        button[6] = btnSept;
        button[7] = btnHuit;

        add(button[0]);
        add(button[1]);
        add(button[2]);
        add(button[3]);
        add(button[4]);
        add(button[5]);
        add(button[6]);
        add(button[7]);
        button[0].setBounds(150, 50, 100, 75);
        button[0].setTransferHandler(new TransferHandler("icon"));
        button[1].setBounds(350, 50, 100, 75);
        //button[1].setTransferHandler(new TransferHandler("icon"));
        button[2].setBounds(415, 230, 100, 75);
        //button[2].setTransferHandler(new TransferHandler("icon"));
        button[3].setBounds(268, 310, 100, 75);
        button[3].setTransferHandler(new TransferHandler("icon"));
        button[4].setBounds(125, 230, 100, 75);
        //button[4].setTransferHandler(new TransferHandler("icon"));
        button[5].setBounds(115, 425, 100, 75);
        //button[5].setTransferHandler(new TransferHandler("icon"));
        button[6].setBounds(350, 425, 100, 75);
        //button[6].setTransferHandler(new TransferHandler("icon"));
        button[7].setBounds(250, 595, 100, 75);
        //button[7].setTransferHandler(new TransferHandler("icon"));
    }
    @Override
    public String toString() {
        return "A) Place l'ampèremètre au bonne endroit avec la bonne valeur affichée sur l'ampèremètre."+"\n"
                + "B) Place le voltmètre au bonne endroit avec la bonne valeur affichée sur le voltmètre.";
    }

	@Override
	boolean verifier() {
		return btnUn.getIcon().equals(reponseA) && btnSix.getIcon().equals(reponseB);
	}
}
