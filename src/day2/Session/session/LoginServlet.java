package day2.Session.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print("我要跳转了");
        System.out.println("我要跳转了");
        //请求转发到listServlet
        //1.forward方法
        //req.getRequestDispatcher("/list").forward(req, resp);
        //2.URL重定向的方式跳转
        resp.sendRedirect("/list.jsp");
        System.out.println("我已跳转了");
        out.print("我已跳转了");
    }
}
