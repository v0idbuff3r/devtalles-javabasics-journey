package s05oop;

import utilities.ConsoleStyle;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Ford Mustang", "GT", 1997);

        car.setYear(2000);
        System.out.println(ConsoleStyle.getBrightMagenta(car.toString()));
    }
}
