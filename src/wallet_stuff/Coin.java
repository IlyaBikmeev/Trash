package wallet_stuff;

public class Coin {
    private int amount;
    private CoinType type;

    public Coin(int amount, CoinType type) {
        this.amount = amount;
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public CoinType getType() {
        return type;
    }

    public double evaluate(double rate) {
        return amount * rate;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "amount=" + amount +
                ", type=" + type +
                '}';
    }
}
