package guru.springframework.spring5webapp;

public class Dollar {

    int amount;

    public Dollar(int amount){
        this.amount = amount;
    }

    Dollar times (int multiplier){
        return new Dollar (amount * multiplier);
    }
}
