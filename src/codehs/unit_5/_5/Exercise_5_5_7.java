package codehs.unit_5._5;

public class Exercise_5_5_7 {
    public static class Routine {
        private double school;
        private double sleep;
        private double friends;
        private double hobbies;

        public Routine() {
            this(0, 0, 0, 0);
        }

        public Routine(double school, double sleep, double friends, double hobbies) {
            this.school = school;
            this.sleep = sleep;
            this.friends = friends;
            this.hobbies = hobbies;
        }

        public void printTotal() {
            System.out.println("How You Spend Your Week:");
            System.out.println("At school: " + (7 * school));
            System.out.println("Sleeping: " + (7 * sleep));
            System.out.println("With Friends: " + (7 * friends));
            System.out.println("Doing fun stuff: " + (7 * hobbies));
            System.out.println("You're busy " + (7 * (school + sleep + friends + hobbies)) + " hours a week!");
        }

        public double getSchool() {
            return school;
        }

        public double getSleep() {
            return sleep;
        }

        public double getFriends() {
            return friends;
        }

        public double getHobbies() {
            return hobbies;
        }

        public void setSchool(double school) {
            this.school = school;
        }

        public void setSleep(double sleep) {
            this.sleep = sleep;
        }

        public void setFriends(double friends) {
            this.friends = friends;
        }

        public void setHobbies(double hobbies) {
            this.hobbies = hobbies;
        }
    }

    public static void main(final String[] args) {
        final Routine myWeek = new Routine();

        myWeek.setSchool(8);
        myWeek.setHobbies(2);
        myWeek.setFriends(2.5);
        myWeek.setSleep(8);

        // Prints the totals for the WHOLE WEEK
        myWeek.printTotal();
    }
}
