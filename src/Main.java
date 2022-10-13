import PacPhone.Phone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String pn = "";
        String pm = "";
        int w = 0;
        Scanner scanner = new Scanner(System.in);
        Phone phone1 = null;
        Phone phone2 = null;
        Phone phone3 = null;
        for (int i = 1; i < 4; i++) {
            System.out.print("Введите номер " + i + " телефона: ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextLine()) {
                pn = sc.nextLine();
                System.out.print("Введите Модель " + i + " телефона: ");
                pm = sc.nextLine();
                System.out.print("Введите Вес " + i + " телефона: ");
                w = sc.nextInt();
                System.out.println();
                switch (i) {
                    case (1):
                        phone1 = new Phone(pn, pm, w);

                        break;
                    case (2):
                        phone2 = new Phone(pn, pm, w);
                        break;
                    case (3):
                        phone3 = new Phone(pn, pm, w);
                    default:
                        break;
                }
            }

        }


        System.out.println("Номер телефона 1: " + phone1.number +
                "\nМодель телефона 1: " + phone1.model + "; Вес = " + phone1.weight + " гр.");
        System.out.println("Номер телефона 2: " + phone2.number +
                "\nМодель телефона 2: " + phone2.model + "; Вес = " + phone2.weight + " гр.");
        System.out.println("Номер телефона 3: " + phone3.number +
                "\nМодель телефона 3: " + phone3.model + "; Вес = " + phone3.weight + " гр.");
        System.out.println();
        phone1.receiveCall("Вадим");
        phone1.getNumber("375(33)111-11-11");
        phone2.receiveCall("Павел");
        phone2.getNumber("375(33)222-22-22");
        phone3.receiveCall("Саша");
        phone3.getNumber("375(33)333-33-33");
    scanner.close();
    }

}
