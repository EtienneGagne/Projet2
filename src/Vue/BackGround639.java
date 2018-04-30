package Vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.TransferHandler;


public class BackGround639 extends Background {
    
     private Pile pile10 = new Pile(1, 1, 1, 1);
     private Resistance ResistanceCouleur50K = new Resistance(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
     private InterrupteurO interrupteurO = new InterrupteurO();
     private Resistance ResistanceCouleur100K =new Resistance(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);

    JButton btnUn = new JButton(pile10);
    JButton btnDeux = new JButton(ResistanceCouleur50K);
    JButton btnTrois = new JButton(interrupteurO);
    JButton btnQuatre = new JButton(ResistanceCouleur100K);
    JButton btnCinq = new JButton(" C ");

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
        btnTrois.setBackground(Color.WHITE);
        button[3] = btnQuatre;
        button[4] = btnCinq;
        

        add(button[0]);
        add(button[1]);
        add(button[2]);
        add(button[3]);
        add(button[4]);
       
        button[0].setBounds(125, 138, 100, 75);
        //button[0].setTransferHandler(new TransferHandler("icon"));
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
        return "A)Trouvez les bonnes valeurs des résistances."+"\n"
                + "B) Si τ=0,9s , et que l'interrupteur est fermé,"+"\n"+"trouvez la valeur du condensateur manquant.";
    }
}
