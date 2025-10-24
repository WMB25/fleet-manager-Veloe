package com.Veloe.fleet_manager.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório!")
    @Column(nullable = false)
    private String name;

    @NotBlank(message = "Número da carteira de motorista é obrigatório!")
    @Column(unique = true, nullable = false)
    private String driverLicenseNumber;

    private String phoneNumber;
    private String email;

    public Customer() {}

    public Customer(Long id, String name, String driverLicenseNumber, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.driverLicenseNumber = driverLicenseNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Long GetId() { return id; }
    public void SetId(Long id) { this.id = id; }

    public String GetName() { return name; }
    public void SetName(String name) { this.name = name; }

    public String GetDriverLicenseNumber() { return driverLicenseNumber; }
    public void SetDriverLicenseNumber(String driverLicenseNumber) { this.driverLicenseNumber = driverLicenseNumber; }

    public String GetPhoneNumber() { return phoneNumber; }
    public void SetPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String GetEmail() { return email; }
    public void SetEmail(String email) { this.email = email; }
}

