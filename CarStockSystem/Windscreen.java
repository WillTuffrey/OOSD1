package CarStockSystem;

public class Windscreen extends StockItem {
    protected String brand;
    protected double weight;
    protected boolean framed;

    public Windscreen(String Code, int Quantity, double Price, String Brand, double Weight, boolean Framed) {
        super(Code, Quantity, Price);
        this.brand = Brand;
        this.weight = Weight;
        this.framed = Framed;
    }

    public String GetBrand() {
        return brand;
    }

    public void SetBrand(String SetBrand) {
        brand = SetBrand;
    }

    public double GetWeight() {
        return weight;
    }

    public void SetWeight(double SetWeight) {
        weight = SetWeight;
    }

    public boolean GetFramed() {
        return framed;
    }

    public void SetFramed(boolean SetFramed) {
        framed = SetFramed;
    }

    @Override
    public String GetStockName() {
        return (GetBrand() + " " + GetWeight() + "Kg Windscreen");
    }

    @Override
    public String GetStockDescription() {
        return ((GetFramed() ? "Framed " : "") + GetBrand() + " Windscreen (" + GetWeight() + "Kg)");
    }
}
