package Lexicon.se.model;

import java.util.Objects;

public class Car {

    private String CarName;
    private String BRAND;
    private String Color;

    public Car() {
    }

    public Car(String carName, String BRAND, String color) {
        CarName = carName;
        this.BRAND = BRAND;
        Color = color;
    }

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String carName) {
        CarName = carName;
    }

    public String getBRAND() {
        return BRAND;
    }

    public void setBRAND(String BRAND) {
        this.BRAND = BRAND;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(CarName, car.CarName) && Objects.equals(BRAND, car.BRAND) && Objects.equals(Color, car.Color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CarName, BRAND, Color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "CarName='" + CarName + '\'' +
                ", BRAND='" + BRAND + '\'' +
                ", Color='" + Color + '\'' +
                '}';
    }
}
