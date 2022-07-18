package entity;

/**
 * @author Egor Yahimovich
 * @version 1.0
 */

public class Car {

    private String name;
    private String color;
    private double weight;
    private int maxSpeed;

    /**
     * Number of class instances created
     */

    private static int instanceCount;

    public Car() {
        instanceCount++;
    }

    public Car(String name, String color, double weight, int maxSpeed) {
        this();
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    @Override
    public String toString() {
        return "Car" +
                "\nName: " + getName() +
                "\nColor: " + getColor() +
                "\nWeight: " + getWeight() + " kg" +
                "\nMax Speed: " + getMaxSpeed() + " km/h";
    }
}
