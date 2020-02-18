package com.mongodb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;

@SpringBootApplication
public class MongodbApplication implements CommandLineRunner {

  @Autowired
  private CustomerRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(MongodbApplication.class, args);
  }

  @Autowired
@SuppressWarnings("unchecked")
public <S> void run(char[] customer, String... args) throws Exception {

    repository.deleteAll();

    // save a couple of customers
    ((CrudRepository<Customer, String>) repository).saveAll((Iterable<S>) new Customer("Alice", "Smith"));
    ((CrudRepository<Customer, String>) repository).saveAll((Iterable<S>) new Customer("Bob", "Smith"));

    // fetch all customers
    System.out.println("Customers found with findAll():");
    System.out.println("-------------------------------");
    System.out.println(extracted(customer));
    System.out.println();

    // fetch an individual customer
    System.out.println("Customer found with findByFirstName('Alice'):");
    System.out.println("--------------------------------");
    System.out.println(((Customer) repository).findByFirstName("Alice"));

    System.out.println("Customers found with findByLastName('Smith'):");
    System.out.println("--------------------------------");
    List<Customer> findByLastName = ((Customer) repository).findByLastName("Smith");
	for (int i = 0; i < findByLastName.size(); i++) {
		Customer customer1 = findByLastName.get(i);
		System.out.println(customer1);
	}

  }

private char[] extracted(char[] customer) {
	return customer;
}

@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	
}

}