package Vue;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.TransferHandler;

public class BackGround632 extends Background {

    private Resistance resistance8 = new Resistance(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
    private Resistance resistance5 = new Resistance(1, 1, 1, 1, 1, 1, 1);
    private Resistance resistance11 = new Resistance(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
    private Pile pile12 = new Pile(1, 1, 1, 1);
    private Resistance resistance7 = new Resistance(1, 1, 1, 1, 1, 1, 1, 1, 1);
    
    final JButton btnUn = new JButton(resistance8);
    JButton btnDeux = new JButton("F.e.m");
    final JButton btnTrois = new JButton(resistance5);
    final JButton btnQuatre = new JButton(resistance11);
    final JButton btnCinq = new JButton(pile12);
    final JButton btnSix = new JButton(resistance7);
    final JButton btnSept = new JButton(resistance5);
    JButton btnHuit = new JButton("F.e.m");

    Image image632 = Toolkit.getDefaultToolkit().getImage("ImagesNiveaux/6.32.png");
    JButton button[] = new JButton[8];

    public BackGround632() {
        super();
        init();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image632, 0, 0, this);

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

        //x    y   L  H
        button[0].setBounds(120, 50, 100, 75);
        button[0].setTransferHandler(new TransferHandler("icon"));
        button[1].setBounds(260, 50, 100, 75);
        button[1].setTransferHandler(new TransferHandler("icon"));
        button[2].setBounds(400, 50, 100, 75);
        button[2].setTransferHandler(new TransferHandler("icon"));

        button[3].setBounds(120, 230, 100, 75);
        button[3].setTransferHandler(new TransferHandler("icon"));
        button[4].setBounds(260, 230, 100, 75);
        button[4].setTransferHandler(new TransferHandler("icon"));
        button[5].setBounds(400, 230, 100, 75);
        button[5].setTransferHandler(new TransferHandler("icon"));

        button[6].setBounds(160, 600, 100, 75);
        button[6].setTransferHandler(new TransferHandler("icon"));
        button[7].setBounds(360, 600, 100, 75);
        button[7].setTransferHandler(new TransferHandler("icon"));
    }

    @Override
    public String toString() {
        return "L'intensité de la branche du haut I1=2,88A, l'intensité I2=-0,416A et I3=3,30 A." + "\n"
                + "A)Trouvez la valeur de la résistance inconnu à l'aide des bandes de couleurs." + "\n"
                + "B) trouvez les deux valeurs de piles manquantes.";
    }
}
