package de.telran;

public class Fruit {
    private String name;      //имя фрукта
    private String country;
    private String color;
    private Integer weight;
    private Integer price;

    // создаем конструктор

    public Fruit(String name,String country,String color,Integer weight,Integer price ){

        this.name = name;
        this.country = country;
        this.color = color;
        this.weight = weight;
        this.price = price;

    }
    // создаем сеттеры , т.к будет меняться пользователем
    public void setWeight(Integer weigh){
        this.weight = weight;
    }
    public  void  setPrice(Integer price){
        this.price = price;
    }

    //гетторы для полей, которые будем получать в main
    public String getName(){
        return this.name;
    }
    public String getCountry(){
        return this.country;
    }
    public String getColor(){
        return this.color;
    }
    public Integer getWeight(){
        return this.weight;
    }
    public Integer getPrice(){
        return  this.price;
    }


}
