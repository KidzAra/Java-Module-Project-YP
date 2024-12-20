import java.util.Scanner;

public class validInput {

    public static int getValidSpeed(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine();
            try {
                int carSpeed = Integer.parseInt(input);
                if (carSpeed > 0 && carSpeed <= 250) {
                    return carSpeed;
                } else {
                    System.out.println("Скорость должна быть не меньше 0 и не больше 250");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неправильный тип данных");
            }
        }
    }
}

