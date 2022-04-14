

package Klasy;

public class Human {
    private String eyeColour;
    private int age;
    private double height;
    private double weight;

    public Human(String eyeColour, int age, double height, double weight) {
        this.eyeColour = eyeColour;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void ustawDane(String eyeColour, int age, double weight, double height) {
        this.age = age;
        this.eyeColour = eyeColour;
        this.weight = weight;
        this.height = height;
    }
}


