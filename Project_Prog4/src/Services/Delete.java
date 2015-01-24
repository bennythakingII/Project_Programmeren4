/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;


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
public class Delete
{
public boolean DeleteReservatie (long id) 
{
    try
    {
    Zoeken z = new Zoeken();
    Reservatie g = z.ZoekReservatieByID(id);
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Project_Prog4PU");
    EntityManager em = emf.createEntityManager();
    
    EntityTransaction trans = em.getTransaction();
    trans.begin();
    
    TypedQuery<Reservatie> queryReservatie = em.createQuery("DELETE FROM Reservatie p WHERE p.reservatieID = :Id", Reservatie.class);
    queryReservatie.setParameter("Id", r.getId()).executeupdate();
    
    trans.commit();
    em.close();
    emf.close();
    return true;    
            }
    catch (Exception ex)
    {
        System.out.println(ex.getMessage());
        return false;
    }
}
}
