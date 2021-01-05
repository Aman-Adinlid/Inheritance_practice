package Lexicon.se.model;

public abstract class Animal {

    private String Name;
    public double Weight;

    public Animal() {
    }

    public Animal(String name, double weight) {
        Name = name;
        Weight = weight;
    }

    public abstract void eat();


    public int calculateAge() {
        return 72;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }
}
