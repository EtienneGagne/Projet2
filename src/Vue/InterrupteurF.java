/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 * @author AEC
 */
public class InterrupteurF extends ImageIcon {
//cherche fichier photo 

    static Image imageInterrupteurF = Toolkit.getDefaultToolkit().getImage("composantes/interrupteur-fermeps.png");

    /**
     * constructeur interrupteur fermé
     */
    public InterrupteurF() {
        super(imageInterrupteurF);

    }

}
