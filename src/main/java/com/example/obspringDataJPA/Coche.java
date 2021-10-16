package com.example.obspringDataJPA;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// @Entity -  para indicar que una TABLA en nuestra BBDD
@Entity

public class Coche {

    // 1. Atributos
    // atributos encapsulados por private
    // @Id es para decirle que es una clave primaria
    @Id

    // @GeneratedValue(strategy = GenerationType.IDENTITY) es para que me genere la BBDD el valor del ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String manufacturer;
    private String model;
    private Integer year;

    // 2. constructores

    public Coche() {}

    public Coche(Long id, String manufacturer, String model, Integer year) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    // 3. getter y setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    // to string con concat

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
