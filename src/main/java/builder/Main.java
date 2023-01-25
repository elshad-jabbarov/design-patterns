package builder;

public class Main {
    public static void main(String[] args) {
        NutritionFacts build = new NutritionFacts.Builder(10, 8).calories(100).build();
        Car car = new Car.Builder("bmw", "f30").build();
    }
}
