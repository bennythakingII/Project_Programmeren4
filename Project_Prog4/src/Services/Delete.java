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
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Benjamin
 */
public class Delete {

    public boolean DeleteReservatie(long id) {
        try {
            Zoeken z = new Zoeken();
            Reservatie g = z.ZoekReservatieByID(id);
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("Project_Prog4PUS");
            EntityManager em = emf.createEntityManager();

            EntityTransaction trans = em.getTransaction();
            trans.begin();

//    TypedQuery<Reservatie> queryReservatie = em.createQuery("DELETE FROM Reservatie p WHERE p.reservatieID = :Id", Reservatie.class);
//    queryReservatie.setParameter("Id", r.getId()).executeupdate();
            trans.commit();
            em.close();
            emf.close();
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public boolean DeleteGerechten(int id) {
           try
           {
               Zoeken z = new Zoeken();
               Gerechten g = z.ZoekGerechtenByID(id);
               EntityManagerFactory emf = Persistence.createEntityManagerFactory("Project_Prog4PUS");
               EntityManager em = emf.createEntityManager();
               EntityTransaction trans = em.getTransaction();
               
               trans.begin();
               
               TypedQuery<Gerechten> query = em.createQuery("DELETE FROM Gerechten g WHERE g.gerechtenID = :Id", Gerechten.class);
               query.setParameter("Id", g.getId()).executeUpdate();
               
               trans.commit();
               em.close();
               emf.close();
               return  true;
           }
           catch(Exception ex){System.out.println(ex.getMessage());
           return false;
           }
    }
    
    public boolean DeleteGebruiker(int id)
    {
        try
           {
               Zoeken z = new Zoeken();
               Gebruiker g = z.ZoekGebruikerByID(id);
               EntityManagerFactory emf = Persistence.createEntityManagerFactory("Project_Prog4PUS");
               EntityManager em = emf.createEntityManager();
               EntityTransaction trans = em.getTransaction();
               
               trans.begin();
               
               TypedQuery<Gebruiker> query = em.createQuery("DELETE FROM Gebruiker g WHERE g.gebruikerID = :Id", Gebruiker.class);
               query.setParameter("Id", g.getId()).executeUpdate();
               
               trans.commit();
               em.close();
               emf.close();
               return  true;
           }
           catch(Exception ex){System.out.println(ex.getMessage());
           return false;
           }
    }
}
