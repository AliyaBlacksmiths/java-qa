package org.ya.lessons2;

public class Line {

        private final Point p1;
        private final Point p2;

        public Line(Point p1, Point p2) {
            this.p1 = p1;
            this.p2 = p2;
        }

        public static Line of(double x1, double y1, double x2, double y2) {
            return new Line(new Point(x1, y1), new Point(x2, y2));
        }

        public Point getP1() {
            return p1;
        }

        public Point getP2() {
            return p2;
        }
}
