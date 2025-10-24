package com.Veloe.fleet_manager.repository;

import com.Veloe.fleet_manager.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface VehicleRequest extends JpaRepository<Vehicle, Long> {

    Optional<Vehicle> findByLicensePlate(String licensePlate);

    List<Vehicle> findCustomerById(long id);

    boolean existsByLicensePlate(String licensePlate);

    @Query("SELECT v FROM Vehicle v WHERE v.owner.id = :ownerId")
    List<Vehicle> findVehiclesByOwnerId(@Param("ownerId") Long ownerId);

    @Query("SELECT COUNT(v) FROM Vehicle v WHERE v.customer.id = :customerId")
    long countByCustomerId(@Param("customerId") long customerId);
}