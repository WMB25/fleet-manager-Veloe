package com.Veloe.fleet_manager.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Placa é obrigatório!")
    @Column(unique = true, nullable = false)
    private String licensePlate;

    @NotBlank(message = "Modelo é obrigatório!")
    @Column(nullable = false)
    private String model;

    @NotBlank(message = "Marca é obrigatório!")
    @Column(nullable = false)
    private String brand;

    @NotBlank(message = "O tipo de veículo é obrigatório!")
    @Enumerated(EnumType.STRING)
    private VehicleType vehicleType;

    private Customer owner;

    public Vehicle() {}

    public Vehicle(Long id, String licensePlate, String model, String brand) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.model = model;
        this.brand = brand;
    }

    public Long GetId() { return id; }
    public void SetId(Long id) { this.id = id; }

    public String GetLicensePlate() { return licensePlate; }
    public void SetLicensePlate(String licensePlate) { this.licensePlate = licensePlate; }

    public String GetModel() { return model; }
    public void SetModel(String model) { this.model = model; }
    
    public String GetBrand() { return brand; }
    public void SetBrand(String brand) { this.brand = brand; }

    public VehicleType GetVehicleType() { return vehicleType; }
    public void SetVehicleType(VehicleType vehicleType) { this.vehicleType = vehicleType; }

    public Customer GetOwner() { return owner; }
    public void SetOwner(Customer owner) { this.owner = owner; }
}