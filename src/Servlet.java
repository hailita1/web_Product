import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns = "/product")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("product description");
        Float price = Float.parseFloat(request.getParameter("list price"));
        Float discountPercent = Float.parseFloat(request.getParameter("discount percent"));

        double chietKhau = price * discountPercent * 0.1;
        double giaSp = price - chietKhau;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Dac trung: " + description + "<h1>");
        writer.println("<h1>Luong triet khau: " + chietKhau + "<h1>");
        writer.println("<h1>Gia san pham: " + giaSp + "<h1>");
        writer.println("</html>");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
