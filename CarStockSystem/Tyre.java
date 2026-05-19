package CarStockSystem;

public class Tyre extends StockItem {
    protected String brand, model;
    protected int circumference;

    public Tyre(String Code, int Quantity, double Price, String Brand, String Model, int Circumference) {
        super(Code, Quantity, Price);
        this.brand = Brand;
        this.model = Model;
        this.circumference = Circumference;
    }

    public String GetBrand() {
        return brand;
    }

    public void SetBrand(String SetBrand) {
        brand = SetBrand;
    }

    public String GetModel() {
        return model;
    }

    public void SetModel(String SetModel) {
        model = SetModel;
    }

    public int GetCircumference() {
        return circumference;
    }

    public void SetCircumference(int SetCircumference) {
        circumference = SetCircumference;
    }

    @Override
    public String GetStockName() {
        return (GetBrand() + " " + GetModel() + " tyre");
    }

    @Override
    public String GetStockDescription() {
        return (GetCircumference() + "\" " + GetModel() + " tyre by " + GetBrand());
    }
}
