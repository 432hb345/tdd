package martak;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    Money multiply(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}
