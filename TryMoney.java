import Currency.Dolar;
import Currency.Money;
import Currency.Real;

public class TryMoney {

    public static void main(String[] args) {

        /**
         *  - Currency.Real
         *  - Currency.Euro
         *  - Currency.Dolar
         *
         */

        Money emptyReal = new Real();
        System.out.println(emptyReal);

        Real real = new Real(1000.00);
        System.out.println(real);

        Real real1 = new Real();
        Money convert = real1.convert(new Dolar(1000));
        System.out.println(convert);
    }

}
