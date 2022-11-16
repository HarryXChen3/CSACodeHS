package codehs.unit_5._4;

public class Exercise_5_4_5 {
    public static class Comment {
        private final String poster;
        private final String comment;
        private final String date;

        public Comment(final String poster, final String comment, final String date) {
            this.poster = poster;
            this.comment = comment;
            this.date = date;
        }

        @Override
        public String toString() {
            return comment + "\n--" + poster + "(" + date + ")";
        }

        public String getPoster() {
            return poster;
        }

        public String getComment() {
            return comment;
        }

        public String getDate() {
            return date;
        }
    }

    public static void main(final String[] args) {
        final Comment comment0 = new Comment("me", "why", "never");
        final Comment comment1 = new Comment("you", "why", "when");

        System.out.println(comment0.getComment());
        System.out.println(comment1.getPoster());
    }
}
