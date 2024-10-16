/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Yazid Soumanou
 */
public class position {
    
        private int x ;
        private int y ;
        private int valeur =5;

        
        public position(int x, int y,int valeur) {
            this.x =x;
            this.y =y;
            this.valeur = valeur;
        } 
         public position(int x, int y) {
            this.x =x;
            this.y =y;
        } 
         public position() {
            this.x =0;
            this.y =0;
        } 
    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
        
    public int getX() {
        return this.x;
    }
 
    public void setX(int x) {
        this.x = x;
    }
   
    public int getY() {
        return y;
    }
   
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        if (this.valeur == 5)
        {
            return ".";
        }
        else if (this.valeur == 300)
        {
            return "¤";
        }
         else if (this.valeur == 1)
        {
            return "*";
        }
         else
         {
            return" "; 
         }
    }

}
