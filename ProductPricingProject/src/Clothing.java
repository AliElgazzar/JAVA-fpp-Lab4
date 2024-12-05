public class Clothing extends product {
    private String brand;
    private double discountpercentage;


    public Clothing(String ProductName, double Price, String Brand, double discountpercentage) {
        super(ProductName, Price);
        this.brand = Brand;
        this.discountpercentage = discountpercentage;
    }

    public double Getdiscountprice() {
        double discountprice = super.GetPrice() - (super.GetPrice() * discountpercentage / 100);
        super.SetPrice(discountprice);
        return discountprice;
    }

    public void Setdiscountpercentage(double discountpercentage) {
        this.discountpercentage = discountpercentage;
    }

    public void SetBrandName(String brand) {
        this.brand = brand;
    }

    public String GetBrandName() {
        return brand;
    }

    public double Getdiscountpercentage() {
        return discountpercentage;
    }


    @Override
    public String toString() {
        return( super.toString() + "Brand: " + brand + "  Discount Percentage: " + discountpercentage);
    }
    @Override
    public double GetPrice()
    {
        return super.GetPrice();
    }
}



