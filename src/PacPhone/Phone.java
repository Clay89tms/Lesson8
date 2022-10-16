package PacPhone;

public class Phone {
    public String number;
    public String model;
    public int weight;
    public String numberN;

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

    public String getNumber() {
        return this.numberN;
    }

    public void setNumber(String numberN) {
        this.numberN = " c номера: " + numberN;
    }

    public void receiveCall(String name) {
        System.out.print("Заонит {" + name + "}");
    }
    public void receiveCall(String name, String number){
        System.out.println("Имя Звонящего: " + name + "; Номер телефона: " + number);
    }
    public void sendMessage(){}
}