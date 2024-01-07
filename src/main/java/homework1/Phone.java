package homework1;

public class Phone {
    private Integer number;
    private String model;
    private Integer weight;

    public Phone(Integer number, String model, Integer weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;

    }

    public String getModel() {
        return this.model;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public Integer getNumer() {
        return this.number;
    }

    public void receveCall(String nameCall){
        System.out.println("Звонит " +  nameCall);
    }




}



