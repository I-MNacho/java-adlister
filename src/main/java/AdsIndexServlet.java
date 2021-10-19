import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/ads")
public class AdsIndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Get the adsDao from DaoFactory
        Ads adsDao = DaoFactory.getAdsDao();
        //Get list of ad objects from DAO
        List<Ad> ads = adsDao.all();
        //Set the ad objects on the request object
        request.setAttribute("ads", ads);
        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);
    }

}
