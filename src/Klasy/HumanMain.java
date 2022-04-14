package Klasy;

public class HumanMain {
    public static void main(String[] args) {
        Human human1= new Human("Green",20,180,200);
        Human human2= new Human("brown",23,182,231);



        System.out.println("Uczestnik"+ human1.getAge()+"Waży " + human1.getWeight());
    }
}
