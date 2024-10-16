/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Yazid Soumanou
 */
public class personage {
     position position_perso;
    int point_vie =-1;
    Boolean vulnerabilite;

    public personage(position position_perso, Boolean vulnerabilite) {
        this.position_perso = position_perso;
        this.vulnerabilite = vulnerabilite;
    }

    public position getPosition_perso() {
        return position_perso;
    }

    public void setPosition_perso(position position_perso) {
        this.position_perso = position_perso;
    }

    public int getPoint_vie() {
        return point_vie;
    }

    public void setPoint_vie(int point_vie) {
        this.point_vie = point_vie;
    }

    public Boolean getVulnerabilite() {
        return vulnerabilite;
    }

    public void setVulnerabilite(Boolean vulnerabilite) {
        this.vulnerabilite = vulnerabilite;
    }
    
    
    
}
