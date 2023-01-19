package wallet_stuff;

import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private static int COUNT = 0;
    private int id;     //unique number of the wallet
    private List<Coin> coins;

    public Wallet() {
        this.coins = new ArrayList<>();
        this.id = ++COUNT;
    }

    public int getId() {
        return id;
    }

    public void putMoney(Coin money) {
        coins.add(money);
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "id=" + id +
                ", coins=" + coins +
                '}';
    }
}
