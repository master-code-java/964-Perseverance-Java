package Currency;

public class Dolar extends Money {

    public Dolar(){
        super("Currency.Dolar",0, "U$");
    }

    public Dolar(double value) {
        super("Currency.Dolar", value, "U$");
    }

    @Override
    public String symbol() {
        return null;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public Money convert(Money money) {
        return null;
    }
}
