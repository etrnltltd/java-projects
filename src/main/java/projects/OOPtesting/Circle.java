package projects.OOPtesting;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}
