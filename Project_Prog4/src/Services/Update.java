/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import javax.persistence.Access.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Benjamin
 */
public class Update {
    public boolean UpdateGerecht(DAL.Gerechten gerechten)
    {
    try{
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("Project_Prog4PUS");
            EntityManager em = emf.createEntityManager();
            EntityTransaction trans = em.getTransaction();
            
            trans.begin();
            em.merge(gerechten);
            trans.commit();
            
            em.close();
            emf.close();
            
            return true;

        }
    
    catch(Exception ex){return false;}
    
    }
    
    public Boolean UpdateGebruikers(DAL.Gebruiker gebruikers)
    {
        try
        {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("Project_Prog4PUS");
            EntityManager em = emf.createEntityManager();
            EntityTransaction trans = em.getTransaction();
            
            trans.begin();
            em.merge(gebruikers);
            trans.commit();
            
            em.close();
            emf.close();
            
            return true;
        }
        catch(Exception ex){return false;}
    }
    
}
