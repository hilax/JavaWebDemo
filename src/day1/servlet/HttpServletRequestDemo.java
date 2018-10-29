package day1.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/req")
public class HttpServletRequestDemo extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//       获取请求的参数
        //根据参数的名称获取参数的值
        System.out.println(req.getParameter("userName"));
        System.out.println(req.getParameterMap());
        //获取请求方式
        System.out.println(req.getMethod());
        //获取请求的资源
        System.out.println(req.getRequestURI());
//        返回地址中的数据
        System.out.println(req.getRequestURL());
//        返回上下文路径的值
        System.out.println(req.getContextPath());
//        客户端的ip地址
        System.out.println(req.getRemoteAddr());
        //获取请求头的信息
        System.out.println(req.getHeader("User-Agent"));
    }


}
