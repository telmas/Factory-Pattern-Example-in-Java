public class SedanCar extends BasicCar{

    public SedanCar(String brand, String model, double price){
        super(brand, model, price);
    }

    @Override
    public String getDescription() {
        return "Sedan Car (" + getBrand() + ": " + getModel() + ") was build with price: " + getPrice() + "$";
    }
}
