package com.wanghongen.cassandra.test;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

/**
 * Created by wanghongen on 2018/3/4
 */
public class CreateKeySpace {

  public static void main(String[] args) {
    //Query
    String query = "CREATE KEYSPACE tp1 WITH replication "
        + "= {'class':'SimpleStrategy', 'replication_factor':1};";

    //creating Cluster object
    Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();

    //Creating Session object
    Session session = cluster.connect();

    //Executing the query
    session.execute(query);

    //using the KeySpace
    session.execute("USE tp");
    System.out.println("Keyspace created");
  }


}
