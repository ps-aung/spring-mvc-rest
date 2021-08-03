package com.psa.springmvcrest.repositories;

import com.psa.springmvcrest.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by PSA at 7/3/2021
 */
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
