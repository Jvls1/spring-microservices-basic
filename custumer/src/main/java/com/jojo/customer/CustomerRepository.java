package com.jojo.customer;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author João Vitor Lopes
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
