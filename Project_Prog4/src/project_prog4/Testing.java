/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_prog4;

import DAL.*;

/**
 *
 * @author Benjamin
 */
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class Testing {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gebruiker g = new Gebruiker();
        g.setNaam("Benjamin");
        g.setPassword("Hallo");
        
        
        Totaal t = new Totaal();
        t.setGebruikerID(Long.parseLong("55"));
        t.setGerechtendID(Long.parseLong("69"));
        t.setTotaal(2);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Project_Prog4PUS");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        em.persist(g);
        em.persist(t);
        trans.commit();
        em.clear();
        em.close();
        emf.close();
        // TODO code application logic here
    }
    
}
