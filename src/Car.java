
public class Car {
    private String color;
    private String name;
    private int speed;

    public Car(){

    }
    public Car(String color, String name, int speed){
        this.color = color;
        this.name = name;
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        //System.out.printf("The speed is %d mph\n", speed);
    }

    public int getSpeed() {
        return speed;
    }                                                                                                                                       

    public String start(){
        return "The " + color + " " + name + " is starting";
    }

    public void accelerate(){
        System.out.println("The " + color + " " + name + " is accelerating");
    }

    public void go(){
        System.out.println("The " + color + " " + name + " is going " + speed + " mph");
    }

    public void stop(){
        System.out.println("The " + color + " " + name + " is stopped");
    }

    public void check(){
        System.out.println("The " + color + " " + name + " has stopped to have its emissions checked");
    }

    public void getDescription(){
        System.out.printf("Color: %s\nName: %s\nSpeed: %d\n", color, name, speed);
    }

}
