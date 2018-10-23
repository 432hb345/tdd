package martak;

public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    void multiply(int multiplier) {
        amount *= multiplier;
    }

}
