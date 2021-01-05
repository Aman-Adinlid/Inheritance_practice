package Lexicon.se;


import Lexicon.se.model.Animal;
import Lexicon.se.model.Car;
import Lexicon.se.model.Dog;

public class App
{
    public static void main( String[] args ) {
        /*
        Dog doggy = new Dog("fofo",23.1,4,8,4);
        System.out.println(doggy.getName());
        System.out.println(doggy.getWeight());
        System.out.println(doggy.getLeg());
        System.out.println(doggy.getTeeth());
        System.out.println(doggy.getLeg());
        doggy.eat();

        System.out.println("---------------------------");


            Dog dog = new Dog();
            dog.setName("fofo");
            dog.setLeg(4);
            dog.setTeeth(7);
            dog.setWeight(22.2);
            dog.eat();
            dog.calculateAge();
        System.out.println(dog.getLeg());
        System.out.println(dog.getName());

        System.out.println("---------------------------");
        Animal anotherAnimal = new Dog("fofo",22.2,4,7,4);
        anotherAnimal.eat();
        anotherAnimal.calculateAge();
*/

        Car Audi =new Car("dream","Audi","white");
        System.out.println(Audi.toString());
        System.out.println(Audi.hashCode());

        Car Audi1 =new Car("dream","Audi","white");
        System.out.println(Audi1.toString());
        System.out.println(Audi1.hashCode());

        System.out.println(Audi.equals(Audi1));

    }

 }
