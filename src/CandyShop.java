import java.util.ArrayList;

public class CandyShop {
    ArrayList<Sweets> storage;
    int income;
    int sugarStock;

    public CandyShop(int sugarStock) {
        this.sugarStock = sugarStock;
    }

    public void createSweets(String type) {
        storage = new ArrayList<>();
        Candy tempC = new Candy();
        Lollipop tempL= new Lollipop();
        if (type == "candy") {
            storage.add(new Candy());
            sugarStock -= tempC.sugarAmount;
        } else if (type == "lollipop") {
            storage.add(new Lollipop());
            sugarStock -= tempL.sugarAmount;
        }
    }
}
