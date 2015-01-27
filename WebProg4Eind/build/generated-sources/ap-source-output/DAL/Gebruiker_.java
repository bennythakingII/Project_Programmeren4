package DAL;

import DAL.Reservatie;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-27T17:45:35")
@StaticMetamodel(Gebruiker.class)
public class Gebruiker_ { 

    public static volatile CollectionAttribute<Gebruiker, Reservatie> reservatieCollection;
    public static volatile SingularAttribute<Gebruiker, String> password;
    public static volatile SingularAttribute<Gebruiker, String> telefoonnummer;
    public static volatile SingularAttribute<Gebruiker, Short> admin;
    public static volatile SingularAttribute<Gebruiker, String> naam;
    public static volatile SingularAttribute<Gebruiker, Long> gebruikerid;
    public static volatile SingularAttribute<Gebruiker, String> email;

}