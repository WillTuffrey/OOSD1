package CarStockSystem;

public class BrakeRotor extends StockItem {
    protected String brand;
    protected int circumference;
    protected boolean front; // In this case, if true the rotor is on the front, if false it is on the rear

    public BrakeRotor(String Code, int Quantity, double Price, String Brand, int Circumference, boolean Front) {
        super(Code, Quantity, Price);
        this.brand = Brand;
        this.circumference = Circumference;
        this.front = Front;
    }

    public String GetBrand() {
        return brand;
    }

    public void SetBrand(String SetBrand) {
        brand = SetBrand;
    }

    public int GetCircumference() {
        return circumference;
    }

    public void SetCircumference(int SetCircumference) {
        circumference = SetCircumference;
    }

    public boolean GetFront() {
        return front;
    }
    public void SetFront(boolean SetFront) {
        front = SetFront;
    }

    @Override
    public String GetStockName() {
        return (GetBrand() + (GetFront() ? " Front Brake Disc " : " Rear Brake Disc "));
    }

    @Override
    public String GetStockDescription() {
        return (GetCircumference() + "mm Brake Disc by " + GetBrand() + (GetFront() ? " (Front)" : " (Rear)"));
    }
}
