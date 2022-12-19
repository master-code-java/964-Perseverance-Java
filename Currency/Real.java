package Currency;

public class Real extends Money {

    private String country;
    private static final String SYMBOL ="R$";
    private static  final String NAME ="Real";
    public static final double PARITY = 1.5;

    private static final String COUNTRY ="Brasil";

    public Real() {
        super(0);
        this.country = COUNTRY;
    }

    public Real(Double value) {
        super(value);
        this.country = COUNTRY;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String symbol() {
        return SYMBOL+".";
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public Money convert(Money money) {
        /** FORMULA DE CONVERSÂO É: quantidade * paridade **/
       return new Real(money.getValue()* PARITY);

    }

    @Override
    public double getValue() {
        return super.getValue() * 1.5;
    }

    @Override
    public String toString() {
        return "Real{" +
                super.toString() +
                "value='" + getValue() + '\'' +
                "country='" + country + '\'' +
                '}';
    }
}
