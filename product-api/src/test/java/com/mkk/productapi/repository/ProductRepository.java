package com.mkk.productapi.repository;

import com.mkk.productapi.entity.Product;
import org.postgresql.core.SqlCommand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Connection;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}

//public List<Object> findAll(){
//    String sql="Select * From product";
//    Class.forName("MySQL");
//    Connection c = new Cnn("connection string");
//    Statement sqlc = c.createStatement(sql);
//    Reader r = new Reader(sqlc);
//    List<object> l = new ArrayList();
//    while(r.Read()){
//        object x = new obj();
//        x.sadfasdf=r.get(1);
//        .
//        .
//        .
//        .
//        l.add(x)
//    }
//    return l;
//}

// Row Data Gateway
// Table Data Gateway
// Data Mapper