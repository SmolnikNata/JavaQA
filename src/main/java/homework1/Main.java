package homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Person tim = new Person();
//        tim.setFullName("TIM JONSON");
//        tim.setAge(25);
//        System.out.println(tim.getFullName());
//        System.out.println(tim.getAge());
//        tim.move();
//
//
//        Person jan = new Person("Jan Cobolt", 12);
//        System.out.println(jan.getAge());
//        System.out.println(jan.getFullName());
//        jan.talk();

        Phone saamsung = new Phone(1234556, "samsung",140);
        System.out.print("MODEL " + saamsung.getModel());
        System.out.print("  WEIGHT   " + saamsung.getWeight());
        System.out.println("  NUMBER " + saamsung.getNumer());
        saamsung.receveCall("ALEX");
//

        Phone xiaomi = new Phone(4687456, "xiaomi",180);
        System.out.print("MODEL " + xiaomi.getModel());
        System.out.print("  WEIGHT   " + xiaomi.getWeight());
        System.out.println("  NUMBER " + xiaomi.getNumer());
        xiaomi.receveCall("TOM");

        Phone honor = new Phone(643127549, "honor ",170);
        System.out.print("MODEL   " + honor .getModel());
        System.out.print("WEIGHT   " + honor .getWeight());
        System.out.println("  NUMBER " + honor .getNumer());
        honor.receveCall("STIF");





    }
}
