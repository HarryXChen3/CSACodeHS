package codehs.unit_5._5;

public class Exercise_5_5_5 {
    public static class Rectangle {
        private int width;
        private int height;

        /**
         * This is the constructor to create a Rectangle.
         * To create a Rectangle we need to know its width
         * and height.
         */
        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        // Put your methods here

        /**
         * This is the toString method. It returns a String
         * representation of the object.
         */
        public String toString()
        {
            return "Rectangle width: " + width + ", Rectangle height: " + height;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getArea() {
            return height * width;
        }

        public int getPerimeter() {
            return 2 * (height + width);
        }
    }

}
