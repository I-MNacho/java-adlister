import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String crust = request.getParameter("size");
        String sauce = request.getParameter("crust");
        String size = request.getParameter("sauce");
        String[] toppings = request.getParameterValues("toppings");
        String address = request.getParameter("address");


        System.out.println(crust);
        System.out.println(sauce);
        System.out.println(size);
        System.out.println(request.getParameter(address));

        for(String topping : toppings){
            System.out.println(topping);
        }
//response.sendRedirect("/orders"); this is how you would redirect someone to a page after submitting

    }
}