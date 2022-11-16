package codehs.unit_5._7;

public class Exercise_5_7_7 {
    public static class Team {
        public static int totalTeams;
        public static final int minTeams = 6;

        public Team() {
            totalTeams++;
        }

        public static boolean tournamentReady() {
            return totalTeams >= minTeams;
        }
    }
}
