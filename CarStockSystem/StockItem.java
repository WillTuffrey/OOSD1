package CarStockSystem;

public class StockItem {
    protected String stockCode, errorMessage;
    protected int quantityInStock;
    protected double price;

    public StockItem(String Code, int Quantity, double Price) {
        stockCode = Code;
        quantityInStock = Quantity;
        price = Price;
        errorMessage = "";
    }

    public String GetStockName() {
        return "Unknown Stock Name";
    }
    public String GetStockDescription() {
        return "Unknown Stock Description";
    }
    public double GetVAT() {
        return 0.2;
    }
    public String GetStockCode() {
        return stockCode;
    }
    public void SetStockCode(String setCode) {
        stockCode = setCode;
    }
    public int GetQuantityInStock() {
        return quantityInStock;
    }
    public void SetQuantityInStock(int setQuantity) {
        quantityInStock = setQuantity;
    }
    public double GetPrice() {
        return price;
    }
    public void SetPrice(double setPrice) {
        price = setPrice;
    }

    public boolean AddStock(int amount) {
        if (amount < 1) {
            errorMessage = "Quantity must be greater than 0";
            return false;
        }
        if (quantityInStock + amount > 100) {
            errorMessage = "Stock will exceed the maximum limit of 100 units";
            return false;
        }
        quantityInStock += amount;
        return true;
    }
    public boolean SellStock(int amount) {
        if (amount < 1) {
            errorMessage = "Quantity must be greater than 0";
            return false;
        }
        if (amount > quantityInStock) {
            errorMessage = "There are not enough items in stock";
            return false;
        }
        quantityInStock -= amount;
        return true;
    }

    public String ToString() {
        return "Stock Type: " + GetStockName()
                + "\nDescription: " + GetStockDescription()
                + "\nStock Code: " + GetStockCode()
                + "\nPrice Without VAT: " + GetPrice()
                + "\nPrice With VAT: " + (GetPrice() + GetPrice() * GetVAT())
                + "\nTotal unit in stock: " + GetQuantityInStock();
    }

    public String ReturnError() {
        return errorMessage;
    }
}