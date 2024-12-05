public class Clothing extends Product{
    private String brand;
    private double discountPercentage;

    public Clothing(String productName,double price, String brand, double discountPercentage) {
        super(productName,price);
        this.brand = brand;
        this.discountPercentage = discountPercentage;
        setPrice(price);
    }

    @Override
    public double getPrice() {
        return super.getPrice() - super.getPrice() * discountPercentage / 100;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nBrand: " + brand + "\nDiscount: " + discountPercentage + "\nPrice After Discount: " + this.getPrice());
    }
}
