/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import javax.swing.JPanel;

/**
 *
 * @author audre
 */
public abstract class Background extends JPanel{
  
    /**
     *
     */
    public Background() {
        setLayout(null);
        
    }
    
    abstract void init();

 
}
