import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/form")
public class CookiesEx extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        String n1 = req.getParameter("name");
        //Cookie cookie = new Cookie("key", "123");
        PrintWriter out = res.getWriter();
        boolean uvisit = false;

        Cookie[] cookies = req.getCookies();
        
        if(cookies != null){
            for(int i=0; i<cookies.length; i++){
                Cookie c = cookies[i];
                String name = c.getName();
                String val = c.getValue();
                
                if(name.equals("key") && val.equals("123")){
                    out.print("Welcome Back " +n1);
                    uvisit = true;
                    break;
                }
            }
        }

        if(uvisit == false){
            
            Cookie c1 = new Cookie("key", "123");
            res.addCookie(c1);
            out.print("Welcome " +n1);
        }
    }
}
