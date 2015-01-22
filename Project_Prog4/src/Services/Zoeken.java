/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAL.Gebruiker;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Benjamin
 */
public class Zoeken {
    public DAL.Gebruiker ZoekGebruikerDoorNaam(String naam)
    {
        try
        {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("Project_Prog4PU");
            EntityManager em = emf.createEntityManager();
            
            TypedQuery<Gebruiker> query = em.createQuery("SELECT d FROM Gebruiker d WHERE d.naam = :naam", Gebruiker.class);
            Gebruiker gebruiker = query.setParameter("naam", naam).getSingleResult();
            
            em.close(); emf.close();
            return gebruiker;
        }
        catch(Exception ex)
        {
            Gebruiker nul = new Gebruiker();
            nul.setId(Long.parseLong("0"));
            return nul;
        }
        
    }    
    
}
