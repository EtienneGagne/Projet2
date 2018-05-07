/*
 * Circuit AEC
 */
package ca.qc.bdeb.prog4.circuitAEC;

import Vue.Fenetre;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @author Étienne Gagné
 * @author Audrey Lupien
 * @author Cloé Lachance
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //création fenetre
       Fenetre fenetre=new Fenetre();
     try {
    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
            UIManager.setLookAndFeel(info.getClassName());
            break;
        }
    }
} catch (UnsupportedLookAndFeelException e) {
    // handle exception
} catch (ClassNotFoundException e) {
    // handle exception
} catch (InstantiationException e) {
    // handle exception
} catch (IllegalAccessException e) {
    // handle exception
}

    }
    
}
