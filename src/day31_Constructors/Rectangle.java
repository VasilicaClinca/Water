package day31_Constructors;

public class Rectangle {

    public double lenght, width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    public double calclArea(){
        return lenght * width;
    }

    public double calcPerimeter (){
        return 2 * (lenght + width);
    }

    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", width=" + width +
                ", area=" + calclArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
