import java.util.Scanner;

public class CarDealership {

    public static void main(String[] args) {
        Car orderedCar = null;
        CarFactory carFactory = new CarFactory();
        Scanner userInput = new Scanner(System.in);
        int option = -1;
        while(option == -1) {
            System.out.print("\nWhat type of car would you like to order? (SM / SE / SP / LU): ");
            if (userInput.hasNextLine()) {
                String chosenTypeOfCar = userInput.nextLine();
                chosenTypeOfCar = chosenTypeOfCar.trim().toUpperCase();
                switch (chosenTypeOfCar) {
                    case "SM":
                        option = CarTypeConstants.OPTION_SMALL_CAR;
                        break;
                    case "SE":
                        option = CarTypeConstants.OPTION_SEDAN_CAR;
                        break;
                    case "SP":
                        option = CarTypeConstants.OPTION_SPORTS_CAR;
                        break;
                    case "LU":
                        option = CarTypeConstants.OPTION_LUXURY_CAR;
                        break;
                }
                orderedCar = carFactory.buildCar(option);
                if (orderedCar != null) {
                    System.out.println(orderedCar.getDescription());
                } else {
                    System.out.println("Please enter SM, SE, SP or LU next time");
                }
            }
        }
    }
}
