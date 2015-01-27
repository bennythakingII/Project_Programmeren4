/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAL.*;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Benjamin
 */
public class Opslaan
{

    public int OpslaanGebruiker(DAL.Gebruiker gebruiker)
    {
    
        try
        {
            Zoeken z = new Zoeken();
            long l = z.ZoekGebruikerDoorNaam(gebruiker.getNaam()).getId();
            System.out.println(l);
            if(l==0)
            {
//                long id = 0;
//                List<Gebruiker> listresult = new AanmakenList().ListGebruiker();
//                if(!listresult.isEmpty())
//                {
//                    for(Gebruiker g : listresult)
//                    {
//                    if(id < g.getId())
//                    {
//                        id = g.getId();
//                    }
//                    }
//                    id = id + 1;
//                }
//                else
//                {
//                    id = 1;
//                }
                
//                gebruiker.setId(id);
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("Project_Prog4PUS");
                EntityManager em = emf.createEntityManager();
                EntityTransaction trans = em.getTransaction();
                
                trans.begin();
                em.persist(gebruiker);
                trans.commit();
                em.clear();
                em.close();
                emf.close();
                return 0;
                
            }
            
            else {return 2;}
           
        }
        
        catch(Exception ex)
        {
            return 1;
        }  
        
    }
    
    //Gerechten aanmaken
    
     public int OpslaanGerechten(DAL.Gerechten gerechten)
    {
    
        try
        {
            Zoeken z = new Zoeken();
            long l = z.ZoekGebruikerDoorNaam(gerechten.getGerechtNaam()).getId();
            System.out.println(l);
            if(l==0)
            {
               
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("Project_Prog4PUS");
                EntityManager em = emf.createEntityManager();
                EntityTransaction trans = em.getTransaction();
                
                trans.begin();
                em.persist(gerechten);
                trans.commit();
                em.clear();
                em.close();
                emf.close();
                return 0;
                
            }
            
            else {return 2;}
           
        }
        
        catch(Exception ex)
        {
            return 1;
        }  
        
    }
    
}
