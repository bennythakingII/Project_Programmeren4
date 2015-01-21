/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.Collection;

/**
 *
 * @author Benjamin
 */
public interface Gebruikermanager
{

    boolean addGebruiker(Gebruiker gebruiker);
    boolean deleteGebruiker(Gebruiker gebruiker);
    boolean updateGebruiker(Gebruiker gebruiker);
    
    Gebruiker zoekGebruiker(String email);
    
    Collection<Gebruiker> alleGebruikers();
    Collection<Reservatie> alleReservaties();
}
