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
public class BackGround651 extends Background  {
    private Voltmetre voltmetre6 = new Voltmetre("6");
    private Amperemetre amperemetre3m = new Amperemetre("3");
    private Resistance resistance3k = new Resistance("3K");
     
    private Resistance reponseA=new Resistance("2K");
    private Pile reponseB=new Pile("15");
    
    final JButton btnUn=new JButton(voltmetre6);
    JButton btnDeux=new JButton(new Resistance("X"));
    final JButton btnTrois=new JButton(amperemetre3m);
    JButton btnQuatre=new JButton(new Pile("X"));
    final JButton btnCinq=new JButton(resistance3k);

 
    
    Image image651 = Toolkit.getDefaultToolkit().getImage("ImagesNiveaux/6.51.png");
    JButton button[] = new JButton[5];   
    
    /**
     *
     */
    public BackGround651() {
        super();
        init();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image651, 0, 0,this);

    }

    /**
     *
     */
    public void init() {
        button[0]=btnUn;
        button[1]=btnDeux;
        button[2]=btnTrois;
        button[3]=btnQuatre;
        button[4]=btnCinq;
    
        
        
    add(button[0]);
    add(button[1]);
    add(button[2]);
    add(button[3]);
    add(button[4]);

    button[0].setBounds(120,120,100,75);
    button[1].setBounds(120,310,100,75);
    button[1].setTransferHandler(new TransferHandler("icon"));
    button[2].setBounds(360,310,100,75);
    button[3].setBounds(160,600,100,75);
    button[3].setTransferHandler(new TransferHandler("icon"));
    button[4].setBounds(360,600,100,75);
 
  
}
    @Override
    public String toString() {
        return "Le voltmètre idéal indique 6,00 V et l'ampèremètre idéal, 3,00 mA."+"\n"
                + "A)Trouvez la valeur de la résistance manquante."+"\n"
                + "B)Trouvez la f.é.m. de la pile.";
    }

	@Override
	boolean verifier() {
		return btnDeux.getIcon().equals(reponseA) && btnQuatre.getIcon().equals(reponseB);
	}
    
}
