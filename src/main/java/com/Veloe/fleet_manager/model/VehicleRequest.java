package com.Veloe.fleet_manager.model;

import com.Veloe.fleet_manager.model.VehicleType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class VehicleRequest {

    @NotBlank(message = "Marca é obrigatório!")
    private String brand;

    @NotBlank(message = "Modelo é obrigatório!")
    private String model;

    @NotBlank(message = "Placa é obrigatório!")
    private Long licensePlate;

    @NotBlank(message = "O tipo de veículo é obrigatório!")
    private VehicleType type;

    @NotBlank(message = "Dono do veículo é obrigatório!")
    private long ownerId;

    public VehicleRequest(){}

    public VehicleRequest(String brand, String model, Long licensePlate, VehicleType type, long ownerId) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.type = type;
        this.ownerId = ownerId;
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public Long getLicensePlate() { return licensePlate; }
    public void setLicensePlate(Long licensePlate) { this.licensePlate = licensePlate; }

    public VehicleType getType() { return type; }
    public void setType(VehicleType type) { this.type = type; }

    public long getOwnerId() { return ownerId; }
    public void setOwnerId(long ownerId) { this.ownerId = ownerId; }

}
