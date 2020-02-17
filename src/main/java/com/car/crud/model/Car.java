package com.car.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {

    private long id;
    private String brand;
    private String name; 
    private String model; 
    private int year; 
    private float price;
 
    public Car() {
  
    }
 
    public Car(String brand, String name, String model, int year, float price) {
         this.brand = brand;
         this.name = name;
         this.model = model;
         this.year = year;
         this.price = price;
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    
    @Column(name = "brand", nullable = false)
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
 
    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
 
    @Column(name = "model", nullable = false)
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
 
    @Column(name = "year", nullable = false)
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    
    @Column(name = "price", nullable = false)
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car [id=" + id + ", brand=" + brand + ", name=" + name + ", model=" + model
        		+ ", year=" + year + ", price=" + price + "]";
    }
 
}