/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Benjamin
 */
public interface Plaatsenmanager{
    
    boolean addPlaatsen(RestaurantPlaatsen plaatsen);
    boolean deletePlaatsen(RestaurantPlaatsen plaatsen);
    boolean updatePlaatsen(RestaurantPlaatsen plaatsen);
    
    RestaurantPlaatsen findPlaatsenDoorID(int tableID);
    
    //Collection<RestaurantPlaatsen> gereserveerdePlaatsen();
    Collection<RestaurantPlaatsen> VrijPlaatsen(String date, int  time);
    Collection<RestaurantPlaatsen> allePlaatsen();
    
}
