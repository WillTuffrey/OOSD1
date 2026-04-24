package code;

public class StockItem {
    private String stockCode;
    private int quantityInStock;
    private double price;
    public StockItem(String Code, int Quantity, double Price) {
        stockCode = Code;
        quantityInStock = Quantity;
        price = Price;
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
            // Display error: "Quantity must be greater than 0."
            return false;
        }
        if (quantityInStock + amount > 100) {
            // Display error: "Cannot buy as the total stock will exceed 100 units."
            return false;
        }
        quantityInStock += amount;
        return true;
    }
    public boolean SellStock(int amount) {
        if (amount < 1) {
            // Display error: "Quantity must be greater than 0."
            return false;
        }
        if (amount > quantityInStock) {
            // Display error: "There are not enough items in stock."
            return false;
        }
        if (quantityInStock - amount < 0) {
            // Display error: "Cannot sell as the total stock will be lower than 0 units."
            return false;
        }
        quantityInStock -= amount;
        return true;
    }
    public String ToString() {
        return GetStockCode() + ", " + GetStockName() + ", " + GetStockDescription() + ", " + GetQuantityInStock() + ", " + GetPrice() + " (without VAT), " + (GetPrice() + GetPrice() * GetVAT()) + " (inc. VAT)";
    }
}
