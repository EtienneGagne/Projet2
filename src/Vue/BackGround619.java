package Vue;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.TransferHandler;

public class BackGround619 extends Background {

    JButton btnUn = new JButton();
    JButton btnDeux = new JButton();
    JButton btnTrois = new JButton();
    JButton btnQuatre = new JButton();
    JButton btnCinq = new JButton();
    JButton btnSix = new JButton();

    Image image619 = Toolkit.getDefaultToolkit().getImage("ImagesNiveaux/6.19.png");
    JButton button[] = new JButton[6];

    public BackGround619() {
        super();
        init();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image619, 0, 0, this);

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
        button[0].setBounds(222, 115, 100, 75);
        button[0].setTransferHandler(new TransferHandler("icon"));
        button[1].setBounds(222, 235, 100, 75);
        button[1].setTransferHandler(new TransferHandler("icon"));
        button[2].setBounds(365, 175, 100, 75);
        button[2].setTransferHandler(new TransferHandler("icon"));
        button[3].setBounds(280, 345, 100, 75);
        button[3].setTransferHandler(new TransferHandler("icon"));
        button[4].setBounds(70, 275, 100, 75);
        button[4].setTransferHandler(new TransferHandler("icon"));
        button[5].setBounds(250, 590, 100, 75);
        button[5].setTransferHandler(new TransferHandler("icon"));
    }
     @Override
    public String toString() {
        return "a)Dans le circuit suivant, la résistance équivalente est 4,13Ω. Trouvez la valeur de R."
                + "b)L'intensité de la résistance de 2Ω est de 1,94 A. Trouvez le potentiel de la pile.";
    }
}
