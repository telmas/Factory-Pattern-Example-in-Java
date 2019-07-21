public class CarFactory {

    public CarFactory(){

    }

    public Car buildCar(int carTypeID){
        switch (carTypeID){
            case CarTypeConstants.OPTION_SMALL_CAR:
                return new SmallCar("Toyota", "Yaris", 3000.0);
            case CarTypeConstants.OPTION_SEDAN_CAR:
                return new SedanCar("Ford", "Mondeo", 5000.0);
            case CarTypeConstants.OPTION_SPORTS_CAR:
                return new SportsCar("Ford", "Mustang", 7000.0);
            case CarTypeConstants.OPTION_LUXURY_CAR:
                return new LuxuryCar("Mercedes-Benz", "S-Class", 10000.0);
            default:
                System.out.println("No such car type.");
        }
        return null;
    }
}
