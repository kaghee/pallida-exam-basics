import java.util.ArrayList;

public class CandyShop {
    public static final Candy CANDY = new Candy();
    public static final Lollipop LOLLIPOP = new Lollipop();
    ArrayList<Sweets> storage = new ArrayList<>();
    double income;
    int sugarStock;

    public CandyShop(int sugarStock) {
        this.sugarStock = sugarStock;
    }

    public void createSweets(Sweets sweets) {
        if (sweets instanceof Candy) {
            storage.add(new Candy());
            CANDY.stock++;
            sugarStock -= CANDY.sugarAmount;
        } else if (sweets instanceof Lollipop) {
            storage.add(new Lollipop());
            LOLLIPOP.stock++;
            sugarStock -= LOLLIPOP.sugarAmount;
        }
    }

    public void raise(int percent) {
        CANDY.price += CANDY.price * percent / 100;
        LOLLIPOP.price += LOLLIPOP.price * percent / 100;
    }

    public void sell(Sweets sweets, int amount) {
        for (int i = 0; i < amount; i++) {
            income += sweets.price;
            if (sweets instanceof Candy) {
                CANDY.stock--;
            } else if (sweets instanceof Lollipop) {
                LOLLIPOP.stock--;
            }
        }
    }

    public void buySugar(int sugAmount) {
        sugarStock += sugAmount;
        income -= sugAmount / 10;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Inventory: " + CANDY.stock + " candies, " + LOLLIPOP.stock + " lollipops, Income: " + income +
                    "$, Sugar: " + sugarStock + "gr");
        return sb.toString();
    }
}
