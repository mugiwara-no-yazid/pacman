/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
 
/**
 *
 * @author Yazid Soumanou
 */
public class grille {
      position [][] matrice;
      int taille = 24;
      
      grille(int taille)
      { 
          matrice = new position[taille][taille];
          for(int ligne = 0; ligne < taille;ligne++)
          {
              for(int colonne = 0; colonne < taille;colonne++)
              {
                  if (ligne == 0 && colonne == 0 )
                  {
                      matrice[ligne][colonne] = new position();
                  }
                  else 
                  {
                      matrice[ligne][colonne] = new position(ligne,colonne);
                  }
              }
          }
      }
      
       grille()
      { 
           matrice = new position[taille][taille];
          for(int ligne =0; ligne<taille;ligne++)
          {
              for(int colonne =0; colonne<taille;colonne++)
              {
                  if (ligne ==0 && colonne ==0 )
                  {
                      matrice[ligne][colonne] = new position();
                  }
                  else 
                  {
                      matrice[ligne][colonne] = new position(ligne,colonne);
                  }
              }
          }
      }
      public position[][] getMatrice()
      {
          return matrice;
      }
      public int getTaille()
      {
          return taille;
      }
      public void afficher ()
      {
          for(int ligne = taille-1; ligne >= 0;ligne--)
          {
              for(int colonne = 0; colonne < taille;colonne++)
                {
                    if (colonne !=taille-1 )
                    {
                       System.out.print(matrice[ligne][colonne]+"___");
                    }
                    else 
                    {
                        System.out.println(matrice[ligne][colonne]);
                    }
                }
              
               if(ligne != 0)for(int colonne = 0; colonne < taille ;colonne++)
                {
                    System.out.print("|");
                    if (colonne !=taille-1 )
                    {
                       System.out.print("   ");
                    }
                    else System.out.println("");
                    
                    /*else 
                    {
                        System.out.println(matrice[ligne][colonne]);
                    }*/
                }
          }
      }
               
}
