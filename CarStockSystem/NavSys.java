package CarStockSystem;

public class NavSys extends StockItem {
    public NavSys(String Code, int Quantity, double Price) {
        super(Code, Quantity, Price);
    }

    @Override
    public String GetStockName() {
        return ("Navigation system");
    }

    @Override
    public String GetStockDescription() {
        return ("GeoVision Sat Nav");
    }

//    @Override
//    public String ToString() {
//        return super.ToString();
//    }
}
