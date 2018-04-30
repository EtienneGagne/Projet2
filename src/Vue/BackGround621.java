package Vue;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.TransferHandler;


public class BackGround621 extends Background  { 
    
      private Resistance resistance1 = new Resistance();
       private Resistance resistance5 = new Resistance(1, 1, 1, 1, 1, 1, 1);
        private Resistance resistance11 = new Resistance(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
         private Pile pile4 = new Pile(1);
         private Condensateur condensateur2 = new Condensateur();
         
    JButton btnUn=new JButton("R1");
    JButton btnDeux=new JButton(pile4);
    JButton btnTrois=new JButton(resistance1);
    JButton btnQuatre=new JButton(resistance5);
    JButton btnCinq=new JButton("R2");
    JButton btnSix=new JButton(resistance1);
    JButton btnSept=new JButton(condensateur2);
    
    Image image621 = Toolkit.getDefaultToolkit().getImage("ImagesNiveaux/6.21.png");
    JButton button[] = new JButton[7];   
    
    public BackGround621() {
        super();
        init();        
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image621, 0, 0,this);

    }

    
    public void init() {
        button[0]=btnUn;
        button[1]=btnDeux;
        button[2]=btnTrois;
        button[3]=btnQuatre;
        button[4]=btnCinq;
        button[5]=btnSix;
        button[6]=btnSept;
        
    add(button[0]);
    add(button[1]);
    add(button[2]);
    add(button[3]);
    add(button[4]);
    add(button[5]);
    add(button[6]);
                      //x    y   L  H
    button[0].setBounds(260,50,100,75);
    button[0].setTransferHandler(new TransferHandler("icon"));
    button[1].setBounds(120,230,100,75);
    //button[1].setTransferHandler(new TransferHandler("icon"));
    button[2].setBounds(260,230,100,75);
    //button[2].setTransferHandler(new TransferHandler("icon"));
    button[3].setBounds(400,230,100,75);
    //button[3].setTransferHandler(new TransferHandler("icon"));
    button[4].setBounds(120,600,100,75);
    button[4].setTransferHandler(new TransferHandler("icon"));
    button[5].setBounds(260,600,100,75);
   // button[5].setTransferHandler(new TransferHandler("icon"));
    button[6].setBounds(400,600,100,75);
    //button[6].setTransferHandler(new TransferHandler("icon"));
}
     @Override
    public String toString() {
        return "A) Au temps t=0, calculez les résistances manquantes si "
                + "la résistance équivalente de la branche du bas est "+"\n"
                + "de 12 Omh et que la résistance équivalente du circuit est de 0.375 ohm."+"\n"
                + "B) Une fois que le condensateur est plein, qu'elle est la résisante équivalente du circuit. ";
    }
   
    
}
