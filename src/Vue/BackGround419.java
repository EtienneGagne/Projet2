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
public class BackGround419 extends Background {

    private Condensateur condensateur3 = new Condensateur("3");
    private Condensateur condensateur2 = new Condensateur("2");
    private Condensateur condensateur4 = new Condensateur("4");
    private Pile pile90 = new Pile("90");
    
    JButton btnUn = new JButton(condensateur3);
    JButton btnDeux = new JButton();
    JButton btnTrois = new JButton(condensateur2);
    JButton btnQuatre = new JButton(condensateur4);
    JButton btnCinq = new JButton(pile90);

    Image image419 = Toolkit.getDefaultToolkit().getImage("ImagesNiveaux/4.19.png");
    JButton button[] = new JButton[5];

    /**
     *
     */
    public BackGround419() {
        super();
        init();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image419, 0, 0, this);

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

        add(button[0]);
        add(button[1]);
        add(button[2]);
        add(button[3]);
        add(button[4]);
        //x    y   L  H
        button[0].setBounds(200, 130, 100, 75);
//        button[0].setTransferHandler(new TransferHandler("icon"));
        button[1].setBounds(370, 130, 100, 75);
        button[1].setTransferHandler(new TransferHandler("icon"));
        button[2].setBounds(200, 340, 100, 75);
//        button[2].setTransferHandler(new TransferHandler("icon"));
        button[3].setBounds(370, 340, 100, 75);
//        button[3].setTransferHandler(new TransferHandler("icon"));
        button[4].setBounds(280, 610, 100, 75);
//        button[4].setTransferHandler(new TransferHandler("icon"));
    }

    @Override
    public String toString() {
        return "Calculez la capacité du condensateur manquant pour que la capacité équivalente soit 1,25 µF.";
    }

	@Override
	boolean verifier() {
		
		return false;
	}

}
