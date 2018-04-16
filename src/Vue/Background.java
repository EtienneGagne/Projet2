/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author audre
 */
public abstract class Background extends JPanel{
  
    public Background() {
        setLayout(null);
        setSize(650, 750);      
    }
    public String toString(){
        String Prob="";
        System.out.println("y0");
        return Prob;
                
    }
    abstract void init();

 
}
