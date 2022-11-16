package codehs.unit_5._5;

public class Exercise_5_5_6 {
    @SuppressWarnings("unused")
    public static class Fraction {
        public static class FractionMath {
            public static Fraction add(Fraction frac1, Fraction frac2) {
                final int numerator = frac1.getNumerator() * frac2.getDenominator() +
                        frac2.getNumerator() * frac1.getDenominator();

                final int denominator = frac1.getDenominator() * frac2.getDenominator();

                return new Fraction(numerator, denominator);
            }

            public static Fraction sub(Fraction frac1, Fraction frac2) {
                return new Fraction(
                        frac1.getNumerator() * frac2.getDenominator()
                                - frac2.getNumerator() * frac1.getDenominator(),
                        frac1.getDenominator() * frac2.getDenominator()
                );
            }

            public static Fraction multiply(Fraction frac1, Fraction frac2) {
                final int numerator = frac1.getNumerator() * frac2.getNumerator();
                final int denominator = frac1.getDenominator() * frac2.getDenominator();

                return new Fraction(numerator, denominator);
            }
        }

        private int numerator;
        private int denominator;

        public Fraction(int numerator, int denominator){
            this.numerator = numerator;
            this.denominator = denominator;
        }

        /**
         * Returns value of numerator
         * @return numerator
         */
        public int getNumerator() {
            return numerator;
        }

        /**
         * Sets new value of numerator
         * @param numerator new numerator value
         */
        public void setNumerator(int numerator) {
            this.numerator = numerator;
        }

        /**
         * Returns value of denominator
         * @return denominator
         */
        public int getDenominator() {
            return denominator;
        }

        /**
         * Sets new value of denominator
         * @param denominator new denominator
         */
        public void setDenominator(int denominator) {
            this.denominator = denominator;
        }

        /**
         * Updates this fraction by adding another fraction
         * @param other Fraction to add to existing fraction
         */

        //Calculate by using the FractionMath class, then update
        //the numerator and denominator from the returned Fraction
        public void add(Fraction other) {
            final Fraction result = FractionMath.add(this, other);
            setNumerator(result.getNumerator());
            setDenominator(result.getDenominator());
        }

        public void subtract(Fraction other) {
            final Fraction result = FractionMath.sub(this, other);
            setNumerator(result.getNumerator());
            setDenominator(result.getDenominator());
        }

        /**
         * Updates this fraction by multiplying another fraction
         * @param other Fraction to multiple to existing fraction
         */

        //Calculate by using the FractionMath class, then update
        //the numerator and denominator from the returned Fraction
        public void multiply(Fraction other){
            final Fraction result = FractionMath.multiply(this, other);
            setNumerator(result.getNumerator());
            setDenominator(result.getDenominator());
        }

        /**
         * Prints fraction as numerator / denominator
         * Example: 1 / 2
         */

        public String toString(){
            return String.format("%d / %d", numerator, denominator);
        }
    }

    public static void main(final String[] args) {
        final Fraction first = new Fraction(1, 2);
        final Fraction second = new Fraction(1, 3);
        System.out.println();

        System.out.println("BEFORE:");
        System.out.println("first: " + first);
        System.out.println("second: " + second);

        first.multiply(second);

        System.out.println("AFTER:");

        System.out.println("first: " + first);
        System.out.println("second: " + second);
    }
}
