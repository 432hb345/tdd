package martak;

public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    Money multiply(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
