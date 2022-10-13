package PacPhone;

public class Phone {
    public String number;
    public String model;
    public int weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.print("Заонит {" + name + "}");
    }
    public void getNumber(String numberN){
        System.out.println(" c номера: " + numberN);
    }
}
