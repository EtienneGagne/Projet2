package Vue;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.TransferHandler;


public class BackGround639 extends Background {
     

    JButton btnUn = new JButton();
    JButton btnDeux = new JButton();
    JButton btnTrois = new JButton();
    JButton btnQuatre = new JButton();
    JButton btnCinq = new JButton();
    JButton btnSix = new JButton();

    Image image639 = Toolkit.getDefaultToolkit().getImage("ImagesNiveaux/6.39.png");
    JButton button[] = new JButton[6];
    
    public BackGround639() {
        super();
        init();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image639, 0, 0, this);

    }


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
       
        button[0].setBounds(125, 138, 100, 75);
        button[0].setTransferHandler(new TransferHandler("icon"));
        button[1].setBounds(375, 138, 100, 75);
        button[1].setTransferHandler(new TransferHandler("icon"));
        button[2].setBounds(250, 325, 100, 75);
        button[2].setTransferHandler(new TransferHandler("icon"));
        button[3].setBounds(125, 510, 100, 75);
        button[3].setTransferHandler(new TransferHandler("icon"));
        button[4].setBounds(375, 510, 100, 75);
        button[4].setTransferHandler(new TransferHandler("icon"));
       
    }
    @Override
    public String toString() {
        return "A)Trouvez les bonnes valeurs des résistances."
                + "B) Si τ=0,9s , et que l'interrupteur est fermé,trouvez la valeur du condensateur manquant.";
    }
}
