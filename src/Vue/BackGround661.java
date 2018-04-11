package Vue;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.TransferHandler;


public class BackGround661 extends Background {
     
JButton btnUn = new JButton();
    JButton btnDeux = new JButton();
    JButton btnTrois = new JButton();
    JButton btnQuatre = new JButton();
    JButton btnCinq = new JButton();
    JButton btnSix = new JButton();

    Image image661 = Toolkit.getDefaultToolkit().getImage("ImagesNiveaux/6.61.png");
    JButton button[] = new JButton[6];
    
    public BackGround661() {
        super();
        init();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image661, 0, 0, this);

    }


    public void init() {
        button[0] = btnUn;
        button[1] = btnDeux;
        button[2] = btnTrois;
        button[3] = btnQuatre;
        button[4] = btnCinq;
        button[5] = btnSix;

        add(button[0]);
        add(button[1]);
        add(button[2]);
        add(button[3]);
        add(button[4]);
        add(button[5]);
        button[0].setBounds(160, 165, 100, 75);
        button[0].setTransferHandler(new TransferHandler("icon"));
        button[1].setBounds(380, 165, 100, 75);
        button[1].setTransferHandler(new TransferHandler("icon"));
        button[2].setBounds(160, 310, 100, 75);
        button[2].setTransferHandler(new TransferHandler("icon"));
        button[3].setBounds(380, 310, 100, 75);
        button[3].setTransferHandler(new TransferHandler("icon"));
        button[4].setBounds(160, 600, 100, 75);
        button[4].setTransferHandler(new TransferHandler("icon"));
        button[5].setBounds(380, 600, 100, 75);
        button[5].setTransferHandler(new TransferHandler("icon"));
    }
}
