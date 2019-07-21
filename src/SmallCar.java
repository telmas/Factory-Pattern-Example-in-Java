public class SmallCar extends BasicCar {

    public SmallCar(String brand, String model, double price){
        super(brand, model, price);
    }

    @Override
    public String getDescription() {
        return "Small Car (" + getBrand() + ": " + getModel() + ") was build with price: " + getPrice() + "$";
    }
}
