package creationalPatterns.builder;

public class Main {

    public static void main(String[] args){

        Car car = new Car.Builder()
                .make("Tesla")
                .model("Model S")
                .year(2023)
                .color("Red")
                .isElectric(true)
                .build();

        System.out.println(car.toString() );
    }
}
