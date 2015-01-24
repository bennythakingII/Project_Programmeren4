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

public class AanmakenList 
{
    
    //aanmaken van de List
    
    public java.util.List<Gebruiker> ListGebruiker()
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Project_Prog4PU");
        EntityManager em = emf.createEntityManager();
            
        TypedQuery<Gebruiker> query = em.createQuery("SELECT d FROM Gebruiker d", Gebruiker.class);
        java.util.List<Gebruiker> list = query.getResultList();
        return list;
    }
    
    public java.util.List<Gerechten> ListGerechten()
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Project_Prog4PU");
        EntityManager em = emf.createEntityManager();
            
        TypedQuery<Gerechten> query = em.createQuery("SELECT d FROM Gerechten d", Gerechten.class);
        java.util.List<Gerechten> list = query.getResultList();
        return list;
    }
    
    public java.util.List<Reservatie> ListReservatie()
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Project_Prog4PU");
        EntityManager em = emf.createEntityManager();
            
        TypedQuery<Reservatie> query = em.createQuery("SELECT d FROM Reservatie d", Reservatie.class);
        java.util.List<Reservatie> list = query.getResultList();
        return list;
    }
    
    public java.util.List<Gebruiker> ListGebruikerOpNaam(String naam)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Project_Prog4PU");
        EntityManager em = emf.createEntityManager();
            
        TypedQuery<Gebruiker> query = em.createQuery("SELECT d FROM Gebruiker d WHERE d.naam = :Naam", Gebruiker.class).setParameter("Naam", naam);
        java.util.List<Gebruiker> list = query.getResultList();
        return list;
    }
    
    public java.util.List<Gerechten> ListGerechtenOpNaam(String naam)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Project_Prog4PU");
        EntityManager em = emf.createEntityManager();
            
        TypedQuery<Gerechten> query = em.createQuery("SELECT d FROM Gerechten d WHERE d.naam = :GerechtNaam", Gerechten.class).setParameter("Naam", naam);
        java.util.List<Gerechten> list = query.getResultList();
        return list;
    }
}
