import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
        int car1speed = validInput.getValidSpeed(scanner);
        System.out.println("Введите скорость второй машины");
        int car2speed = validInput.getValidSpeed(scanner);
        System.out.println("Введите скорость третьей машины");
        int car3speed = validInput.getValidSpeed(scanner);


        car firstCar = new car(car1name, car1speed);
        car secondCar = new car(car2name, car2speed);
        car thirdCar = new car(car3name, car3speed);

        System.out.println("Самая быстрая машина:" + race.race(firstCar, secondCar, thirdCar));

    }
}