
package Vue;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author 1637157
 */
public class Voltmetre extends ImageIcon {
 
    /**
     *
     */
    protected static Image imageVoltmetre= Toolkit.getDefaultToolkit().getImage("composantes/voltmetreps1.5.png");

    /**
     *
     */
    protected static Image imageVoltmetre1=Toolkit.getDefaultToolkit().getImage("composantes/voltmetreps6.png");

    /**
     *
     */
    public Voltmetre(){
       super(imageVoltmetre);
        }

    /**
     *
     * @param a
     */
    public Voltmetre(int a){
       super(imageVoltmetre1);
        }
    
    
        
     
                }
    
        
    
    

