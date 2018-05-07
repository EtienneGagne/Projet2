
package Vue;

import javax.swing.JPanel;

/**
 *Classe mère de BackGround
 *@author AEC
 */
public abstract class Background extends JPanel{
  
    /**
     *constructeur Background
     */
    public Background() {
        setLayout(null);
        
    }
    /**
     * Initialiser le background
     */
    abstract void init();
    /**
     * verifier la réponse
     * @return boolean
     */
    abstract boolean verifier();

 
}
