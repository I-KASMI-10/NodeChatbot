package net.vpc;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.vpc.Client;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-15T01:00:53")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, String> password;
    public static volatile SingularAttribute<Account, Double> balance;
    public static volatile SingularAttribute<Account, String> accounttype;
    public static volatile SingularAttribute<Account, Client> client;
    public static volatile SingularAttribute<Account, Long> id;
    public static volatile SingularAttribute<Account, String> login;

}