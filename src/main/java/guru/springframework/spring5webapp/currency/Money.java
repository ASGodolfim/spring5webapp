package guru.springframework.spring5webapp.currency;

public abstract class Money {
    protected int amount;
    public String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    protected String currency(){
        return currency;
    }
    public abstract Money times(int multiplier);
    public static Money dollar (int amount){
        return new Dollar (amount, "USD");
    }
    public static Money franc (int amount){
        return new Franc(amount, "CHF");
    }
    public boolean equals(Object obj){
        Money money = (Money) obj;
        return amount == money.amount
                && this.getClass().equals(obj.getClass());
    }
}
