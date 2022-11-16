package codehs.unit_5._4;

public class Exercise_5_4_6 {
    public static class Dragon {
        private final String attack;
        private final int level;

        // Write the constructor here!
        public Dragon(final int level, final String attack) {
            this.level = level;
            this.attack = attack;
        }
        // Put getters here
        public String getAttack() {
            return attack;
        }

        public int getLevel() {
            return level;
        }
        // Put other methods here
        public String fight() { return attack.repeat(level); }

        // String representation of the object
        public String toString()
        {
            return "Dragon is at level " + level + " and attacks with " + attack;
        }
    }
}
