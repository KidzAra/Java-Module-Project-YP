import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int car1speed;
        int car2speed;
        int car3speed;

        System.out.println("Введите название первой машины");
        String car1name = scanner.nextLine();
        System.out.println("Введите название второй машины");
        String car2name = scanner.nextLine();
        System.out.println("Введите название третьей машины");
        String car3name = scanner.nextLine();

        System.out.println("Введите скорость первой машины");
        while(true) {
            car1speed = scanner.nextInt();
            if (car1speed > 0 && car1speed <= 250){
                break;
            } else {
                System.out.println("Скорость должна быть не меньше 0 и не больше 250");
            }
        }
        System.out.println("Введите скорость второй машины");
        while(true) {
            car2speed = scanner.nextInt();
            if (car2speed > 0 && car2speed <= 250){
                break;
            } else {
                System.out.println("Скорость должна быть не меньше 0 и не больше 250");
            }
        }
        System.out.println("Введите скорость третьей машины");
        while(true) {
            car3speed = scanner.nextInt();
            if (car3speed > 0 && car3speed <= 250){
                break;
            } else {
                System.out.println("Скорость должна быть не меньше 0 и не больше 250");
            }
        }


        car firstCar = new car(car1name, car1speed);
        car secondCar = new car(car2name, car2speed);
        car thirdCar = new car(car3name, car3speed);

        System.out.println(race.race(firstCar, secondCar, thirdCar));

    }
}