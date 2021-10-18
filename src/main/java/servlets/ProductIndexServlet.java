package servlets;
import dao.DaoFactory;
import dao.ProductInMemoryDao;
import model.Product;
import model.Products;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/products")
public class ProductIndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Products productsDao = DaoFactory.getProductsDao();

        List<Product> products = productsDao.findAll();

        request.setAttribute("products", products);

        //redirect code
        request.getRequestDispatcher("products.jsp").forward(request, response);


//one way to display
//        List<Product> products = productsDao.findAll();
//another way to display
//request.setAttribute("products", productsDao.findAll());
    }



}
