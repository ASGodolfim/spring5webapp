package guru.springframework.spring5webapp.currency;

public class Money {
    protected int amount;

    public boolean equals(Object obj){
        Money money = (Money) obj;
        return amount == money.amount
                && this.getClass().equals(obj.getClass());
    }
}
