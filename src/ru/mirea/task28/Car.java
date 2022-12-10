package ru.mirea.task28;

public class Car {
    public String brand, model, type;
    private final Wheels wheels=new Wheels("Toyo");

    public Car() { }

    Car(String brand, String model){
        this.brand=brand;
        this.model=model;
    }

    Car(String brand, String model, String type){
        this.brand=brand;
        this.model=model;
        this.type=type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void engineSound(){
        System.out.println("Звук двигателя");
    }

    private class Wheels { //Вложенный внутренний класс
        private String manufacturer;

        private Wheels(String manufacturer){
            this.manufacturer=manufacturer;
        }

        @Override
        public String toString() {
            return "Wheels{" +
                    "manufacturer='" + manufacturer + '\'' +
                    '}';
        }
    }

    public static class Sedan extends Car { //Вложенный статический класс
        Sedan(String brand, String model) {
            super(brand, model);
            setType("Sedan");
        }
    }

    public class SRCar extends Car { //Вложенный класс

        SRCar(String brand, String model) {
            super(brand, model);
            setType("StreetRace car");
        }

        public void engineSound(){
            System.out.println("Рев двигателя");
        }
    }

    public static void main(String[] args) {

        Car sedan=new Sedan("Audi", "A4");
        Car notAnonSRCar=new Car().new SRCar("Mitsubishi", "Lancer10");
        Car anonSRCar=new Car("Honda", "Civic", "SR car") { //Анонимный класс
            @Override
            public void engineSound() {
                System.out.println("Рев двигателя");
            }
        };

        System.out.println(sedan.toString());
        sedan.engineSound();

        System.out.println(anonSRCar.toString());
        anonSRCar.engineSound();

        System.out.println(notAnonSRCar.toString());
        notAnonSRCar.engineSound();

    }


    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", " + wheels.toString() +
                '}';
    }
}
