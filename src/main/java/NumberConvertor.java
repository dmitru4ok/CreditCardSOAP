    import java.math.BigDecimal;
    import java.math.BigInteger;

    import com.dataaccess.webservicesserver.NumberConversion;
    import com.dataaccess.webservicesserver.NumberConversionSoapType;

    public class NumberConvertor {
        public NumberConvertor() {}

        public String convert2dollars(String inputStr) {
            BigDecimal input_D = new BigDecimal(inputStr);
            NumberConversion NC_service = new NumberConversion();
            NumberConversionSoapType NC_serviceSOAP = NC_service.getNumberConversionSoap();
            return NC_serviceSOAP.numberToDollars(input_D);
        }

    }