package com.wanghongen.cassandra.test;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

/**
 * Created by wanghongen on 2018/3/4
 */
public class CreateTable {

  public static void main(String[] args) {
    //Query
    String query = "CREATE TABLE emp2(emp_id int PRIMARY KEY, "
        + "emp_name text, "
        + "emp_city text, "
        + "emp_sal varint, "
        + "emp_phone varint );";

    //Creating Cluster object
    Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();

    //Creating Session object
    Session session = cluster.connect("test");

    //Executing the query
    session.execute(query);

    System.out.println("Table created");
  }

}
