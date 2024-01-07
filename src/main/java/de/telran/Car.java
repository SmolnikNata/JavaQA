package de.telran;

public class Car {
    private String model;
    private String color;
    private Integer speed;
    private Integer weight;

    public Car(String model, String color, Integer speed, Integer weight){
        this.model = model;
        this.color = color;
        if (speed < 0 && speed > 350) {
            System.out.println("Incorrect speed");
        } else {
            this.speed = speed;
        }
        if (weight >= 900 && weight <= 5000){
            this.weight = weight;
        } else {
            System.out.println("Incorrect weight");
        }
    }

    public void setSpeed(Integer speed) {
        if (speed < 0 && speed > 350) {
            System.out.println("Incorrect speed");
        } else {
            this.speed = speed;
        }
    }

    public String getModel(){
        return this.model;
    }

    public String getColor(){
        return this.color;
    }

    public Integer getSpeed(){
        return this.speed;
    }

    public Integer getWeight(){
        return this.weight;
    }
}
