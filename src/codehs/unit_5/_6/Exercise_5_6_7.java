package codehs.unit_5._6;

public class Exercise_5_6_7 {
    public static class Car {
        private final double efficiency;
        private double gas;
        private final double tankCapacity;
        private double totalMilesDriven;

        public Car(final double efficiency, final double tankCapacity) {
            this.efficiency = efficiency;
            this.tankCapacity = tankCapacity;
        }

        public void addGas() {
            System.out.println("Filling up ...");
            this.gas = this.tankCapacity;
        }

        public void addGas(final double amount) {
            System.out.println("Adding gas ...");
            this.gas += Math.min(amount, tankCapacity - gas);
        }

        public double getTotalMilesDriven() {
            return totalMilesDriven;
        }

        public boolean canDrive(final double distance) {
            return (distance <= milesAvailable());
        }

        public void drive(final double distance) {
            if (!canDrive(distance)) {
                System.out.println("Can't drive " + distance + ". That's too far!");
                return;
            }

            System.out.println("Driving " + distance);
            this.gas -= (distance / efficiency);
            this.totalMilesDriven += distance;
        }

        public double milesAvailable() {
            return gas * efficiency;
        }

        public double getGas() { return gas; }
    }

    public static void main(final String[] args) {
        final Car car = new Car(20, 15);
        car.addGas();

        System.out.println("Miles available: " + car.milesAvailable());
        car.drive(100);

        System.out.println("Miles available: " + car.milesAvailable());
        car.addGas(2);

        System.out.println("Miles available: " + car.milesAvailable());
        car.drive(1000);

        car.drive(200);
        System.out.println("Gas remaining: " + car.getGas());
        System.out.println("Total Miles Driven: " + car.getTotalMilesDriven());
    }
}
