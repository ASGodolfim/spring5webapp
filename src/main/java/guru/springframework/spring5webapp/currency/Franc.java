package guru.springframework.spring5webapp.currency;

public class Franc {
    int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times (int multiplier) {
        return new Franc(amount * multiplier);
    }

    public boolean equals(Object obj) {
        Franc franc = (Franc) obj;
        return amount == franc.amount;
    }
}
