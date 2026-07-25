import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class form extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        res.setContentType("text/html");

        PrintWriter pw = res.getWriter();

        pw.print("<h2><i><u>Form Data</u></i></h2>");
        pw.print("<br>");

        String nm = req.getParameter("email");
        String pass = req.getParameter("password");
        String contry = req.getParameter("contry");

        pw.print("Username : " + nm + "<br>");
        pw.print("Password : " + pass + "<br>");
        pw.print("Contry : " + contry + "<br>"); 

    }
}