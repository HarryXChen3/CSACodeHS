package codehs.unit_5._4;

public class Exercise_5_4_7 {
    public static class Dragon {
        private final String name;
        private int level;
        private boolean canBreatheFire;

        public Dragon(final String name, final int level) {
            this.name = name;
            this.level = level;
            this.canBreatheFire = computeCanBreatheFire();
        }

        private boolean computeCanBreatheFire() {
            return level >= 70;
        }

        public String getName() {
            return name;
        }

        public int getLevel() {
            return level;
        }

        public boolean isFireBreather() {
            return canBreatheFire;
        }

        public void attack() {
            if (canBreatheFire) {
                System.out.println(">>>>>>>>>>");
                System.out.println(">>>>>>>>>>>>>>");
                System.out.println(">>>>>>>>>>>>>>");
                System.out.println(">>>>>>>>>>");
            } else
                System.out.println("~ ~ ~");
        }

        public void gainExperience() {
            this.level += 10;
            this.canBreatheFire = computeCanBreatheFire();
        }
    }
}
