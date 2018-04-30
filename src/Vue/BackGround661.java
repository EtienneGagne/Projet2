package Vue;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.TransferHandler;


public class BackGround661 extends Background {
     private Resistance resistance3k = new Resistance(1, 1, 1, 1);
     private Condensateur condensateur3 = new Condensateur(1);
     
    JButton btnUn = new JButton("R1");
    JButton btnDeux = new JButton("C1");
    JButton btnTrois = new JButton(resistance3k);
    JButton btnQuatre = new JButton(condensateur3);
    JButton btnCinq = new JButton("5");
    JButton btnSix = new JButton("6");

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
    @Override
    public String toString() {
        return "Une fois le condensateur q1 chargé (240µc) et le q2 (360µc), "
                + "A)Quel est la capacité du condensateur C1."
                + "B)Trouvez la valeur du f.é.m."
                + "C)Trouvez R1 sachant que le tau du circuit est 6 ms.";
    }
}
