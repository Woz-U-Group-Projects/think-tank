package com.mongodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Customer extends MongoRepository<Customer, String> {

  public Customer findByFirstName(String firstName);
  public List<Customer> findByLastName(String lastName);

}
