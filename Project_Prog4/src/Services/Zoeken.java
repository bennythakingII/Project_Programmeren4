/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAL.Gebruiker;
import DAL.Gerechten;
import DAL.Reservatie;
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
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("Project_Prog4PUS");
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
    
    public DAL.Gerechten ZoekGerechtByName (String naam)
    {
        try 
        {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("Project_Prog4PUS");
            EntityManager em = emf.createEntityManager();
            
            TypedQuery<Gerechten> query = em.createQuery("SELECT d FROM Gerechten d WHERE d.GerechtNaam = :naam", Gerechten.class);
            Gerechten gerecht = query.setParameter("naam" , naam).getSingleResult();
            
            em.close();
            emf.close();
            return gerecht;
        }
        
        catch(Exception ex)
        {
            Gerechten nul = new Gerechten();
            nul.setId(Long.parseLong("0"));
            return nul;
        }
    }
    
    public DAL.Gebruiker ZoekGebruikerByID(long id)
    {
        try
        {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("Project_Prog4PUS");
            EntityManager em = emf.createEntityManager();
            
            TypedQuery<Gebruiker> query = em.createQuery("SELECT d FROM Gebruiker d WHERE d.gebruikerID = :id", Gebruiker.class);
            Gebruiker gebruiker = query.setParameter("Id", id).getSingleResult();
            
            em.close();
            emf.close();
            return gebruiker;
        }
        
        catch(Exception ex){
            Gebruiker nul = new Gebruiker();
            nul.setId(Long.parseLong("0"));
            return nul;
        }
        
    }
    
    public DAL.Reservatie ZoekReservatieByID(long id)
        {
            try
            {
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("Project_Prog4PUS");
                EntityManager em = emf.createEntityManager();
                
                TypedQuery<Reservatie> query = em.createQuery("SELECT d FROM Reservatie d WHERE d.reservatieID = :Id", Reservatie.class);
                Reservatie reservatie = query.setParameter("Id", id).getSingleResult();
                
                em.close();
                emf.close();
                return reservatie;
            }
            
            catch(Exception ex)
            {
                Reservatie nul = new Reservatie();
                nul.setId(Long.parseLong("0"));
                return nul;
            }
        }
    
    public DAL.Gerechten ZoekGerechtenByID(long id)
            {
                try {
                    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Project_Prog4PUS");
                    EntityManager em = emf.createEntityManager();
                    
                    TypedQuery<Gerechten> query = em.createQuery("SELECT d from Gerechten d WHERE d.gerechtenID = :Id", Gerechten.class);
                    Gerechten gerecht = query.setParameter("Id", id).getSingleResult();
                    
                    em.close();
                    emf.close();
                    return gerecht;
                    
                    
                } catch (Exception e) {
                    Gerechten nul = new Gerechten();
                    nul.setId(Long.parseLong("0"));
                    return nul;
                }
            }
}

//
//                TypedQuery<Reservatie> query = em.createQuery("SELECT d FROM Reservatie d WHERE d.gebruiker = :idgebruiker AND "
//                        + "d.tableID = : idtable", Reservatie.class);
//                Reservatie reservatie = query.setParameter("idreservatie", idGebruiker).setParameter("idtable", idTable).getSingleResult();
                
