package Currency;

public abstract class Money {

    private double value;

    public Money(double value){
        this.value = value;
    }
    public abstract String symbol();

    public abstract String name();

    public abstract Money convert(Money money);


    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Currency.Money{" +
                "value=" + value +
                '}';
    }
}
