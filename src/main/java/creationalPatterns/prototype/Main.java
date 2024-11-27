package creationalPatterns.prototype;

public class Main {

    public static void main(String[] args) {
        Car originalCar = new Car("Tesla", "Model S", 2023, "Red");
        System.out.println("Original Car: " + originalCar);

        Car clonedCar = originalCar.clone();
        System.out.println("Cloned Car: " + clonedCar);


        // Modify copy not original
        clonedCar.setColor("Blue");
        System.out.println("Modified Cloned Car: " + clonedCar);
        System.out.println("Original Car remains unchanged: " + originalCar);
    }
}
