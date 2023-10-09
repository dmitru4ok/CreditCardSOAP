import com.xignite.services.CrossRate;
import com.xignite.services.XigniteCurrencies;
import com.xignite.services.XigniteCurrenciesSoap;

public class CurrencyConvertor  {

    public CurrencyConvertor() {}


    public double DollarsToUAH(String inputData) {
        XigniteCurrenciesSoap service = new XigniteCurrencies().getXigniteCurrenciesSoap();
        CrossRate s = service.getLatestCrossRate("USD", "UAH");
//        s.setIdentity("5B217D05FE494AF1A1FAD819C88CB1BB");
        return s.getRate();
    }
}
