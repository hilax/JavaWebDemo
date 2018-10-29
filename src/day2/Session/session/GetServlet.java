package day2.Session.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/get")
public class GetServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.request作用域
       Integer num = (Integer)req.getAttribute("NUM_IN_REQ");
        if (num == null) {
            req.setAttribute("NUM_IN_REQ",1);
        }else {
            req.setAttribute("NUM_IN_REQ",num + 1);
        }
        //2.session作用域
        HttpSession session = req.getSession();
        Integer numSession = (Integer) session.getAttribute("NUM_IN_SESSION");
        if (numSession == null) {
            req.setAttribute("NUM_IN_SESSION",1);
        }else {
            req.setAttribute("NUM_IN_SESSION",numSession + 1);
        }
        //3.application作用域
        super.getServletContext().setAttribute("name","name");
        System.out.println(super.getServletContext().getAttribute("name"));
    }
}
