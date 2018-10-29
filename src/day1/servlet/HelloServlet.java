package day1.servlet;

import javax.servlet.*;
import java.io.IOException;

public class HelloServlet implements Servlet {


    //在对象创建出来的时候创建一次
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("HelloServlet.init");
    }

    public HelloServlet() {
        System.out.println("HelloServlet.HelloServlet");
    }

    //  返回当前servlet配置信息
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    //  服务方法,每一次请求都会被调用
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
    }

    //获取返回servlet的信息,作者版权,没有什么用的方法
    @Override
    public String getServletInfo() {
        return null;
    }

    //Tomcat关闭的时候来做的一些扫尾的事情
    @Override
    public void destroy() {
        System.out.println("HelloServlet.destroy");
    }
}
