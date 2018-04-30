/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.Observable;

/**
 *
 * @author 1637157
 */
public class Modele  extends Observable{
      private int nombrePoint=0;
    private int nombreNiveau=0;

    /**
     *
     */
    public void reset() {
        
    	setChanged();
    	notifyObservers(this);   
        
    }

    /**
     *
     * @return
     */
    public int getNombreNiveau() {
        return nombreNiveau;
    }

    /**
     *
     * @return
     */
    public int getNombrePoint() {
        return nombrePoint;
    }

    /**
     *
     * @param nombreNiveau
     */
    public void setNombreNiveau(int nombreNiveau) {
        this.nombreNiveau = nombreNiveau++;
    }

    /**
     *
     * @param nombrePoint
     */
    public void setNombrePoint(int nombrePoint) {
        this.nombrePoint = nombrePoint++;
    }
    
}
