package Lexicon.se.model;

public class Dog extends Animal{

    private int Leg;
    private int Teeth;
    private int leg;

    public Dog() {
    }

    public Dog(String name, double weight, int leg, int teeth, int leg1) {
        super(name, weight);
        Leg = leg;
        Teeth = teeth;
        this.leg = leg;
    }

    public int getLeg() {
        return Leg;
    }

    public void setLeg(int leg) {
        Leg = leg;
    }

    public int getTeeth() {
        return Teeth;
    }

    public void setTeeth(int teeth) {
        Teeth = teeth;
    }

    @Override
    public void eat() {

    }

    @Override
    public int calculateAge() {
        return super.calculateAge();
    }

}

