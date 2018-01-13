package net.vpc;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.vpc.Account;
import net.vpc.TransactionsClient;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-15T01:00:53")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile SingularAttribute<Client, String> fname;
    public static volatile SingularAttribute<Client, String> lname;
    public static volatile SetAttribute<Client, TransactionsClient> transactionClient;
    public static volatile SingularAttribute<Client, Integer> phone;
    public static volatile SingularAttribute<Client, String> adresse;
    public static volatile SingularAttribute<Client, Integer> cin;
    public static volatile SingularAttribute<Client, Long> id;
    public static volatile SetAttribute<Client, Account> account;

}