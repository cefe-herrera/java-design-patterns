package creationalPatterns.builder;

public class Car {
    private final String make;
    private final String model;
    private final int year;
    private final String color;
    private final boolean isElectric;

    private Car(Builder builder){
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.isElectric = builder.isElectric;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public static class Builder{
        private String make;
        private String model;
        private int year;
        private String color;
        private boolean isElectric;

        public Builder make (String make){
            this.make = make;
            return this;
        }

        public Builder model(String model){
            this.model = model;
            return this;
        }

        public Builder year(int year){
            this.year = year;
            return this;
        }

        public Builder color(String color){
            this.color = color;
            return this;
        }

        public Builder isElectric(boolean isElectric){
            this.isElectric = isElectric;
            return this;
        }

        /*
            Method to build car
         */
        public Car build(){
            return new Car(this);
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", isElectric=" + isElectric +
                '}';
    }

}
