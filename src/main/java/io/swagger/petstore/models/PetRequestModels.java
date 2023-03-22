package io.swagger.petstore.models;

import java.util.List;


// Se crea modelo para la clase de la peticion
public class PetRequestModels {

    private Integer id;
    private Integer petId;
    private Integer quantity;
    private String shipDate;
    private String status;
    private Boolean complete;


    // Se inicializan los valores de la clase
    public PetRequestModels(List<List<String>> listPetRequest){
        this.id = Integer.valueOf(listPetRequest.get(0).get(0));
        this.petId = Integer.valueOf(listPetRequest.get(0).get(1));
        this.quantity = Integer.valueOf(listPetRequest.get(0).get(2));
        this.shipDate =listPetRequest.get(0).get(3);
        this.status = listPetRequest.get(0).get(4);
        this.complete = Boolean.valueOf(listPetRequest.get(0).get(5));
    }

    // se crean los getter an setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }
}
