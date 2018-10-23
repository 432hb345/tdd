package martak;

public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    Dollar multiply(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}
