//import entity.contact;
//
//import javax.servlet.*;
//import javax.servlet.http.*;
//import javax.servlet.annotation.*;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//@WebServlet("/contacts")
//public class ContactsIndexServlet extends HttpServlet {
//
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        //pass the string "Ignacio" to the view
//        String name = "Ignacio";
//        //set the attribute to the request object
//        request.setAttribute("name", name);
//        request.getRequestDispatcher("contacts.jsp").forward(request, response); //responsible for taking you to the request page
//    }
//
//    //assume that this being read from a DB
//    List<contact> contacts = new ArrayList<>(Arrays.asList(
//        new contact(1, "Fred Smith","fred@email.com", "123 Lane lane", 800000000, true),
//        new contact(2, "Doug Sanders","doug@email.com", "222 Lane lane", 900000000, true),
//        new contact(3, "Bobby Brown","bobby@email.com", "333 Lane lane", 500000000, true),
//        new contact(4, "Louise Smith","louise@email.com", "444 Lane lane", 400000000, false)
//    ));
//
//    // pass list of contacts to contacts.jsp
//    request.setAttribute("name", name);
//    request.setAttribute("contacts", contacts);
//
//    request.getRequestDispatcher("contacts.jsp").forward(request, response);
//
//
//}
