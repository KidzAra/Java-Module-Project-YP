import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int car1speed;
        int car2speed;
        int car3speed;

        String car1name = null;
        String car2name = null;
        String car3name = null;

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название машины " + (i + 1) + ":");
            String carName = scanner.nextLine();
            if (i == 0) {
                car1name = carName;
            } else if (i == 1) {
                car2name = carName;
            } else if (i == 2) {
                car3name = carName;
            }
        }

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

        System.out.println("Самая быстрая машина:" + race.race(firstCar, secondCar, thirdCar));

    }
}