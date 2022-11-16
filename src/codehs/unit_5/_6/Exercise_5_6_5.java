package codehs.unit_5._6;

public class Exercise_5_6_5 {
    public static class Distance {
        public static final double KM_MILE_CONVERSION = 1.609;
        public static final double KM_LEAGUE_CONVERSION = 5.556;

        private final double kilometers;

        public Distance(final double kilometers) {
            this.kilometers = kilometers;
        }

        public double toMiles() { return kilometers / KM_MILE_CONVERSION; }
        public double toLeagues() { return kilometers / KM_LEAGUE_CONVERSION; }

        public double doubleMiles() { return 2 * toMiles(); }

        public double getKilometers() { return kilometers; }
    }

    public static void main(final String[] args) {
        final Distance distance_0 = new Distance(10);
        final Distance distance_1 = new Distance(15);
        final Distance distance_2 = new Distance(20);

        System.out.println(distance_0.getKilometers() + " km = " + distance_0.toMiles() + " miles");
        System.out.println(distance_1.getKilometers() + " km = " + distance_1.toLeagues() + " leagues");
        System.out.println(distance_2.getKilometers() + " km (one way) = " + distance_1.doubleMiles() + " miles (round trip)");
    }
}
