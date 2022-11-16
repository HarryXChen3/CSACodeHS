package codehs.unit_5._4;

public class Exercise_5_4_8 {
    public static class Meal {
        private final String name;
        private final String course;
        private final int numberOfServings;

        public Meal(final String name, final String course, final int numberOfServings) {
            this.name = name;
            this.course = course;
            this.numberOfServings = numberOfServings;
        }

        @Override
        public String toString() {
            return String.format("%s (%s)", name, course);
        }

        public String getName() {
            return name;
        }

        public String getCourse() {
            return course;
        }

        public int getNumberOfServings() {
            return numberOfServings;
        }
    }

    public static class Chef {
        private final String name;
        private final String restaurant;

        private final Meal meal;
        private final String mealName;
        private final int mealServings;
        private final String mealCourse;

        public Chef(final String name, final String restaurant, final Meal meal) {
            this.name = name;
            this.restaurant = restaurant;

            this.meal = meal;
            this.mealName = meal.getName();
            this.mealServings = meal.getNumberOfServings();
            this.mealCourse = meal.getCourse();
        }

        @Override
        public String toString() {
            return String.format("Chef %s works at %s and is best known for %s", name, restaurant, meal);
        }

        public String getName() {
            return name;
        }

        public String getRestaurant() {
            return restaurant;
        }

        public String getMealName() {
            return mealName;
        }

        public int getMealServings() {
            return mealServings;
        }

        public String getMealCourse() {
            return mealCourse;
        }
    }

    public static void main(final String[] args) {
        // Don't modify this part!
        Meal macaroni = new Meal("Mac N Cheese", "Lunch", 8);
        Chef alex = new Chef("Alex", "Juniors Cheesecake", macaroni);

        System.out.println(alex);
        System.out.println(alex.getMealName());

        // Create your own Meal and Chef here:
    }
}
