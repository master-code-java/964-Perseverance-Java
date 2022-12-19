package Currency;

public class Euro extends Money {

    public Euro(){
        super("Euro",0, "€");
    }

    public Euro(String name, double value) {
        super(name, value, "€");
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
