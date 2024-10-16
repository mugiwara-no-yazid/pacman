/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Yazid Soumanou
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        pacman perso = new pacman(new position(), true);
        fantome [] ennemi ={new fantome(new position(),false),new fantome(new position(),false),new fantome(new position(),false),new fantome(new position(),false)} ;
        jeu plateau = new jeu (perso, ennemi);
        plateau.demarrer();
    }
    
}
