 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_prog4;

import DAL.Gebruiker;
import DAL.RestaurantPlaatsen;

/**
 *
 * @author Benjamin
 */
public class Project_Prog4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //aanmaken gebruiker en plaatsen
        
        RestaurantPlaatsen plaatsen = new RestaurantPlaatsen();
        plaatsen.setSeatCapacity(24);
        
        Gebruiker gebruiker = new Gebruiker();
        gebruiker.setEmail("benny@gmail.com");
        gebruiker.setNaam("benny");
        gebruiker.setPassword("test");
        gebruiker.setTelefoonnummer("+3236664789");
        
        
        
        
    }
    
}
