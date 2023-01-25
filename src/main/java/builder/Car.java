package builder;

public class Car {
    private final String model;
    private final String name;

    private final Integer wheelCount;


    public static class Builder {
        private final String model;
        private final String name;

        private Integer wheelCount = 4;

        public Builder(String model, String name) {
            this.model = model;
            this.name = name;
        }

        public Builder wheelCount(Integer wheelCount) {
            this.wheelCount = wheelCount;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    private Car(Builder builder) {
        this.model = builder.model;
        this.name = builder.name;
        this.wheelCount = builder.wheelCount;
    }
}
