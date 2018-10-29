package day1.servlet;

import javax.servlet.*;
import java.io.IOException;

public class EncoderServlet implements Servlet {
    private  ServletConfig servletConfig;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String enconding = this.servletConfig.getInitParameter("encoding");
        if ("GBK".equals(enconding)) {
            System.out.println("中文");
        }else {
            System.out.println("english");
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
