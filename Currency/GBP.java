package Currency;

public class GBP extends Money{


    public GBP(String name, double value, String symbol) {
        super(name, value, symbol);
    }

    @Override
    public String symbol() {
        return "GBP";
    }

    @Override
    public String name() {
        return "Libra";
    }

    @Override
    public Money convert(Money money) {
        return null;
    }
}
