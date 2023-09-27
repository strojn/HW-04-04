public class Car {
    int year; //рік
    double speed; //швидкість
    int weight;//вага
    String color;//колір
    public Car(int year, double speed, int weight, String color) {
        this(year, speed, weight);
        this.color = color;
    }
    public Car(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
    }
    public Car(int year, double speed) {
        this(year);
        this.speed = speed;
    }
    public Car(int year) {
        this.year = year;
    }
    public Car() {
    }
}
