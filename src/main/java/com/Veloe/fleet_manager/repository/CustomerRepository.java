package com.Veloe.fleet_manager.repository;


import com.Veloe.fleet_manager.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByLicenseDrive(String licenseDrive);

    boolean existsByLicenseDrive(String licenseDrive);

    Optional<Customer> findByNameContainingIgnoreCase(String name);
}