package DAL;

import DAL.Gebruiker;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-27T17:45:35")
@StaticMetamodel(Reservatie.class)
public class Reservatie_ { 

    public static volatile SingularAttribute<Reservatie, Long> reservatieid;
    public static volatile SingularAttribute<Reservatie, String> date;
    public static volatile SingularAttribute<Reservatie, BigInteger> tableid;
    public static volatile SingularAttribute<Reservatie, Integer> time;
    public static volatile SingularAttribute<Reservatie, Integer> plaatsen;
    public static volatile SingularAttribute<Reservatie, Gebruiker> gebruikerGebruikerid;

}