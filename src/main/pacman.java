/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Yazid Soumanou
 */
public class pacman extends personage{
    private int score = 0;
    public pacman(position position_perso, Boolean vulnerabilite) {
        super(position_perso, vulnerabilite);
    }

    public int getScore() {
        return score;
    }

        
    
}
