
package mini_projet_matteo_zavarella_alexandre_avril;

import javax.swing.JLabel;

public class MINI_PROJET_MATTEO_ZAVARELLA_ALEXANDRE_AVRIL {

    public static void main(String[] args) {
        // TODO code application logic here
        
         Light_off obj1 = new Light_off();
         while (obj1.FinDePartie() == true){ // boucle de jeu while pour arreter le jeu quandla grill est 
             // entièrement étiente.
            obj1.setVisible(true);
            break;
            }
        
    }   
}
