public class LuxuryCar extends BasicCar {

    public LuxuryCar(String brand, String model, double price){
        super(brand, model, price);
    }

    @Override
    public String getDescription() {
        return "Luxury Car (" + getBrand() + ": " + getModel() + ") was build with price: " + getPrice() + "$";
    }
}
