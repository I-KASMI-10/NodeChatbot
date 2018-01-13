package net.vpc;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.vpc.Client;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-15T01:00:53")
@StaticMetamodel(TransactionsClient.class)
public class TransactionsClient_ { 

    public static volatile SingularAttribute<TransactionsClient, String> description;
    public static volatile SingularAttribute<TransactionsClient, Double> montant;
    public static volatile SingularAttribute<TransactionsClient, Long> id;
    public static volatile SingularAttribute<TransactionsClient, Date> transactionDate;
    public static volatile SingularAttribute<TransactionsClient, Client> clienttr;

}