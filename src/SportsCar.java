public class SportsCar extends BasicCar {

    public SportsCar(String brand, String model, double price){
        super(brand, model, price);
    }

    @Override
    public String getDescription() {
        return "Sports Car (" + getBrand() + ": " + getModel() + ") was build with price: " + getPrice() + "$";
    }
}
