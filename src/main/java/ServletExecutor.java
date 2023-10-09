import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// servlet combines 2 soap services
@WebServlet(value="/mainExec")
public class ServletExecutor extends HttpServlet {

    public ServletExecutor() {
        super();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        NumberConvertor client = new NumberConvertor();
        CurrencyConvertor currencyService = new CurrencyConvertor();

        String value = request.getParameter("value");
        PrintWriter out = response.getWriter();
        if (value.isEmpty()){
            out.write("error: Please, provide a value!");
        } else {
            String result = client.convert2dollars(value);
            double inUah = currencyService.DollarsToUAH(value);
            out.write(result + ';' + inUah);
        }
        out.flush();
        out.close();
    }
}
