import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList <Car> cars = new ArrayList<>();
        Car car = new Car();
        String response;

        do{
            System.out.println("Enter your car color: ");
            String color = input.nextLine();
            car.setColor(color);

            System.out.println("Enter your car name: ");
            String name = input.nextLine();
            car.setName(name);

            System.out.println("Enter your car speed: ");
            int speed = input.nextInt();
            input.nextLine();
            car.setSpeed(speed);

            cars.add(car);

            for(Car c : cars) {
                c.getDescription();
            }
            System.out.println("Do you want to add another car? y/n");
            response = input.nextLine().toLowerCase(Locale.ROOT);

        }while(response.charAt(0) == 'y');






//        Car car1 = new Car("red", "Porsche", 90);
//        Car car2 = new Car();
//        car2.setColor("blue");
//        car2.setName("Jetta");
//
//        car1.start();
//        car2.start();
//        car1.accelerate();
//        car2.accelerate();
//
//        car1.go();
//        car1.stop();
//        car1.setSpeed(50);
//        System.out.println("The " + car1.getColor() + " " + car1.getName()+ " just passed the " + car2.getColor() + " " + car2.getName());
//        car2.check();

    }
}
