public class Circle {
    double radius;
    
    Circle(double r) {
        this.radius = r;
    }

    void calculateArea() {
        System.out.println("The Area of Circle with radius "+ this.radius + " is " +Math.PI*radius*radius);
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(2);
        c1.calculateArea();
    }

    // The Area of Circle with radius 2.0 is 12.566370614359172
}
