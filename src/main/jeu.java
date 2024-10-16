/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.List;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Yazid Soumanou
 */
public class jeu extends JPanel{
    pacman pacman;
    fantome[] fantomes;
    grille environement;
    List <position> bonus_score;
    List <position> bonus_fantome;
    int taille_grille = 24;
    int nbr_point_bonus_score;
    int nbr_point_bonus_fantome;
   

    public jeu(pacman pacman, fantome[] fantomes) {
        this.pacman = pacman;
        this.fantomes = fantomes;
        this.environement = new grille (this.taille_grille);
        this.bonus_score = new ArrayList<position>();
        this.bonus_fantome = new ArrayList<position>();
        this.nbr_point_bonus_score =3*this.taille_grille/16;
        this.nbr_point_bonus_fantome = this.taille_grille/16;
         position pos;
         Random hasard =new Random();
         
        while(this.bonus_score.size()< this.nbr_point_bonus_score)
            {
                pos = this.environement.getMatrice()[hasard.nextInt(0,this.taille_grille)][hasard.nextInt(0,this.taille_grille)];
                if(!this.bonus_score.contains(pos) && !this.bonus_score.contains(pos))this.bonus_score.add(pos);
            }
        
        while(this.bonus_fantome.size()< this.nbr_point_bonus_fantome)
            {
                pos = this.environement.getMatrice()[hasard.nextInt(0,this.taille_grille)][hasard.nextInt(0,this.taille_grille)];
                if(!this.bonus_fantome.contains(pos) && !this.bonus_fantome.contains(pos))this.bonus_fantome.add(pos);
            }
    }
    
   
    @Override 
    protected void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        
        for (int ligne=0;ligne< this.taille_grille; ligne++)
        {
            g.drawRect(0,ligne*25, 25*this.taille_grille, 25);
        }
        
         for (int ligne=0;ligne< this.taille_grille; ligne++)
        {
            g.drawRect(ligne*25,0, 25, 25*this.taille_grille);
        }
        for (int ligne=0;ligne<= this.taille_grille; ligne++)
        {
           for (int colonne = 0;colonne<= this.taille_grille; colonne++)
            {
               g.fillOval(ligne*25-5, colonne*25-5, 10, 10); 
            }
        }
        for (position pos : this.bonus_score)
        {
            g.setColor(Color.yellow);
            g.fillOval(pos.getX()*25-5, pos.getY()*25-5, 10, 10); 
        }
        for (position pos : this.bonus_fantome)
        {
            g.setColor(Color.red);
            g.fillOval(pos.getX()*25-5, pos.getY()*25-5, 10, 10); 
        }
    }
    void demarrer()
    {
        JFrame frame = new JFrame("Pacman");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //JButton but
        frame.add(this);
        frame.setSize(700,700);
        frame.setVisible(true);
        
    }
   
}
