package controller;

import entity.ArrayListUser;
import entity.Car;
import impl.ListUser;

import java.util.Arrays;

/**
 * @author Egor Yahimovich
 * @version 1.0
 */

public class Controller {

    /**
     * Starts program
     */

    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(Car.getInstanceCount());

        ListUser<String> list = new ArrayListUser<>();

        list.add("first");
        list.add("second");
        list.add("third");

        list.delete(1);
        System.out.println(Arrays.toString(list.getAll()));
        System.out.println("Get " + list.get(1) + "\n" + "Size: " + list.size());
    }
}
