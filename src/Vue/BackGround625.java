package Vue;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.TransferHandler;

public class BackGround625 extends Background {

    JButton btnUn = new JButton();
    JButton btnDeux = new JButton();
    JButton btnTrois = new JButton();
    JButton btnQuatre = new JButton();
    JButton btnCinq = new JButton();
    JButton btnSix = new JButton();
    JButton btnSept = new JButton();
    JButton btnHuit = new JButton();

    Image image625 = Toolkit.getDefaultToolkit().getImage("ImagesNiveaux/6.25.png");
    JButton button[] = new JButton[8];
    
    public BackGround625() {
        super();
        init();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image625, 0, 0, this);

    }


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
        button[1].setTransferHandler(new TransferHandler("icon"));
        button[2].setBounds(415, 230, 100, 75);
        button[2].setTransferHandler(new TransferHandler("icon"));
        button[3].setBounds(268, 310, 100, 75);
        button[3].setTransferHandler(new TransferHandler("icon"));
        button[4].setBounds(125, 230, 100, 75);
        button[4].setTransferHandler(new TransferHandler("icon"));
        button[5].setBounds(115, 425, 100, 75);
        button[5].setTransferHandler(new TransferHandler("icon"));
        button[6].setBounds(350, 425, 100, 75);
        button[6].setTransferHandler(new TransferHandler("icon"));
        button[7].setBounds(250, 595, 100, 75);
        button[7].setTransferHandler(new TransferHandler("icon"));
    }
    @Override
    public String toString() {
        return "a) Place l'ampèremètre au bonne endroit avec la bonne valeur."
                + "b) Place le voltmètre au bonne endroit avec la bonne valeur.";
    }
}
