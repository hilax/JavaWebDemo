package day1.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        //1.获取请求参数,封装成对象
        String name = req.getParameter("username");
//        //get方式 已iso-8859-1的方式编码成二进制
//        byte[] bs = name.getBytes("ISO-8859-1");
//        //post方式
//        System.out.println(new String(bs, "UTF-8"));
        System.out.println(name);
        String password = req.getParameter("password");
        System.out.println("password = " + password);
        System.out.println(new User(name, password));
        //2.调用业务方法处理请求
        //3.控制界面跳转
    }
}
